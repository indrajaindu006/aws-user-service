package com.ibm;

import java.util.Comparator;

public class PriorityComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		return ((ToDo)o1).getPriority().compareTo(((ToDo)o2).getPriority());
	}

}
