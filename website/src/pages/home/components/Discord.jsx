import { Box, Button, Typography, Container } from "@mui/material";
import { useNavigate } from "react-router-dom";
import CommunityImg from "../../../../public/assets/undraw_online-community_3o0l.svg"
import "../../../theme.css"

export default function Discord() {
  const navigate = useNavigate();

  return (
    <Container maxWidth="md">
      <Box
        sx={{
          display: "flex",
          flexDirection: "column",
        }}
      >
        <Typography variant="h5" gutterBottom sx={{ fontWeight: 700 }}>
          Join us on Discord
        </Typography>

        <Box
          component="img"
          src={CommunityImg}
          alt="Open Source Illustration"
          sx={{
            width: "100%",
            maxWidth: 400,
            mb: 3,
            filter: "drop-shadow(0 15px 30px rgba(0,0,0,0.15))"
          }}
        />
        <Typography sx={{ mb: 4, color: "#555" }}>
          Join the Block IDLE community to connect with other developers
          and contributors.
          <br /><br />
          Discuss ideas, get help, share feedback, and collaborate on
          upcoming features and improvements.
          <br /><br />
          Whether you're just starting out or already experienced,
          you're welcome to be part of the journey.
        </Typography>

        <Container
          sx={{
            display: "grid",
            justifyContent: "right",
          }}
        >
          <Button
            variant="text"
            size="large"
            sx={{
              color: "var(--primary)",
              fontWeight: 600,
            }}
            onClick={() =>
              window.open("https://discord.gg/RM5qaZs4kd", "_blank")
            }
          >
            Discord
          </Button>
        </Container>
      </Box>
    </Container>
  );
}
