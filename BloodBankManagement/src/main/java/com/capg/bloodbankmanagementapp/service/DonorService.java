package com.capg.bloodbankmanagementapp.service;
import java.util.*;
import com.capg.bloodbankmanagementapp.beans.Donor;
import com.capg.bloodbankmanagementapp.exception.InvalidBloodTypeException;
import com.capg.bloodbankmanagementapp.exception.InvalidIdException;

public interface DonorService {

	public boolean insertDonor(Donor donor)throws InvalidBloodTypeException;
	public Donor getDonorDetailsByID(int donorID) throws InvalidIdException;
	public Donor getDonorDetails(String DonorBloodType) throws InvalidBloodTypeException;
	public List<Donor> getDonorDetailsRange(int Range1,int Range2);
	public boolean modifyDonorDetails(String newdonorBloodType,int donorID)
			throws InvalidBloodTypeException,Exception;
}