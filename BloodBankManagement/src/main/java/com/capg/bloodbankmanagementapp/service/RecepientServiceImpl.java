package com.capg.bloodbankmanagementapp.service;
import java.util.ArrayList;
import java.util.List;

import com.capg.bloodbankmanagementapp.beans.Donor;
import com.capg.bloodbankmanagementapp.beans.Recepients;
import com.capg.bloodbankmanagementapp.dao.DonorDAO;
import com.capg.bloodbankmanagementapp.dao.DonorDAOImpl;
import com.capg.bloodbankmanagementapp.dao.RecepientDAO;
import com.capg.bloodbankmanagementapp.dao.RecepientDAOImpl;
import com.capg.bloodbankmanagementapp.exception.InvalidBloodTypeException;
import com.capg.bloodbankmanagementapp.exception.InvalidIdException;
public class RecepientServiceImpl implements RecepientService {
	
	RecepientDAO recepientDAO = new RecepientDAOImpl();
	public boolean insertRecepient(Recepients recepient) throws InvalidBloodTypeException{
		// TODO Auto-generated method stub
		RecepientDAO recepientDAO=new RecepientDAOImpl();
		List<String> bloodTypes=new ArrayList<String>();
		bloodTypes.add("A+");
		bloodTypes.add("A-");
		bloodTypes.add("B+");
		bloodTypes.add("B-");
		bloodTypes.add("AB+");
		bloodTypes.add("AB-");
		bloodTypes.add("O+");
		bloodTypes.add("O-");
		if(recepient != null)
		{
			if(recepient.getRecepientId() >=1 && recepient.getRecepientBloodType()!=null)
			{
			   if(bloodTypes.contains(recepient.getRecepientBloodType())) {
				   
						// pass account to DB layer for insertion
						boolean isDataInserted = recepientDAO.insertRecepientDAO(recepient);
						return isDataInserted;
					
					   }
			   else {
				   throw new InvalidBloodTypeException();
			   }
				
			}
			else
			{
				return false;
			}
		}
		return false;
	}
	
	public boolean SearchBloodType(String BloodType) throws InvalidBloodTypeException{

		
		if(recepientDAO.searchForBloodType(BloodType))
			return true;
		else 
			return false;
	}

	public List<Recepients> getRecepientDetailsRange(int Range1, int Range2) {
		RecepientDAO recepientDAO=new RecepientDAOImpl();
		List<Recepients> allRecepientDetails = null;
		if(Range1<Range2)
		{
			allRecepientDetails = recepientDAO.getRecepientDetails(Range1,Range2);
			return allRecepientDetails;
		}
		else return null;
	}
	

	public boolean modifyRecepientDetails(String newrecepientBloodType, int recepientID) throws InvalidBloodTypeException,InvalidIdException 
	{
		RecepientDAO recepientDAO=new RecepientDAOImpl();
		String validBloodTypes[] = 
			{
					"A+","A-","B+","B-","AB+","AB-","O+","O-"
			};
		boolean isValidBloodType = false;
		// check the new branch Name ,if not exist then should raise an Exception
		
		if(getRecepientDetailsByID(recepientID)!= null)
		{
			
			for (String availableBloodType : validBloodTypes) {
				if(newrecepientBloodType.equals(availableBloodType))
				{
					isValidBloodType = true;
					boolean status = recepientDAO.modifyRecepientDetails(newrecepientBloodType, recepientID);
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
			throw new InvalidIdException();
		}
			
		return false;
		
	}
	public Recepients getRecepientDetailsByID(int recepientID) throws InvalidIdException {
		// TODO Auto-generated method stub
		RecepientDAO recepientDAO=new RecepientDAOImpl();
		Recepients recepient=recepientDAO.getRecepientDetailsByID(recepientID);
		if(recepient == null)
		{
			throw new InvalidIdException();
		}
		return recepient;
	}

}