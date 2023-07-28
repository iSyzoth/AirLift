package com.savya.airlift.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userid")
	int userid;

	@Column(name = "emailid", nullable = false, length = 30, unique = true)
	String emailid;

	@Column(name = "password", length = 45)
	String password;

	@Column(name = "name", length = 25)
	String name;

	@Column(name = "fathername", length = 25)
	String fathername;

	@Column(name = "mobilenumber", length = 12, nullable = false, unique = true)
	long mobilenumber;

	@Column(name = "dob")
	@Temporal(TemporalType.DATE)
	Date dob;

	@Column(name = "gender", length = 10)
	String gender;

	@Column(name = "maritalstatus", length = 10)
	String maritalstatus;

	@Column(name = "address", length = 150)
	String address;

	@Column(name = "city", length = 15)
	String city;

	@Column(name = "pincode", length = 8)
	long pincode;

	@Column(name = "state", length = 15)
	String state;

	@Column(name = "role", columnDefinition = "int default 0")
	int role;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int userid, String emailid, String password, String name, String fathername, long mobilenumber,
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
		return "User [userid=" + userid + ", emailid=" + emailid + ", password=" + password + ", name=" + name
				+ ", fathername=" + fathername + ", mobilenumber=" + mobilenumber + ", dob=" + dob + ", gender="
				+ gender + ", maritalstatus=" + maritalstatus + ", address=" + address + ", city=" + city + ", pincode="
				+ pincode + ", state=" + state + ", role=" + role + "]";
	}
	
	
	
}