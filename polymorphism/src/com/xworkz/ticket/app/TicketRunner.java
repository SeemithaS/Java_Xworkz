package com.xworkz.ticket.app;

public class TicketRunner {
	
	public static void main(String[] args) {
		System.out.println("Running main in TicketRunner");
		
		Ticket ticket=new BalconyTicket();
		ticket.entry();
		
	}

}
