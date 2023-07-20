class Wood{
	String type;
	double price;
	String woodName;
	String color;
	float weight;
	Wood(String type){
		super();
		this.type=type;
		System.out.println("Invoking string constructor of Wood");	
	}
	Wood(String type,double price){
		this(type);
		this.price=price;
		System.out.println("Invoking string.double constructor of Wood");
	}
	Wood(String type,double price,String woodName){
		this(type,price);
		this.woodName=woodName;
		System.out.println("Invoking string,double,String constructor of Wood");
	}
	Wood(String type,double price,String woodName,String color){
		this(type,price,woodName);
		this.color=color;
		System.out.println("Invoking string,double,String,string constructor of Wood");
	}
	Wood(String type,double price,String woodName,String color,float weight){
		this(type,price,woodName,color);
		this.weight=weight;
		System.out.println("Invoking string,double,String,string,float constructor of Wood");
	}
	
	
}