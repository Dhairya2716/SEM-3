import React from 'react';
import ReactDOM from 'react-dom/client';
import College from './college';

class Demo extends React.Component {
  render() {
    return <h1>Hello World</h1>;
  }
}

class ReactComponent extends React.Component {
  render() {
    return <h1>from react</h1>;
  }
}

function Student() {
  return <h1>from function</h1>;
}

function MyButton() {
  return (
    <button>I'm a button</button>
  );
}

// const a = () => {
//   return <h1>hello from es6 function</h1>
// }

const root = ReactDOM.createRoot(document.getElementById('root'));

root.render(
  <>
    <Demo />
    <ReactComponent />
    <h1>yo</h1>
    <Student />
    <MyButton />
    <College />
    {/* <a /> */}
  </>
);