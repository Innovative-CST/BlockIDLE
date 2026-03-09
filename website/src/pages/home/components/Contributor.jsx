import React from "react";
import "./css/Contributor.css";

export default function Contributor({
  avatar,
  name,
  profileUrl,
  contributions,
  badge,
  badgeColor
}) {
  return (
    <div className="contributor-card">
      {badge && (
        <span
          className="custom-badge"
          style={{ background: badgeColor || "#4caf50" }}
        >
          {badge}
        </span>
      )}

      <a href={profileUrl} target="_blank" rel="noopener noreferrer">
        <img
          src={avatar}
          alt={`${name}'s avatar`}
          className="contributor-avatar"
        />
      </a>

      <h4>{name}</h4>
      {contributions && <p>{contributions} contributions</p>}
    </div>
  );
}