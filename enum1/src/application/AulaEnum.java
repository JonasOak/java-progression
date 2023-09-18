package application;

import java.util.Date;
import java.util.Scanner;

import entities.Order;
import entities.enums.OrderStatus;

public class AulaEnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe seu ID: ");
		Integer id = sc.nextInt();
		System.out.printf("Informe a condição do pedido: ");
		sc.nextLine();
		OrderStatus status = OrderStatus.valueOf(sc.nextLine());
		Order pedido = new Order(id, new Date(), status);

		for (OrderStatus x : OrderStatus.values()) {
			System.out.printf("CONDIÇÃO: %s\nPEDIDO:\n%s\n", x, pedido);
		}

		sc.close();

		
		
	}

}
