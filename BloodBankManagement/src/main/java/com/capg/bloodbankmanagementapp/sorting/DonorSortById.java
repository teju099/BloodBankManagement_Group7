package com.capg.bloodbankmanagementapp.sorting;

import java.util.Comparator;

import com.capg.bloodbankmanagementapp.beans.Donor;

public class DonorSortById implements Comparator<Donor>{

	public int compare(Donor d1, Donor d2) {
		return d1.getDonorId() - (d2.getDonorId());
	}
}