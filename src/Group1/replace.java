package Group1;

public class replace {
public static void main(String[] args) {
	
	stringReplace("Call the cat and dog");
	
	
}
public static void stringReplace(String str) {
	
	String [] strArr = str.split(" ");
	for (String s : strArr) {
		s = s.replaceAll("cat", "dog");
		System.out.println(s);
	}
	
	
	
}

}
