/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Asus
 */
public class User {

    public User(String nom_u, String prenom, String Date_Naissance, String numero_tel, int UID, String email, String address, String user_name, String mot_de_passe, String image_user) {
        
        this.nom_u = nom_u;
        this.prenom = prenom;
        this.Date_Naissance = Date_Naissance;
        this.numero_tel = numero_tel;
        this.UID = UID;
        this.email = email;
        this.address = address;
        this.user_name = user_name;
        this.mot_de_passe = mot_de_passe;
        this.image_user = image_user;
    }
int idU; 
String nom_u ;
String prenom ;
String Date_Naissance ;
String numero_tel; 
int UID ;
String email ;
String address ;
String user_name ;
String mot_de_passe ;
String image_user ;

    @Override
    public String toString() {
        return "User{" + "idU=" + idU + ", nom_u=" + nom_u + ", prenom=" + prenom + ", Date_Naissance=" + Date_Naissance + ", numero_tel=" + numero_tel + ", UID=" + UID + ", email=" + email + ", address=" + address + ", user_name=" + user_name + ", mot_de_passe=" + mot_de_passe + ", image_user=" + image_user + '}';
    }

    public int getIdU() {
        return idU;
    }

    public void setIdU(int idU) {
        this.idU = idU;
    }

    public String getNom_u() {
        return nom_u;
    }

    public void setNom_u(String nom_u) {
        this.nom_u = nom_u;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDate_Naissance() {
        return Date_Naissance;
    }

    public void setDate_Naissance(String Date_Naissance) {
        this.Date_Naissance = Date_Naissance;
    }

    public String getNumero_tel() {
        return numero_tel;
    }

    public void setNumero_tel(String numero_tel) {
        this.numero_tel = numero_tel;
    }

    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

    public String getImage_user() {
        return image_user;
    }

    public void setImage_user(String image_user) {
        this.image_user = image_user;
    }


    
}
