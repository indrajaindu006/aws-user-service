package com.ibm;

import java.util.Comparator;

public class IdCompare implements Comparator {

	public int compare(Object o1, Object o2) {

		return ((ToDo) o1).getId().compareTo(((ToDo) o2).getId());
	}
}
