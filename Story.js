import Avatar from '@mui/material/Avatar';
import React from 'react'
import './Story.css'

function Story( { image, profileSrc, title }) {
    image = process.env.REACT_APP_API_IMAGE +"/pexels-cottonbro-7450291-1658143025794.jpg"
    return (
        <div style = {{ backgroundImage : `url(${image})`, backgroundRepeat: "no-repeat"}} className = "story">
        </div>
    )
}

export default Story