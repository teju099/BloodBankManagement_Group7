package com.capg.bloodbankmanagementapp.beans;
import java.util.Date;
public class Donor {
	
   private int donorId;
   private int donorAge;
   private String donorPhoneNumber;
    
   private String donorName;
   private String donorGender;
   
   private String donorBloodType;
   private String donorAddress;
public Donor() {
	super();
	// TODO Auto-generated constructor stub
}
public Donor(int donorId, int donorAge, String donorPhoneNumber, String donorName, String donorGender,
		String donorBloodType, String donorAddress) {
	super();
	this.donorId = donorId;
	this.donorAge = donorAge;
	this.donorPhoneNumber = donorPhoneNumber;
	this.donorName = donorName;
	this.donorGender = donorGender;
	this.donorBloodType = donorBloodType;
	this.donorAddress = donorAddress;
}
public int getDonorId() {
	return donorId;
}
public void setDonorId(int donorId) {
	this.donorId = donorId;
}
public int getDonorAge() {
	return donorAge;
}
public void setDonorAge(int donorAge) {
	this.donorAge = donorAge;
}
public String getDonorPhoneNumber() {
	return donorPhoneNumber;
}
public void setDonorPhoneNumber(String donorPhoneNumber) {
	this.donorPhoneNumber = donorPhoneNumber;
}
public String getDonorName() {
	return donorName;
}
public void setDonorName(String donorName) {
	this.donorName = donorName;
}
public String getDonorGender() {
	return donorGender;
}
public void setDonorGender(String donorGender) {
	this.donorGender = donorGender;
}
public String getDonorBloodType() {
	return donorBloodType;
}
public void setDonorBloodType(String donorBloodType) {
	this.donorBloodType = donorBloodType;
}
public String getDonorAddress() {
	return donorAddress;
}
public void setDonorAddress(String donorAddress) {
	this.donorAddress = donorAddress;
}
@Override
public String toString() {
	return "Donor [donorId=" + donorId + ", donorAge=" + donorAge + ", donorPhoneNumber=" + donorPhoneNumber
			+ ", donorName=" + donorName + ", donorGender=" + donorGender + ", donorBloodType=" + donorBloodType
			+ ", donorAddress=" + donorAddress + "]";
}
public static Donor getDonorDetails(String donorBloodType2) {
	// TODO Auto-generated method stub
	return null;
}

    
}