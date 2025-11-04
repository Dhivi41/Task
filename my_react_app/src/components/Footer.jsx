import React from 'react';

const Footer = ({ text }) => {
  const footerStyle = {
    backgroundColor: '#f1f1f1',
    color: '#333',
    padding: '15px',
    textAlign: 'center',
    marginTop: '30px',
    borderRadius: '8px'
  };

  return <footer style={footerStyle}><p>{text}</p></footer>;
};

export default Footer;
