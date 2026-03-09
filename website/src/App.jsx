import { Routes, Route, BrowserRouter } from "react-router-dom";
import Home from "./pages/home/Home";
import Docs from "./pages/docs/Docs";
import NotFound from "./pages/notFound/NotFound";

export default function App() {
  return (
    <BrowserRouter>
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/docs/*" element={<Docs />} />
      <Route path="*" element={<NotFound />} />
    </Routes>
    </BrowserRouter>
  );
}