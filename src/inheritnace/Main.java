package inheritnace;

import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		Developer dev = new Developer();
		dev.setName("George");
		dev.setSalary(5678);
		dev.linkedInId = "GeorgeDev";
		
		dev.work(); //Java Developer is Developing Application
		
		System.out.println(dev.getName());//George
		System.out.println(dev.position);//Java Developer //Called from Developer class
		System.out.println(dev.getPositon());//ScrumTeamMember //called from ScrumTeamMember Class, since getPosition us defined in this class
		dev.setPosition("Java Manuel TEster");//this is called from mother class(ScrumTeamMember), since setter and getter are there
		System.out.println(dev.getPositon());//Java Manuel TEster
		System.out.println(dev.position);//Java Developer, this is called from Developer class since position is declared in there as a variable,
		
		System.out.println();
		
		ScrumTeamMember m1 = new ScrumTeamMember();
		m1.work();// scrumTeamMember is working...
		System.out.println("m1 position: " + m1.getPositon());//m1 position: ScrumTeamMember
		m1.position ="STM";//we changed the position
		System.out.println("m1 position --: " + m1.position);//m1 position --: STM
		System.out.println("m1 position --: " + m1.getPositon());//m1 position --: STM
		
		System.out.println();
		
		SDET sdet  = new SDET();
		sdet.work();
		sdet.setPosition("SdT");
		
		System.out.println(sdet.getPositon());
//		sdet.position = "sdfc"; //not compile since position is private in SDET class.
		System.out.println();
		
	}

}
