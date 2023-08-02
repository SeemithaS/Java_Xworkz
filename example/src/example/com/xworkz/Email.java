//ARRAY

package example.com.xworkz;

public class Email {
	
	public static void main(String[] args) {
		
		int age[]= {10,20,24};
		
		System.out.println(""+age[0]); 
		
		System.out.println("#######");  //forward
		for(int i=0; i < age.length ;i++) {
			System.out.println(age[i]);
		}
		
		age[0]=50;  
		System.out.println("#######"); //reverse
		for(int i=age.length-1; i>=0 ;i--) {
			System.out.println(age[i]);
		}
}
}
