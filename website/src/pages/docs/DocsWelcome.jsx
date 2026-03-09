import { Box, Button, Typography, Container } from "@mui/material";

export default function DocsWelcome() {
  return (
    <Box
      sx={{
        textAlign: "center",
        mt: 8,
        px: 2,
      }}
    >
      <Typography variant="h4" sx={{ fontWeight: 700, mb: 2 }}>
        BlockIDLE API Docs
      </Typography>

      <Typography sx={{ color: "#666", maxWidth: 600, mx: "auto" }}>
        Select a documentation page from the sidebar to get started.
        Here you will find guides, references, and examples for building
        blocks, events, and custom components inside BlockIDLE.
      </Typography>
    </Box>
  );
}