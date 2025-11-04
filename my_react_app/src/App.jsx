import React from 'react';
import Header from './components/Header';
import Footer from './components/Footer';
import Button from './components/Button';

const App = () => {
const handleClick = (msg) => {
    alert(msg);
  };

  return (
    <div style={{ textAlign: 'center', fontFamily: 'Arial', padding: '20px' }}>
      <Header title="Welcome to My Task App!" />

      <h2>Functional Components</h2>

      <Button 
        label="Click Me" 
        color="green"
        onClick={() => handleClick('You clicked the Green Button!')} 
      />

      <Button 
        label="Submit" 
        color="blue"
        onClick={() => handleClick('Form Submitted!')} 
      />

      <Button 
        label="Cancel" 
        color="red"
        onClick={() => handleClick('Action Cancelled!')} 
      />
      <Footer text="© 2025 My React Task. All rights reserved." />
    </div>
  );
};

export default App;
