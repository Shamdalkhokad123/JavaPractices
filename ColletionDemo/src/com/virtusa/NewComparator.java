package com.virtusa;

import java.util.Comparator;

public class NewComparator implements Comparator<Employee> {

	public int compare(Employee o1,Employee o2) {
		int em1 = o1.getEmpno();
		int em2 = o2.getEmpno();
		
		int res = (em1<em2)?1:-1;
		return res;
	}

}
