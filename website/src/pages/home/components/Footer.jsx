import React from "react";

export default function Footer() {
  return (
    <footer style={styles.footer}>
      <div style={styles.container}>
        
        {/* Left Section */}
        <div style={styles.section}>
          <h3 style={styles.logo}>Block IDLE</h3>
          <p style={styles.text}>
            A Open Source Software built for Android.
          </p>
        </div>

        {/* Middle Section */}
        <div style={styles.section}>
          <h4 style={styles.heading}>Social links</h4>
          <ul style={styles.list}>
            <li><a href="https://github.com/Innovative-CST" style={styles.link}>GitHub (org)</a></li>
            <li><a href="https://github.com/DevVigilante" style={styles.link}>GitHub (Owner)</a></li>
            <li><a href="https://www.instagram.com/innovative_cst?igsh=MWQ0bDFsbGJ0NmpobQ==" style={styles.link}>Instagram</a></li>
            <li><a href="https://discord.gg/RM5qaZs4kd" style={styles.link}>Discord</a></li>
          </ul>
        </div>

        {/* Right Section */}
        <div style={styles.section}>
          <h4 style={styles.heading}>Contact</h4>
          <p style={styles.text}>devkumar9760955514@gmail.com</p>
        </div>

      </div>
    </footer>
  );
}

const styles = {
  footer: {
    backgroundColor: "#111",
    color: "#fff",
    padding: "40px 20px",
    marginTop: "50px",
  },
  container: {
    maxWidth: "1100px",
    margin: "0 auto",
    display: "flex",
    flexWrap: "wrap",
    justifyContent: "space-between",
    gap: "30px",
  },
  section: {
    flex: "1",
    minWidth: "200px",
  },
  logo: {
    marginBottom: "10px",
  },
  heading: {
    marginBottom: "10px",
  },
  text: {
    color: "#bbb",
    fontSize: "14px",
    marginBottom: "6px",
  },
  list: {
    listStyle: "none",
    padding: 0,
  },
  link: {
    color: "#bbb",
    textDecoration: "none",
    fontSize: "14px",
  },
};