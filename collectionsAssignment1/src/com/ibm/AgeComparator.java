package com.ibm;

import java.util.Comparator;

public class AgeComparator implements Comparator {

	@Override
//	public int compare(Object o1, Object o2) {
//		int result = ((Employee) o1).getAge().compareTo(((Employee) o2).getAge());
//		if (result == 0) {
//			return ((Employee) o1).getDateOfJoining().compareTo(((Employee) o2).getDateOfJoining());
//		}
//
//		return result;
//	}
	
	
	public int compare(Object o1,Object o2)
	{
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		if(e1.getAge()==e2.getAge())
			return e1.getDateOfJoining().compareTo(e2.getDateOfJoining());
		else if(e1.getAge()>e2.getAge())
			return 1;
		else
			return -1;
		
		
	}
	
	

}
