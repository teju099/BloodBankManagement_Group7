package com.capg.bloodbankmanagementapp.dao;
import java.util.List;

import com.capg.bloodbankmanagementapp.beans.Donor;
import com.capg.bloodbankmanagementapp.beans.Recepients;
import com.capg.bloodbankmanagementapp.exception.InvalidBloodTypeException;
import com.capg.bloodbankmanagementapp.exception.InvalidIdException;

public interface RecepientDAO {

	    public boolean searchForBloodType(String BloodType);
		public Recepients getRecepientDetailsByID(int donorID) throws InvalidIdException;
		public List<Recepients> getRecepientDetails(int Range1, int Range2);
		public boolean modifyRecepientDetails(String newdonorBloodType,int recepientID)
				throws InvalidBloodTypeException, InvalidIdException;
		public boolean insertRecepientDAO(Recepients r);
}