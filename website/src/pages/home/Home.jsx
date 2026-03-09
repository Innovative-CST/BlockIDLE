import Api from "./components/Api"
import HeroSection from "./components/HeroSection"
import FeaturesSection from "./components/FeaturesSection"
import Footer from "./components/Footer"
import Contribute from "./components/Contribute"
import ContributorsList from "./components/ContributorsList"
import Discord from "./components/Discord"
import "../../theme.css"
import { Box } from "@mui/material";

export default function Home() {
  return (
    <div className="light" style={{ background: "linear-gradient(to right, #f8f9ff, #ffffff)" }}>
      <HeroSection/>
      <FeaturesSection/>
      <Box
        sx={{
          display: "grid",
          gridTemplateColumns: "repeat(auto-fit, minmax(280px, 1fr))",
          gap: "24px",
          maxWidth: "1200px",
          margin: "auto",
        }}
      >
        <Contribute/>
        <Discord/>
        <Api/>
      </Box>
      <Footer/>
    </div>
  );
}
