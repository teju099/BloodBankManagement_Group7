package com.capg.bloodbankmanagementapp.service;

import java.util.List;

import com.capg.bloodbankmanagementapp.beans.Donor;
import com.capg.bloodbankmanagementapp.dao.DonorDAO;
import com.capg.bloodbankmanagementapp.dao.DonorDAOImpl;
import com.capg.bloodbankmanagementapp.exception.InvalidBloodTypeException;
import com.capg.bloodbankmanagementapp.exception.InvalidIdException;
public class DonorServiceImpl implements DonorService {
	
	DonorDAO donorDAO = new DonorDAOImpl();
	public boolean insertDonor(Donor donor) throws InvalidBloodTypeException{
		// TODO Auto-generated method stub
		DonorDAO donorDAO=new DonorDAOImpl();
		if(donor != null)
		{
			if(donor.getDonorId() >=1 && donor.getDonorBloodType()!=null)
			{
				
				if(donor.getDonorBloodType()!="A+"||donor.getDonorBloodType()!="A-"||donor.getDonorBloodType()!="B+"
						||donor.getDonorBloodType()!="B-"||donor.getDonorBloodType()!="AB+"||donor.getDonorBloodType()!="AB-"
						||donor.getDonorBloodType()!="O+"||donor.getDonorBloodType()!="O-")
				{
					throw new InvalidBloodTypeException();
				}
				else
				{
					// pass account to DB layer for insertion
					boolean isDataInserted = donorDAO.insertDonarDAO(donor);
					return isDataInserted;
				}
			}
			else
			{
				return false;
			}
		}
		return false;
	}
	
	public Donor getDonorDetails(String DonorBloodType) throws InvalidBloodTypeException {

		return donorDAO.getDonorDetails(DonorBloodType);
		
	}

	public List<Donor> getDonorDetailsRange(int Range1, int Range2) {
		DonorDAO donorDAO=new DonorDAOImpl();
		List<Donor> allDonorDetails = null;
		if(Range1<Range2)
		{
			allDonorDetails = donorDAO.getDonorDetails(Range1,Range2);
			return allDonorDetails;
		}
		else return null;
	}
	

	public boolean modifyDonorDetails(String newdonorBloodType, int donorID) throws InvalidBloodTypeException,Exception 
	{
		DonorDAO donorDAO=new DonorDAOImpl();
		String validBloodTypes[] = 
			{
					"A+","A-","B+","B-","AB+","AB-","O+","O-"
			};
		boolean isValidBloodType = false;
		// check the new branch Name ,if not exist then should raise an Exception
		
		if(getDonorDetailsByID(donorID)!= null)
		{
			
			for (String availableBloodType : validBloodTypes) {
				if(newdonorBloodType.equals(availableBloodType))
				{
					isValidBloodType = true;
					boolean status = donorDAO.modifyDonorDetails(newdonorBloodType, donorID);
					return status;
				}
			}
			if(!isValidBloodType)
			{
				throw new InvalidBloodTypeException();
			}
		}
		else
		{
			throw new Exception();
		}
			
		return false;
		
	}
	
	public Donor getDonorDetailsByID(int donorID) throws InvalidIdException {
		// TODO Auto-generated method stub
		DonorDAO donorDAO=new DonorDAOImpl();
		Donor donor=donorDAO.getDonorDetailsByID(donorID);
		if(donor == null)
		{
			throw new InvalidIdException();
		}
		return donor;
	}


}