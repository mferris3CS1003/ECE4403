package Assn1.mf;

import java.util.ArrayList;

public class Order {
	private int uniqueId;
	private double total=0;
	ArrayList<Part> partList = new ArrayList<Part>();
	public Order(int givenId) {
		this.uniqueId=givenId;
		 
	}
	public void addPart(Part P1) {
		partList.add(P1);
		total+=P1.getPrice();
	}
	public double getTotal() {
		return total;
	}
	public void printOrder() {
		System.out.println(String.format("Order %d: :%d parts - total: $%.2f", uniqueId, partList.size(), this.getTotal()));
		for(int i=0; i<partList.size();i++) {
		System.out.println(partList.get(i));
		}
	}
}
