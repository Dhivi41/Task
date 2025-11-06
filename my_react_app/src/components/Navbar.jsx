import React from "react";

function Navbar({ currentPage, onNavigate }) {
  return (
    <nav
      style={{
        backgroundColor: "#ddd",
        padding: "10px",
        textAlign: "center",
      }}
    >
      <button
        onClick={() => onNavigate("home")}
        style={{
          margin: "5px",
          backgroundColor: currentPage === "home" ? "lightblue" : "black",
          border: "1px solid gray",
          padding: "6px 12px",
          cursor: "pointer",
        }}
      >
        Home
      </button>
      <button
        onClick={() => onNavigate("about")}
        style={{
          margin: "5px",
          backgroundColor: currentPage === "about" ? "lightblue" : "black",
          border: "1px solid gray",
          padding: "6px 12px",
          cursor: "pointer",
        }}
      >
        About
      </button>
      <button
        onClick={() => onNavigate("contact")}
        style={{
          margin: "5px",
          backgroundColor: currentPage === "contact" ? "lightblue" : "black",
          border: "1px solid gray",
          padding: "6px 12px",
          cursor: "pointer",
        }}
      >
        Contact
      </button>
    </nav>
  );
}

export default Navbar;
