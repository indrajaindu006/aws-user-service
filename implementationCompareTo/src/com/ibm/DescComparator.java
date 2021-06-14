package com.ibm;

import java.util.Comparator;

public class DescComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		return ((ToDo)o1).getDesc().compareTo(((ToDo)o2).getDesc());
	}

}
