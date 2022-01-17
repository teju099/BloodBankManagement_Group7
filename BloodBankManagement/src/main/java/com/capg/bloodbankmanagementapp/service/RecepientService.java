package com.capg.bloodbankmanagementapp.service;

import java.util.*;

import com.capg.bloodbankmanagementapp.beans.Donor;
import com.capg.bloodbankmanagementapp.beans.Recepients;
import com.capg.bloodbankmanagementapp.exception.InvalidBloodTypeException;
import com.capg.bloodbankmanagementapp.exception.InvalidIdException;

public interface RecepientService{
	public boolean insertRecepient(Recepients recepient)throws InvalidBloodTypeException;
	public Recepients getRecepientDetailsByID(int recepientID) throws InvalidIdException;
	public boolean SearchBloodType(String BloodType) throws InvalidBloodTypeException;
	public List<Recepients> getRecepientDetailsRange(int Range1,int Range2) ;
	public boolean modifyRecepientDetails(String newrecepientBloodType,int recepientID)
			throws InvalidBloodTypeException,InvalidIdException;
	
}