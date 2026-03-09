import React from "react";
import ReactDOM from "react-dom/client";
import { CssBaseline } from "@mui/material";
import { ThemeProvider, createTheme } from "@mui/material/styles";
import App from "./App";

const theme = createTheme({
  cssVariables: true,

  palette: {
    mode: "light",

    primary: {
      main: "rgb(69 103 49)",
    },
  },

  shape: {
    borderRadius: 28,
  },

  typography: {
    fontFamily: `"Google Sans", "Roboto", sans-serif`,
    h6: {
      fontWeight: 500,
      letterSpacing: "0.1px",
    },
    button: {
      textTransform: "none",
      fontWeight: 500,
    },
  },

  components: {
    MuiAppBar: {
      styleOverrides: {
        root: {
          boxShadow: "none",
          padding: "0.5em",
          borderBottom: "1px solid #ffffff",
        },
      },
    },

    MuiDrawer: {
      styleOverrides: {
        paper: {
          borderRight: "1px solid rgba(0,0,0,0.06)",
        },
      },
    },

    MuiListItemButton: {
      styleOverrides: {
        root: {
          borderRadius: 20,
          marginLeft: 8,
          marginRight: 8,
          marginTop: 4,
          marginBottom: 4,
          "&:hover": {
            backgroundColor: "rgba(138, 180, 248, 0.12)",
          },
        },
      },
    },

    MuiPaper: {
      styleOverrides: {
        root: {
          backgroundImage: "none",
        },
      },
    },
  },
});

ReactDOM.createRoot(document.getElementById("root")).render(
  <ThemeProvider theme={theme}>
    <CssBaseline />
    <App />
  </ThemeProvider>
);