import { Box, Button, Typography, Container } from "@mui/material";
import { useNavigate } from "react-router-dom";
import "../../../theme.css"
import OpenSourceImg from "../../../../public/assets/undraw_open-source_g069.svg";

export default function Contribute() {
  const navigate = useNavigate();

  return (
    <Container maxWidth="md">
      <Box
        sx={{
          display: "flex",
          flexDirection: "column",
          justifyContent: "center",
          alignItem: "center"
        }}
      >
        <Typography variant="h5" gutterBottom sx={{ fontWeight: 700 }}>
          Open Source
        </Typography>
        
        <Box
          component="img"
          src={OpenSourceImg}
          alt="Open Source Illustration"
          sx={{
            width: "100%",
            maxWidth: 400,
            mb: 3,
            filter: "drop-shadow(0 15px 30px rgba(0,0,0,0.15))"
          }}
        />

        <Typography sx={{ mb: 4, color: "#555" }}>
          Block IDLE is proudly open-source and maintained by passionate developers.
          <br /><br />
          Explore the source code on GitHub, contribute new ideas, report issues,
          improve documentation, and help shape the future of the platform.
          <br /><br />
          Together, we can build a powerful and developer-friendly ecosystem
          that makes app creation smarter and more accessible.
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
              window.open("https://github.com/Innovative-CST/BlockIDLE", "_blank")
            }
          >
            View on GitHub
          </Button>
        </Container>
      </Box>
    </Container>
  );
}
