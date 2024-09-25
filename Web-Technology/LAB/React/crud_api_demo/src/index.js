import React from 'react';
import { createRoot } from 'react-dom/client';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Bank from './Bank';
import Dis from './dis';

const root = createRoot(document.getElementById('root'));
root.render(
  <BrowserRouter>
    <Routes>
      <Route path='/bank' element={<Bank />} />
      <Route path='/dis' element={<Dis />} />
    </Routes>
  </BrowserRouter>
);