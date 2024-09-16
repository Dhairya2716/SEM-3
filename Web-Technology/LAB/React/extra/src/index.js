import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter, Link, Outlet, Route, Routes } from 'react-router-dom';

const root = ReactDOM.createRoot(document.getElementById('root'));

function Layout(){
  return (
    <>
      <Link to='/home'>Home</Link>;
      <Link to='/about'>About</Link>;
      <Link to='/contact'>Contact</Link>
      <br/>
      <Outlet/> 
    </>
  );
}
function Home(){
  return (<h1>Home Page</h1>);
}
function About(){
  return (<h1>About Page</h1>);
}
function Contact(){
  return (<h1>Contact Page</h1>);
}

root.render(
  <BrowserRouter>
    <Routes>
      <Route path="/" element={<Layout/>}>
      <Route path="/home" element={<Home/>}/>
      <Route path='/about' element={<About/>}/>
      <Route path='/contact' element={<Contact/>}/>
      </Route>
    </Routes>
  </BrowserRouter>
);