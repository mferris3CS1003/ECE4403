package Assn1.mf;

import java.util.*;

public class APOController {

	public static void main(String[] args) {
		
		Part p1 = new Part("A","guh",2.0000);
		System.out.println("Part " + p1.getcode()
		 + ": " + p1.getDescription()
		 + " $" + p1.getPrice());
		
		Part p2 = new Part( "B", "guhh", 7);
        Buyer b1= new Buyer();
        Buyer b2=new Buyer();
        Buyer b3 = new Buyer();
        Buyer b4 = new Buyer();
        b1.getStatus("");
        b2.getStatus("guh");
        b3.getStatus("TEST");
        b4.getStatus("TEST");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        ArrayManipulator a1=new ArrayManipulator();
        System.out.println(Arrays.toString(a1.getEvenElements()));
        System.out.println(Arrays.toString(a1.getEvenIndices()));
        Order o1 =new Order(1001);
        o1.addPart(p1);
        o1.addPart(p2);
        o1.printOrder();
	}

}
