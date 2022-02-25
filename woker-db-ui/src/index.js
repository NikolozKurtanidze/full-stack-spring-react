import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';

var element = React.createElement('h1', { className: 'greeting' }, 'Hello, world!');
ReactDOM.render(
  <App />,
  document.getElementById('root')
);
