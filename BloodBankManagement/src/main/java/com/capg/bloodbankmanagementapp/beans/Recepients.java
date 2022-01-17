package com.capg.bloodbankmanagementapp.beans;

public class Recepients {
	
   private int recepientId;
   private int recepientAge;
   private	String recepientPhoneNumber;
    
   private String recepientname;
   private String recepientGender;
  
   private String recepientBloodType;
   private String recepientAddress;
   public Recepients() {
	super();
	// TODO Auto-generated constructor stub
    }
public Recepients(int recepientId, int recepientAge, String recepientPhoneNumber, String recepientname,
		String recepientGender, String recepientBloodType, String recepientAddress) {
	super();
	this.recepientId = recepientId;
	this.recepientAge = recepientAge;
	this.recepientPhoneNumber = recepientPhoneNumber;
	this.recepientname = recepientname;
	this.recepientGender = recepientGender;
	this.recepientBloodType = recepientBloodType;
	this.recepientAddress = recepientAddress;
}
public int getRecepientId() {
	return recepientId;
}
public void setRecepientId(int recepientId) {
	this.recepientId = recepientId;
}
public int getRecepientAge() {
	return recepientAge;
}
public void setRecepientAge(int recepientAge) {
	this.recepientAge = recepientAge;
}
public String getRecepientPhoneNumber() {
	return recepientPhoneNumber;
}
public void setRecepientPhoneNumber(String recepientPhoneNumber) {
	this.recepientPhoneNumber = recepientPhoneNumber;
}
public String getRecepientname() {
	return recepientname;
}
public void setRecepientname(String recepientname) {
	this.recepientname = recepientname;
}
public String getRecepientGender() {
	return recepientGender;
}
public void setRecepientGender(String recepientGender) {
	this.recepientGender = recepientGender;
}
public String getRecepientBloodType() {
	return recepientBloodType;
}
public void setRecepientBloodType(String recepientBloodType) {
	this.recepientBloodType = recepientBloodType;
}
public String getRecepientAddress() {
	return recepientAddress;
}
public void setRecepientAddress(String recepientAddress) {
	this.recepientAddress = recepientAddress;
}
@Override
public String toString() {
	return "Recepients [recepientId=" + recepientId + ", recepientAge=" + recepientAge + ", recepientPhoneNumber="
			+ recepientPhoneNumber + ", recepientname=" + recepientname + ", recepientGender=" + recepientGender
			+ ", recepientBloodType=" + recepientBloodType + ", recepientAddress=" + recepientAddress + "]";
}
	
   
   
}