import axios from 'axios'
import React, { useState } from 'react'
import { toast } from 'react-toastify'
import {useNavigate} from 'react-router-dom';

const LoginPage = () => {

    const navigate = useNavigate();

    const [useremail, setUseremail] = useState('');
    const [password, setPassword] = useState('');
    const submit = () => {
        const body = {
            useremail,
            password
        }
        const url = "http://localhost:8080/checklogin"
        axios.post(url, body).then(response => {
            const result = response.data
            if (result['status'] === 'success') {
                // toast.success("Logged in successfully..!!")
               console.log("loged in..!!")
                console.log(result.data)
                sessionStorage['id'] = result.data.id
                sessionStorage['firstName'] = result.data.firstName;
                if(response.data.type==='customer')
                navigate("/products")
                if(response.data.type==='shipper')
                navigate("/shipperDashboard")
                else  <i></i>
                navigate("/")

            } else {
                toast.error(result['error'])
                /*console.log(err);*/
            }
        })
    }
    return (
        <div>
            <h1>Login Form</h1>
            <div className="container">
                <div className="row">
                    <div className="col-10">
                        <label for="useremail">UserEmail:</label>
                    </div>
                    <div className="col-90">
                        <input onChange={(e) => {
                            setUseremail(e.target.value)
                        }} type="text" id="useremail" name="useremail" maxlength="100"></input>
                    </div>
                </div>

                <div className="row">
                    <div className="col-10">
                        <label for="password">Password:</label>
                    </div>
                    <div className="col-90">
                        <input onChange={(e) => {
                            setPassword(e.target.value)
                        }} type="password" id="password" name="password" maxlength="100"></input>
                    </div>
                </div>
                <button onClick={submit} background-color='blue' className="btn-secondary">Login</button>
            </div>
        </div>
    )
}

export default LoginPage
