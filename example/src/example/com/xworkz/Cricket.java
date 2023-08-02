//INSTANCE VARIABLE INITIALIZATION CAN BE DONE IN 4 WAYS:

package example.com.xworkz;

public class Cricket {
	
	public int player=11; //literals
	
	Cricket(int player){
		
		this.player=player; //using constructor
		System.out.println(this.player);
}
	public void over(int player) {
		
		System.out.println("Player numbers:"+player);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricket cricket1=new Cricket(34);
		System.out.println("player:"+cricket1.player); //reference
		cricket1.over(36); //using method
	}
	
}
