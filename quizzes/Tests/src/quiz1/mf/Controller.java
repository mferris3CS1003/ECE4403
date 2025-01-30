package quiz1.mf;

public class Controller {

	public static void main(String[] args) {
		Pharmacy P1=new Pharmacy("E3B 1Y2");
		Pharmacy P2=new Pharmacy("E3B 1Z6");
		Distributor D1 =new Distributor();
		D1.synthesize(100);
        P1.Restock(D1.DistributeTo(P1.postalCode,50 ));
        System.out.println(P1);
        P2.Restock(D1.DistributeTo(P2.postalCode, 50));
        System.out.println(P2);
        P1.vaccinate(25);
        System.out.println(P1);
        P1.vaccinate(30);
        System.out.println(P1);
        P1.vaccinate(25);
        System.out.println(P1);
        P2.vaccinate(30);
        System.out.println(P2);
        P2.vaccinate(30);
        System.out.println(P2);
        P1.Restock(D1.DistributeTo(P1.postalCode,50 ));
        System.out.println(P1);
        D1.synthesize(100);
        P1.Restock(D1.DistributeTo(P1.postalCode,50 ));
        System.out.println(P1);
        P2.vaccinate(20);
        System.out.println(P2);
        System.out.println(Pharmacy.total());
	}

}
