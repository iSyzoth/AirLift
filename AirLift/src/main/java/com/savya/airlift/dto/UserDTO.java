package com.savya.airlift.dto;

import java.util.Date;

public class UserDTO {
	int userid;
	String emailid;
	String password;
	String name;
	String fathername;
	long mobilenumber; // Change to String for leading zeros
	Date dob;
	String gender;
	String maritalstatus;
	String address;
	String city;
	long pincode;
	String state;
	int role;
	
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}

	public UserDTO(int userid, String emailid, String password, String name, String fathername, long mobilenumber,
			Date dob, String gender, String maritalstatus, String address, String city, long pincode, String state,
			int role) {
		this.userid = userid;
		this.emailid = emailid;
		this.password = password;
		this.name = name;
		this.fathername = fathername;
		this.mobilenumber = mobilenumber;
		this.dob = dob;
		this.gender = gender;
		this.maritalstatus = maritalstatus;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.role = role;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalstatus() {
		return maritalstatus;
	}

	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserDTO [userid=" + userid + ", emailid=" + emailid + ", password=" + password + ", name=" + name
				+ ", fathername=" + fathername + ", mobilenumber=" + mobilenumber + ", dob=" + dob + ", gender="
				+ gender + ", maritalstatus=" + maritalstatus + ", address=" + address + ", city=" + city + ", pincode="
				+ pincode + ", state=" + state + ", role=" + role + ", getUserid()=" + getUserid() + ", getEmailid()="
				+ getEmailid() + ", getPassword()=" + getPassword() + ", getName()=" + getName() + ", getFathername()="
				+ getFathername() + ", getMobilenumber()=" + getMobilenumber() + ", getDob()=" + getDob()
				+ ", getGender()=" + getGender() + ", getMaritalstatus()=" + getMaritalstatus() + ", getAddress()="
				+ getAddress() + ", getCity()=" + getCity() + ", getPincode()=" + getPincode() + ", getState()="
				+ getState() + ", getRole()=" + getRole() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}