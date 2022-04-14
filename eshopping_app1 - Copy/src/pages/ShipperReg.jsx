
import React from 'react';
import "../App.css";
import { Link } from 'react-router-dom'
import { useState } from 'react';
import { toast } from 'react-toastify';
import axios from 'axios';

//import custpic from "../images.cust.svg";


const ShipRegister = () => {
    const [name, setName] = useState('')
    const [city, setCity] = useState('')
    const [mobile, setMobile] = useState('')


    const RegisterUser = () => {
        console.warn();
        if (name.length === 0) {
            toast.warning('Please enter Fisrt Name')
        } else if (mobile.length === 0) {
            toast.warning('Please enter a valid Mobile Number')
        } else if (city.length === 0) {
            toast.warning('Please enter a valid city')
        } else {
            const body = {
                name,
                city,
                mobile,
                type: 'shipper'
            }

            console.log(body)


            const url = "http://localhost:8080/registership"

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
                        <label for="mobile">Contactno:</label>
                    </div>
                    <div class="col-90">
                        <input onChange={(e) => {
                            setMobile(e.target.value)
                        }} type="tel" id="mobile" name="mobile" placeholder="only 10 digits are allowed"></input>
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
export default ShipRegister