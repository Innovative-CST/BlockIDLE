import React from "react";
import { Container } from "@mui/material";
import "./css/HeroSection.css";

export default function HeroSection() {
  const handleSourceClick = () => {
    window.open("https://github.com/Innovative-CST/BlockIDLE", "_blank");
  };

  const handleFollowClick = () => {
    window.open("https://www.instagram.com/innovative_cst?igsh=MWQ0bDFsbGJ0NmpobQ==", "_blank");
  };
  return (
    <Container maxWidth="md">
      <section className="hero">
        <div className="hero-container">
          <div className="hero-content">
            <h1>
              Build app with <span>Block IDLE</span>, powered by Logic Editor
            </h1>
  
            <p>
              A powerful platform that helps developers and student to design, build, and deploy
              applications effortlessly. Build your apps on device, no server dependency.
              
              Comming Soon...
            </p>
  
            <div className="hero-buttons">
              <button
                className="primary-btn"
                onClick={handleSourceClick}
              >
                Source Code
              </button>

              <button
                className="secondary-btn"
                onClick={handleFollowClick}
              >
                Follow Me
              </button>
            </div>
          </div>
          <div className="hero-image">
            <img
              src="assets/1771685401361.png"
              alt="App Screenshot"
            />
          </div>
  
        </div>
      </section>
    </Container>
  );
}