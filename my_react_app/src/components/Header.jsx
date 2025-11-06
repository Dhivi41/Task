import React from "react";
import { Link } from "react-router-dom";

function Header() {
  return (
    <header>
      <h1>Welcome to My React Website</h1>
      <nav>
        <Link to="/">
          <button>Home</button>
        </Link>
        <Link to="/about">
          <button>About</button>
        </Link>
        <Link to="/contact">
          <button>Contact</button>
        </Link>
      </nav>
    </header>
  );
}

export default Header;
