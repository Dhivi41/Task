import React from 'react';

const Button = ({ label, onClick, color }) => {
  const buttonStyle = {
    backgroundColor: color || '#007bff',
    color: 'white',
    border: 'none',
    padding: '10px 20px',
    borderRadius: '8px',
    cursor: 'pointer',
    margin: '10px',
  };

  return <button style={buttonStyle} onClick={onClick}>{label}</button>;
};

export default Button;
