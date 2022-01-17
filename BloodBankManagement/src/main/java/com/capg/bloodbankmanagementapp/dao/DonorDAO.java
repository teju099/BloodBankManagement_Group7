package com.capg.bloodbankmanagementapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.capg.bloodbankmanagementapp.beans.Donor;
import com.capg.bloodbankmanagementapp.exception.InvalidBloodTypeException;
import com.capg.bloodbankmanagementapp.exception.InvalidIdException;

public interface DonorDAO {

		public Donor getDonorDetails(String donorBloodType);
		public Donor getDonorDetailsByID(int donorID) throws InvalidIdException;
		public List<Donor> getDonorDetails(int Range1, int Range2);
		public boolean modifyDonorDetails(String newdonorBloodType,int donorID)
				throws InvalidBloodTypeException, Exception;
		public boolean insertDonarDAO(Donor d);
		
}