//STATIC AND NON -STATIC METHOD
package example.com.xworkz;

public class Person {
	
	public static String item;
	
	public void run(String name) {
		System.out.println(""+name);
	}
	
	public void run(String name,int age) {
		System.out.println(""+name);
		System.out.println(""+age);
	}
	
	public static void sit(String pname) {
		System.out.println("invok sit");
		System.out.println(""+pname);
	}
	
	public static void sit(String pname,String item) {
		System.out.println(""+pname);
		System.out.println(""+item);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Running main");
		
		Person.item="chair";
		Person.sit("seemitha");
		Person.sit("Lakshmi",Person.item);
		
		System.out.println("#############");
		Person person=new Person();
		person.run("see");
		person.run("seem",20);
		
	}

}
