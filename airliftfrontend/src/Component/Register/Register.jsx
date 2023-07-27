import React from 'react';
import '@fortawesome/fontawesome-free/css/all.min.css';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';

function Register() {
  return (
    <div className='d-flex align-items-center justify-content-center'>
      <div className='card m-5 gradient-custom-3 rounded-5'>
        <div className='m-5' style={{ maxWidth: '600px' }}>
          <div className='px-5'>
            <h2 className="text-uppercase text-center mb-5">Register</h2>
            <form action=''>
              <div className='mb-4'>
                <FontAwesomeIcon icon="user" />
                <input className='form-control form-control-lg' id='form1' type='text' placeholder='Name' />
              </div>
              <div className='mb-4'>
                <FontAwesomeIcon icon="envelope" /> 
                <input className='form-control form-control-lg' id='form2' type='email' placeholder='Email ID' />
              </div>
              <div className='mb-4'>
                <FontAwesomeIcon icon="lock" /> 
                <input className='form-control form-control-lg' id='form3' type='password' placeholder='Password' />
              </div>
              <div className='mb-4'>
                <FontAwesomeIcon icon="lock" /> 
                <input className='form-control form-control-lg' id='form4' type='password' placeholder='Repeat Password' />
              </div>
              <div className='mb-4'>
                <FontAwesomeIcon icon="phone" /> 
                <input className='form-control form-control-lg' id='form5' type='text' placeholder='Mobile Number' />
              </div>
              <div className='d-flex flex-row justify-content-center mb-4'>
                <div className='form-check'>
                  <input className='form-check-input' type='checkbox' id='flexCheckDefault' />
                  <label className='form-check-label' htmlFor='flexCheckDefault'>
                    I agree all statements in Terms of service
                  </label>
                </div>
              </div>
              <button className='btn btn-primary btn-lg mb-4 w-100 gradient-custom-4'>Register</button>
            </form>
          </div>
        </div>
      </div>

      {/* <div className='card mb-5 gradient-custom-3 rounded-5'>
        <img src="./Images/plane-1.jpeg" alt="Plane-taking-off" style={{ width: '40%', height: '20%', objectFit: 'fill' }} />
      </div> */}
    </div>
  );
}

export default Register;
