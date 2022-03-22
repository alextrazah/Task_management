import React, { useState } from "react";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import {
  faAngleLeft,
  faEnvelope,
  faUnlockAlt,
} from "@fortawesome/free-solid-svg-icons";
import {
  faFacebookF,
  faGithub,
  faTwitter,
} from "@fortawesome/free-brands-svg-icons";
import {
  Col,
  Row,
  Form,
  Card,
  Button,
  FormCheck,
  Container,
  InputGroup,
} from "@themesberg/react-bootstrap";
import { Link, useHistory } from "react-router-dom";
import axios from "axios";
import { Routes } from "../../routes";
import BgImage from "../../assets/img/illustrations/signin.svg";
import Swal from "sweetalert2";



export default function Signin ()  {
  const history = useHistory(); 
  const [myForm, setMyForm] = useState({
    email: "",
    password: "",
  });
  const config = {
    headers: {
      'Content-Type': 'application/json'
      }
  };
 async function submit(){
   console.log(myForm);
   
   await axios
     .post("http://localhost:3000/api/v1/auth/login", myForm,config)
     .then((response) =>{
       console.log(response);
       localStorage.setItem("email", JSON.stringify(response?.data.email));
       localStorage.setItem("token", JSON.stringify(response?.data.idToken));
       if (response?.status === 200) {
       if (response?.data.role === 'admin') {
        history.go('/dashboard/overview');
       } else if (response?.data.role === 'user') {
        history.go('/dashboard/overview');
      }
    }
    else {
      console.log("2222222222222222222222222222222222222222222222222222222222222")

      Swal.fire({
        title: "Wrong Credentials",
            text: "Try to enter a valid mail or password",
            icon: "error",
            confirmButtonText: "Cool i'll try again",
      });
    }
     } )
      .catch(e => {
        
          Swal.fire({
            title: "Wrong Credentials",
            text: "Try to enter a valid mail or password",
            icon: "error",
            confirmButtonText: "Cool i'll try again",
          });
   })
  };
  return (
    <main>
      <section className="d-flex align-items-center my-5 mt-lg-6 mb-lg-5">
        <Container>
          <p className="text-center">
            <Card.Link
              as={Link}
              to={Routes.DashboardOverview.path}
              className="text-gray-700"
            >
              <FontAwesomeIcon icon={faAngleLeft} className="me-2" /> Back to
              homepage
            </Card.Link>
          </p>
          <Row
            className="justify-content-center form-bg-image"
            style={{ backgroundImage: `url(${BgImage})` }}
          >
            <Col
              xs={12}
              className="d-flex align-items-center justify-content-center"
            >
              <div className="bg-white shadow-soft border rounded border-light p-4 p-lg-5 w-100 fmxw-500">
                <div className="text-center text-md-center mb-4 mt-md-0">
                  <h3 className="mb-0">Sign in to our platform</h3>
                </div>
             
                  <Form.Group id="email" className="mb-4" >
                    <Form.Label>Your Email</Form.Label>
                    <InputGroup>
                      <InputGroup.Text>
                        <FontAwesomeIcon icon={faEnvelope} />
                      </InputGroup.Text>
                      <Form.Control
                        onChange={(e) =>
                          setMyForm({ ...myForm, email: e.target.value })
                        }
                        autoFocus
                        required
                        type="email"
                        placeholder="example@email.com"
                      />
                    </InputGroup>
                  </Form.Group>
                  <Form.Group>
                    <Form.Group id="password" className="mb-4">
                      <Form.Label>Your Password</Form.Label>
                      <InputGroup>
                        <InputGroup.Text>
                          <FontAwesomeIcon icon={faUnlockAlt} />
                        </InputGroup.Text>
                        <Form.Control
                          onChange={(e) =>
                            setMyForm({ ...myForm, password: e.target.value })
                          }
                          required
                          type="password"
                          placeholder="Password"
                        />
                      </InputGroup>
                    </Form.Group>
                    <div className="d-flex justify-content-between align-items-center mb-4">
                      <Form.Check type="checkbox">
                        <FormCheck.Input id="defaultCheck5" className="me-2" />
                        <FormCheck.Label
                          htmlFor="defaultCheck5"
                          className="mb-0"
                        >
                          Remember me
                        </FormCheck.Label>
                      </Form.Check>
                      <Card.Link className="small text-end">
                        Lost password?
                      </Card.Link>
                    </div>
                  </Form.Group>
                  <Button variant="primary" type="submit" className="w-100" onClick={() => submit()  }>
                    Sign in
                  </Button>
         

                <div className="mt-3 mb-4 text-center">
                  <span className="fw-normal">or login with</span>
                </div>
                <div className="d-flex justify-content-center my-4">
                  <Button
                    variant="outline-light"
                    className="btn-icon-only btn-pill text-facebook me-2"
                  >
                    <FontAwesomeIcon icon={faFacebookF} />
                  </Button>
                  <Button
                    variant="outline-light"
                    className="btn-icon-only btn-pill text-twitter me-2"
                  >
                    <FontAwesomeIcon icon={faTwitter} />
                  </Button>
                  <Button
                    
                    variant="outline-light"
                    className="btn-icon-only btn-pil text-dark"
                  >
                    <FontAwesomeIcon icon={faGithub} />
                  </Button>
                </div>
                <div className="d-flex justify-content-center align-items-center mt-4">
                  <span className="fw-normal">
                    Not registered?
                    <Card.Link
                      as={Link}
                      to={Routes.Signup.path}
                      className="fw-bold"
                    >
                      {` Create account `}
                    </Card.Link>
                  </span>
                </div>
              </div>
            </Col>
          </Row>
        </Container>
      </section>
    </main>
  );
};
