import React from 'react';

const Header = ({ title }) => {
  const headerStyle = {
    backgroundColor: '#282c34',
    color: 'white',
    padding: '20px',
    textAlign: 'center',
    borderRadius: '8px'
  };

  return <header style={headerStyle}><h1>{title}</h1></header>;
};

export default Header;
