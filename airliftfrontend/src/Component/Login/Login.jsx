import React from 'react';
import '@fortawesome/fontawesome-free/css/all.min.css';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';

function Login() {
    return (
        <div className='d-flex align-items-center justify-content-center bg-image'>
            <div className='card m-5 rounded-5 gradient-custom-3'>
            <div className='m-5' style={{ maxWidth: '600px' }}>
                <div className='px-5'>
                    <h2 className="text-uppercase text-center mb-5">Login</h2>
                    <form action=''>
                        <div className='mb-4'>
                            <FontAwesomeIcon icon="envelope" />
                            <input className='form-control form-control-lg' id='form1' type='email' placeholder='Email ID' />
                        </div>
                        <div className='mb-4'>
                            <FontAwesomeIcon icon="lock" />
                            <input className='form-control form-control-lg' id='form2' type='password' placeholder='Password' />
                        </div>
                        <div className='d-flex flex-row justify-content-end mb-4'>
                        <a href="/forgot-password" style={{ textDecoration: 'none', color: 'skyblue', alignItems: 'right' }}>Forgot Password? Click here</a>
                        </div>
                        <button className='btn btn-primary btn-lg mb-4 w-100 gradient-custom-4'>Login</button>
                    </form>
                </div>
            </div>
            </div>
        </div>
    );
}

export default Login;
