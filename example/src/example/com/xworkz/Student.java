package example.com.xworkz;

public class Student {
	
	public String name;
	public int rollno;
	
	public Student() {
		super();
		System.out.println("no arg constructor");
	}
	
	public Student(String name) {
		this.name=name;
		//System.out.println("name:"+name);
	}
	
	public Student(String name,int rollno) {
		this(name);
		this.rollno=rollno;
		//System.out.println("name:"+name);
		//System.out.println("rollno:"+rollno);
		
	}
	

	public static void main(String[] args) {
		
		Student student=new Student();
		System.out.println(student.name);
		System.out.println(student.rollno);
		
		System.out.println("############");
		
		Student student1=new Student("seemitha");
		System.out.println(student1.name);
		System.out.println(student1.rollno);
		

		System.out.println("############");
		
		Student student2=new Student("sinchu",56);
		System.out.println(student2.name);
		System.out.println(student2.rollno);
		

		

	}

}
