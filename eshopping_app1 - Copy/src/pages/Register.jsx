
import React from 'react';
import "../App.css";
import { Link } from 'react-router-dom'
import { useState } from 'react';
import { toast } from 'react-toastify';
import axios from 'axios';

//import custpic from "../images.cust.svg";


const Register = () => {
    const [name, setName] = useState('')
    const [email, setEmail] = useState('')
    const [mobile, setMobile] = useState('')
    const [address, setAddress] = useState('')
    const [city, setCity] = useState('')
    const [useremail, setUseremail] = useState('')
    const [password, setPassword] = useState('')

    const RegisterUser = () => {
        console.warn();
        if (name.length === 0) {
            toast.warning('Please enter Fisrt Name')

        } else if (email.length === 0) {
            toast.warning('Please enter valid Email ID')
        } else if (password.length === 0) {
            toast.warning('Please enter password')
        } else if (mobile.length === 0) {
            toast.warning('Please enter a valid Mobile Number')
        } else if (address.length === 0) {
            toast.warning('Please enter a valid Address')
        } else {
            const body = {
                name,
                email,
                mobile,
                address,
                city,
                useremail,
                password,
                type: 'customer'
            }

            console.log(body)


            const url = "http://localhost:8080/registercust"

            axios.post(url, body).then((response) => {

                const result = response.data

                if (result['status'] === 'success')
                    toast.success('You are registerd successfully')
                else {
                    toast.warning(result['error'])
                }
            })
        }
    }

    return (
        <div className="container">
            <h1>Registaration Form</h1>
            <div class="container">
                <div class="row">
                    <div class="col-10">
                        <label for="name"> Name:</label>
                    </div>
                    <div class="col-90">
                        <input onChange={(e) => {
                            setName(e.target.value)
                        }} type="text" id="name" name="name" placeholder="Enter your name"></input>
                    </div>
                </div>


                <div class="row">
                    <div class="col-10">
                        <label for="email">Email:</label>
                    </div>
                    <div class="col-90">
                        <input onChange={(e) => {

                            setEmail(e.target.value)
                        }} type="email" id="email" name="email" placeholder="it should contain @,."></input>
                    </div>
                </div>
                <div class="row">
                    <div class="col-10">
                        <label for="mobile">Contactno:</label>
                    </div>
                    <div class="col-90">
                        <input onChange={(e) => {
                            setMobile(e.target.value)
                        }} type="tel" id="mobile" name="mobile" placeholder="only 10 digits are allowed"></input>
                    </div>
                </div>

                <div class="row">
                    <div class="col-10">
                        <label for="address">Address:</label>
                    </div>
                    <div class="col-90">
                        <input onChange={(e) => {
                            setAddress(e.target.value)
                        }} type="text" name="address" id="address" placeholder="Enter your address"cols="30" rows="10" />
                    </div>
                </div>
                <div class="row">
                    <div class="col-10">
                        <label for="city">City:</label>
                    </div>
                    <div class="col-90">
                        <input onChange={(e) => {
                            setCity(e.target.value)
                        }} type="text" id="city" name="city" placeholder="Enter your city" maxlength="10"></input>
                    </div>
                </div>

                <div class="row">
                    <div class="col-10">
                        <label for="useremail">Useremail:</label>
                    </div>
                    <div class="col-90">
                        <input onChange={(e) => {
                            setUseremail(e.target.value)
                        }} type="text" id="useremail" name="useremail" placeholder="Enter your useremail" maxlength="10"></input>
                    </div>
                </div>

                <div class="row">
                    <div class="col-10">
                        <label for="password">Password:</label>
                    </div>
                    <div class="col-90">
                        <input onChange={(e) => {
                            setPassword(e.target.value)
                        }} type="password" id="password" name="password" placeholder="Enter your Password" maxlength="8"></input>
                    </div>
                </div>
                <div className="mb-3">
                    <div> Already have an account? <Link to="/login"> Login here</Link>
                    </div>
                    <button onClick={RegisterUser} className="btn-secondary">Submit</button>
                    <button onClick={RegisterUser} className="btn-danger">Reset</button>

                </div>
            </div>

        </div >



    )
}
export default Register