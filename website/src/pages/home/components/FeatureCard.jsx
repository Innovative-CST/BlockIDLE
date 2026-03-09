import React from "react";
import "./css/Feature.css";

export default function FeatureCard({ image, title, description }) {
  return (
    <div className="feature-card">
      <div className="feature-image-wrapper">
        <img src={image} alt={title} className="feature-image" />
      </div>

      <h3 className="feature-title">{title}</h3>
      <p className="feature-description">{description}</p>
    </div>
  );
}