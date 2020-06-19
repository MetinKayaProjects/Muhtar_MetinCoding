package inheritnace;

public class Developer extends ScrumTeamMember {
//	private String name;
//	private String position = "Developer";
//	private int salary;
	protected String linkedInId;
	protected String position = "Java Developer";
	//method :work
	
	
	public void work() {
		System.out.println(position + " is Developing Application");
	}
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public String getPosition() {
//		return position;
//	}
//	
////	public void setPosition(String position) {
////		this.position = position;
////	}
//	
//	public int getSalary() {
//		return salary;
//	}
//	
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}

}
