import logo from './logo.svg';
import './App.css';
import Home from './pages/Home';
import {
  BrowserRouter,
  Routes,
  Route,
  Link,
} from "react-router-dom";

import Register from './pages/Register';
import Login from './pages/Login';
import ShipRegister from './pages/ShipperReg';
import LoginPage from './pages/LoginPage';
import { ToastContainer } from 'react-toastify';
import Products from './components/Products';
import { render } from '@testing-library/react';
import OrderList from './pages/OrderList';

function App() {
  render()

  return (
    <div>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/login" element={<LoginPage />} />
          <Route path="/custregister" element={<Register />} />
          <Route path="/shipregister" element={<ShipRegister />} />
          <Route path="/products" element={<Products />} />
          <Route path="/OrderList" element={<Products />} />
        </Routes>
      </BrowserRouter>
      <ToastContainer theme='colored'/>
    </div>
  );
}



export default App;
