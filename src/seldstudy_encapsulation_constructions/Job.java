package seldstudy_encapsulation_constructions;

public class Job {
	private String title;
	private String company;
	private double annualSalary;

	public Job() {
		System.out.println("1 - No-args constructions");
	}

	public Job(String title) {
		this.title = title;
		System.out.println("2 - One-args constructions");
	}

	public Job(String title, String company) {
		System.out.println("3 - Two-args construction");
		this.title = title;
		this.company = company;
	}

	public Job(String title, String company, double annualSalary) {
		System.out.println("4 - Three-args construction");
		this.title = title;
		this.company = company;
		this.annualSalary = annualSalary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	public String toString() {
		return "Job title: " + title + "| Company: " + company + 
				"| AnnualSalary: " + annualSalary;
	}
	
	

}
