package com.capg.bloodbankmanagementapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capg.bloodbankmanagementapp.beans.Donor;
import com.capg.bloodbankmanagementapp.exception.InvalidBloodTypeException;
import com.capg.bloodbankmanagementapp.exception.InvalidIdException;
import com.capg.bloodbankmanagementapp.util.DBConnection;


public class DonorDAOImpl implements DonorDAO {
   
	Connection con = DBConnection.con;
	PreparedStatement ps; // these are the statements which consist precompiled SQL quries
	//DonorDAO donorDAO=new DonorDAOImpl();
	public boolean insertDonarDAO(Donor donor){
		
		String sqlQuery = "insert into bloodbankmanagement.donor values(?,?,?,?,?,?,?)";
		
		try
		{
			ps = con.prepareStatement(sqlQuery);
			ps.setInt(1, donor.getDonorId());
			ps.setInt(2, donor.getDonorAge());
			ps.setString(3, donor.getDonorPhoneNumber());
			ps.setString(4, donor.getDonorName());
			ps.setString(5, donor.getDonorGender());
			ps.setString(6, donor.getDonorBloodType());
			ps.setString(7, donor.getDonorAddress());
			
			
			int i = ps.executeUpdate(); // DML, i holds the value :- number of rows effected
			if(i==1) return true;
			return false;
		}
		catch(Exception e)
		{
			System.out.println("Eception while Data Insertion "+e);
		}
		
		return false;
	}
	
	public Donor getDonorDetails(String DonorBloodType) {
		String sqlQuery = "select * from bloodbankmanagement.donor where donorBloodType = ?";
		try {
			ps = con.prepareStatement(sqlQuery);
			ps.setString(1, DonorBloodType);
			
			ResultSet rs =  ps.executeQuery();
			while(rs.next())
			{
				int donorId1 = rs.getInt("donorId");
				int donogAge=rs.getInt("donorAge");
				String donorname = rs.getString("donorName");
				String donorPhoneNumber = rs.getString("donorBloodType");
				String donorBloodType = rs.getString("donorBloodType");
				String donorGender = rs.getString("donorGender");
				String donorAddress = rs.getString("donorAddress");
				
				Donor obj = new Donor(donorId1,donogAge, donorname,donorPhoneNumber,donorBloodType,donorGender,donorAddress);
	            return obj;
			
			}
		} catch (Exception e) {
			
			System.out.println("Exception in getDonor by DonorId "+e);
		}

		return null;
	}

	public Donor getDonorDetailsByID(int donorId) throws InvalidIdException {
		String sqlQuery = "select * from bloodbankmanagement.donor where donorId = ?";
		try {
			ps = con.prepareStatement(sqlQuery);
			ps.setInt(1, donorId);
			
			ResultSet rs =  ps.executeQuery();
			while(rs.next())
			{
				int donorId1 = rs.getInt("donorId");
				int donogAge=rs.getInt("donorAge");
				String donorname = rs.getString("donorName");
				String donorPhoneNumber = rs.getString("donorPhoneNumber");
				String donorBloodType = rs.getString("donorBloodType");
				String donorGender = rs.getString("donorGender");
				String donorAddress = rs.getString("donorAddress");
				Donor obj = new Donor(donorId1,donogAge,donorPhoneNumber, donorname,donorBloodType,donorGender,donorAddress);				
				return obj;
			}
		} catch (Exception e) {
			
			System.out.println("Exception in getAccount by accountNumber "+e);
		}
		
		
		return null;
	}
	public List<Donor> getDonorDetails(int Range1, int Range2) {
		
		String sqlQuery = "select * from bloodbankmanagement.donor where donorAge>=? and donorAge<=?";
		List<Donor> donorsList = new ArrayList<Donor>();
		
		try {
			ps = con.prepareStatement(sqlQuery);
			ps.setInt(1, Range1);
			ps.setInt(2, Range2);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				
				int donorId1 = rs.getInt("donorId");
				int donogAge=rs.getInt("donorAge");
				String donorname = rs.getString("donorName");
				String donorPhoneNumber = rs.getString("donorPhoneNumber");
				String donorBloodType = rs.getString("donorBloodType");
				String donorGender = rs.getString("donorGender");
				String donorAddress = rs.getString("donorAddress");
				Donor obj = new Donor(donorId1,donogAge, donorname,donorPhoneNumber,donorBloodType,donorGender,donorAddress);				
				donorsList.add(obj);
				
			}
			return donorsList;
			
		} catch (SQLException e) {
			System.out.println("Exception in getDonor by age range "+e);
		}
		return null;
	}
	public boolean modifyDonorDetails(String newdonorBloodType, int donorID)
			throws InvalidBloodTypeException, Exception {
		try {
			String sqlQuery = "update bloodbankmanagement.donor set donorBloodType = ? where donorId = ?";
			ps = con.prepareStatement(sqlQuery);
			ps.setString(1, newdonorBloodType);
			ps.setInt(2, donorID);
			
			int i = ps.executeUpdate(); // DML, i holds the value :- number of rows effected
			if(i>0) return true;
			return false;
			
		} catch (Exception e) {
			System.out.println("Exception in bloodtype modification "+e);
		}
		
		return false;
	}
	public boolean insertDonorDAO(Donor donor) throws InvalidBloodTypeException {
		// TODO Auto-generated method stub
		return false;
	}
}