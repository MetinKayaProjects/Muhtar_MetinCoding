package self_study;

public class RemoveSpaces {
	public static void main(String[] args) {
		
		
		/*
		 * Question-7: Write Java Code To Get Rid Of Multiple Spaces From A String?
String input = “Try    to    remove   extra   spaces.“; 
Bosluklari aldiktan sonra normal bosluklu bir cumle yazdir.
		 */
		String input = "Try    to    remove   extra   spaces.";
		System.out.println(input);
		String newStr = "";
		String[] arrInput =input.split(" ");
		
//		for(String a:arrInput) {
//			System.out.print(a);
//		}
//		System.out.println();
		
		for (int i = 0; i < arrInput.length; i++) {
			//arrInput[i] = arrInput[i].trim();
			newStr += arrInput[i].trim()+ " ";
			
		}
		System.out.println(newStr);
		
		
		
	}

}
