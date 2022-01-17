package com.capg.bloodbankmanagementapp.sorting;

import java.util.Comparator;
import com.capg.bloodbankmanagementapp.beans.Recepients;

public class RecepientSortById implements Comparator<Recepients>{

	public int compare(Recepients r1, Recepients r2) {
		return r1.getRecepientId() - (r2.getRecepientId());
	}
}