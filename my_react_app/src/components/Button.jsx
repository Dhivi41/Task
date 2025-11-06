import React from "react";

function Button({ label, onClick, type = "button", disabled = false }) {
  return (
    <button
      type={type}
      onClick={onClick}
      disabled={disabled}
      style={{
        padding: "8px 12px",
        backgroundColor: disabled ? "gray" : "lightblue",
        border: "1px solid #333",
        borderRadius: "4px",
        cursor: "pointer",
        margin: "4px",
      }}
    >
      {label}
    </button>
  );
}

export default Button;
