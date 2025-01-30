package quiz1.mf;

public class Distributor {
 private static int doseCounter=0;
	
	
	public void synthesize(int addedDoses) {
		doseCounter=doseCounter+addedDoses;
	}
	
	public int DistributeTo(String postalCode, int dosesNeeded) {
		if (doseCounter>=dosesNeeded) {
			doseCounter=doseCounter-dosesNeeded;
			System.out.print("Delivered to- ");
			return dosesNeeded;
		}
		else {System.out.print("Backordered to (OUT OF STOCK)- ");
		return 0;}
	}
}
