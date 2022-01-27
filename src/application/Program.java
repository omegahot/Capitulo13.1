package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1000, new Date(), OrderStatus.PENDING_PEYMENT);
		System.out.println(order.toString());
		
		System.out.println("-----------------------------------");
		Order order2 = new Order(1001, new Date(), OrderStatus.valueOf("DELIVERED"));
		System.out.println(order2);
	}

}
