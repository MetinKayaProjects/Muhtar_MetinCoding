package muhtar;

public class InterviewQuestions {

	public static void main(String[] args) {
		
	
//	      a = a+b;
//	      b= a-b;
//	      a = a-b;
	        
	            int a=10;
	            int b=20;
	        
	                a=a^b; // 10^20=30   a=30
	                b=a^b; // 30^20=10   b = 10
	                a=a^b; // 30^10=20  a = 20;
	                
	            System.out.println(a+" "+b);
	            
	}    
	    
	    
	        /*
	            1. how did you use inheritance in your framework?
	                    all the reusable data we can store it in a class, and rest of the class can inherit them
	            
	            2. abstract class vs interface?
	            
	                    1. how to create an object from abstract class and interface?
	                                we cannot
	                    
	                    2. can u implement multiple interfaces to an abstract class?
	                            yes
	                    
	                    3. can abstract class be static?
	                        no
	                    
	                    4. can you have finalize method in an interface?
	                            no
	        
	            
	            3. how to swap two numbers without using third variable?
	                        a = a+b;
	                        b= a-b;
	                        a = a-b ;
	                        
	            4. can we have multiple classes in a single file? Yes
	                    can we have multiple public classes in a single file?
	                    no, only one public class
	                            
	            
	            5. what access modifiers can be used for class?
	                    public and default
	            
	            
	            6. can main method have final keyword?  yes
	                can main method have protected access modifier? NO
	            
	            
	            6. how can we monitor JVM in a production Environment?
	                    JConsole
	                    it's one of the monitoring tool that compiles to the 
	                    JMX (Java Management Extension).
	         
	         
	         
	         */
	        
	        
	        
	    
	
}
