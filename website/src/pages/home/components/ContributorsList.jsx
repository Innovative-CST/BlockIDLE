import React, { useState, useEffect, useMemo } from "react";
import { Typography, Box } from "@mui/material";
import Contributor from "./Contributor";
import "./css/Contributor.css";

export default function ContributorsList({ owner, repo }) {
  const [contributors, setContributors] = useState([]);
  const [loading, setLoading] = useState(true);

  const customContributors = [
    {
      id: "kiaraglitz",
      name: "kiaraglitz",
      avatar: "/assets/kiaraglitz.jpg",
      profileUrl:
        "https://www.instagram.com/kiaraglitz?igsh=eGxhcTh5bXY3YXg2",
      badge: "UI/UX",
      badgeColor: "#ff5722",
    },
  ];

  const specialRoles = {
    DevVigilante: { badge: "CORE", color: "#e91e63" },
  };

  const badgePriority = {
    "CORE": 1,
    "UI/UX": 2,
  };

  useEffect(() => {
    async function fetchContributors() {
      try {
        setLoading(true);
        const response = await fetch(
          `https://api.github.com/repos/${owner}/${repo}/contributors`
        );
        const data = await response.json();
        setContributors(data);
      } catch (error) {
        console.error("Error fetching contributors:", error);
      } finally {
        setLoading(false);
      }
    }

    fetchContributors();
  }, [owner, repo]);

  const finalContributors = useMemo(() => {
      const githubFormatted = contributors.map((c) => {
      const role = specialRoles[c.login];

      return {
        id: c.id,
        name: c.login,
        avatar: c.avatar_url,
        profileUrl: c.html_url,
        contributions: c.contributions,
        badge: role?.badge,
        badgeColor: role?.color,
      };
    });

    // Merge both arrays
    const all = [...customContributors, ...githubFormatted];
    return all.sort((a, b) => {
      const aPriority = badgePriority[a.badge] || 999;
      const bPriority = badgePriority[b.badge] || 999;

      if (aPriority !== bPriority) {
        return aPriority - bPriority;
      }

      return (b.contributions || 0) - (a.contributions || 0);
    });
  }, [contributors]);

  if (loading) return <p>Loading contributors...</p>;

  return (
    <Box
      sx={{
        display: "flex",
        flexDirection: "column",
        padding: "40px 20px",
        margin: "auto",
      }}
    >
      <Typography variant="h5" gutterBottom sx={{ fontWeight: 700 }}>
        Contributors
      </Typography>

      <div className="contributors-grid">
        {finalContributors.map((contrib) => (
          <Contributor
            key={contrib.id}
            avatar={contrib.avatar}
            name={contrib.name}
            profileUrl={contrib.profileUrl}
            contributions={contrib.contributions}
            badge={contrib.badge}
            badgeColor={contrib.badgeColor}
          />
        ))}
      </div>
    </Box>
  );
}