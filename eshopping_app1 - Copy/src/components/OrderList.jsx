import axios from 'axios'
import React, { useState, useEffect } from 'react'
//import { toast } from 'react-toastify'
import {useNavigate} from 'react-router-dom';
import { Container } from '@material-ui/core';
function OrderList(){

    const [order, setOrder] = useState([]);
    useEffect(() => {
        const getorders = async () => {
            const res = await fetch('http://localhost:8080/admin/getorders');
            const getdata = await res.json();
            setOrder(getdata);
           // console.log(getdata);
        }
        getorders();

    },[]);
    
    return (
        <Container>
        <div className="row">
            <div className="col-sm-8 text-success">
            <h5 className="p-3 fw-bold text-white" style={{ marginTop:'10px',border:'solid', marginBottom:'10px', borderRadius:'100px',textAlign:"center"}}>Order and customer Details</h5>
            <table className="table table-bordered text-white" style={{marginTop:'10px',border:'solid', marginBottom:'10px', borderRadius:'100px',textAlign:"center"}}>
                <thead>
                    <tr>
                        <th>orderid</th>
                        <th>customer id</th>
                        <th>customer name</th>
                        <th>customer email</th>
                        <th>customer contact</th>
                        <th>customer address</th>
                        <th>amount</th>
                        <th>order date</th>
                        <th>delivery date</th>
                        <th>shipper id</th>
                        <th>shipper name</th>
                        <th>shipper contact</th>
                        <th>status</th>
                    </tr>
                </thead>
                <tbody style={{marginTop:'10px',border:'solid', marginBottom:'10px', borderRadius:'100px',textAlign:"center"}}>
                    {
                        order.map( (getorder) => (
                        <tr key={getorder.oid}>
                           <td>{getorder.cust_id}</td>
                           <td>{getorder.customer.cust_name}</td>
                           <td>{getorder.customer.email}</td>
                           <td>{getorder.customer.contact}</td>
                           <td>{getorder.customer.address}</td>
                           <td>{getorder.amount}</td>
                           <td>{getorder.orderdate}</td>
                           <td>{getorder.deliverydate}</td>
                           <td>{getorder.ship_id}</td>
                           <td>{getorder.shipper.shipper_name}</td>
                           <td>{getorder.shipper.contact}</td>
                           <td>{getorder.status}</td>
                        </tr>
                        
                        )
                        )
                    }
                </tbody>
            </table>
            </div>
        </div>
        </Container>
    )
}


export default OrderList;
