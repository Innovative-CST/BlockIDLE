import { Box, Button, Typography, Container } from "@mui/material";
import { useNavigate } from "react-router-dom";
import ApiImage from "../../../../public/assets/undraw_product-teardown_w5rb.svg"
import "../../../theme.css"

export default function Api() {
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
          Components API
        </Typography>

        <Box
          component="img"
          src={ApiImage}
          alt="Open Source Illustration"
          sx={{
            width: "100%",
            maxWidth: 400,
            mb: 3,
            filter: "drop-shadow(0 15px 30px rgba(0,0,0,0.15))"
          }}
        />

        <Typography sx={{ mb: 4, color: "#555" }}>
          Block IDLE API documentation explains how to build blocks, events,
          and other components for the platform.
          <br /><br />
          Learn how to create custom logic blocks, define event handlers,
          structure components, and extend the editor with powerful features.
          <br /><br />
          More detailed documentation, examples, and guides are coming soon.
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
              color: "var(--primary)"
            }}
            onClick={() => navigate("/docs")}
          >
            Components API Docs
          </Button>
        </Container>
      </Box>
    </Container>
  );
}
