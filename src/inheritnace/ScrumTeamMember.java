 package inheritnace;

public class ScrumTeamMember {
	
	
	private String name;
	protected String position = "ScrumTeamMember";
	private int salary;

	public void work() {
		System.out.println(position + " is working...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPositon() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
