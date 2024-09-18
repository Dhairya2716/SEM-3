import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import About from './About';
import Contact from './Contact';
import Home from './Home';
import Layout from './Layout';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <BrowserRouter>
  <Routes>
    <Route path="/" element={<Layout />}>
    <Route path="/Home" element={<Home />}/>
    <Route path="/About" element={<About />}/>
    <Route path="/Contact" element={<Contact />}/>
    </Route>
  </Routes>
  </BrowserRouter>
);