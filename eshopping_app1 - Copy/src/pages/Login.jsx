{/*import React from 'react';
import "../App.css";

//import {useNavigate} from 'react-router-dom';




const RegisterUser = () => 
{

    if (useremail.length === 0) {
        toast.warning('Please enter Fisrt Name')
    } else if (password.length === 0) {
        toast.warning('Please enter a valid Mobile Number')
    } else {
        const body = {
            useremail,
            password,

        }

        console.log(body)
        axios.post(url, body).then(response => 
            {
            const result = response.data

            if (result['status'] === 'success') 
            {
                toast.success('Login successfull')

                sessionStorage['id'] = result.data.id
                sessionStorage['firstName'] = result.data.firstName;

                // console.log(sessionStorage.id)
                // console.log(sessionStorage.firstName)
            } else 
            {
                toast.error(result['error'])
            }
        }


            return (
            <>
                <h1>Login Form</h1>
                <div class="container">
                    <div class="row">
                        <div class="col-10">
                            <label for="useremail">UserEmail:</label>
                        </div>
                        <div class="col-90">
                            <input type="text" id="useremail" name="useremail" onChange={this.handleChange} maxlength="100"></input>
                        </div>
                    </div>


                    <div class="row">
                        <div class="col-10">
                            <label for="password">Password:</label>
                        </div>
                        <div class="col-90">
                            <input type="password" id="password" name="password" onChange={this.handleChange} maxlength="100"></input>
                        </div>
                    </div>


                    {/*<div class="row">
                                <div class="col-10">
                                    <label for="type">Type:</label>
                                </div>
                                <div class="col-90">
                                    <input type="text" id="type" name="type" maxlength="10" onChange={this.handleChange}></input>
                                </div>
                            </div>
                    <button background-color='blue' onClick={this.submitData} className="btn-secondary">Login</button>


                </div>


            </>

   

};*/}