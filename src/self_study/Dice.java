package self_study;
import java.util.*;

import seldstudy_encapsulation_constructions.Job;
public class Dice {
	public static void main(String[] args) {
		
		Job j1 = new Job();
		Job j2 = new Job("Developer");
		Job j3 = new Job("BA", "Amazon");
		Job j4 = new Job("SM", "Delta", 125000);
		
		
		System.out.println(j1.toString());
		System.out.println(j2.toString());
		System.out.println(j3.toString());
		System.out.println(j4.toString());
		
		System.out.println(j1.getTitle());
		System.out.println(j1.getCompany());
		System.out.println(j1.getAnnualSalary());
		
		j1.setTitle("PO");
		System.out.println(j1.getTitle());
		
		System.out.println(j2.getTitle());
		System.out.println(j2.getCompany());
		System.out.println(j2.getAnnualSalary());
		System.out.println(j2.getClass());
		
		System.out.println(j3.toString().toUpperCase());
		
		List<Job> jList = new ArrayList<Job>();
		jList.add(new Job("SDET", "Amazon", 123000));
		jList.add(new Job("PO", "FredieMac", 100000));
		jList.add(new Job("SM", "WP", 200000));
		jList.add(new Job("Dev", "Boing", 230000));
		jList.add(new Job("QA", "Siemens", 125000));
		
		System.out.println(jList.toString());
		
		System.out.println(jList.get(0).getTitle());
		
		System.out.println(jList.get(1).getCompany());
		System.out.println(jList.get(2).getAnnualSalary());
		System.out.println();
		System.out.println(jList.get(0).getAnnualSalary());
		System.out.println(jList.get(1).getAnnualSalary());
		System.out.println(jList.get(2).getAnnualSalary());
		System.out.println(jList.get(3).getAnnualSalary());
		System.out.println(jList.get(4).getAnnualSalary());
		
		double maxSal = jList.get(0).getAnnualSalary();
		int index = 0;
		for (int i = 0; i < jList.size(); i++) {
			if (jList.get(i).getAnnualSalary() > maxSal) {
				maxSal = jList.get(i).getAnnualSalary();
				index = i ;
					
			}
			
		}
		System.out.println();
		
		System.out.println(jList.get(index).toString());
		//System.out.println(jList.get(i).toString);
		System.out.println(maxSal);
		
		System.out.println(jList.get(index).getCompany().toUpperCase());
		
		
		
		
		
	}

}
