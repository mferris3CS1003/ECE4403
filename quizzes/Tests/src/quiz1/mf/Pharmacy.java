package quiz1.mf;

public class Pharmacy {
public String postalCode;
public static int allJabs=0;
private int pending;
private int administered;
private int available;

	public Pharmacy(String postalCode) {
		this.postalCode=postalCode;}
public void Restock(int incomingVaccines) {
	available+=incomingVaccines;
	
}
public void vaccinate(int jabsWanted) {
	if (available>=pending) {available-=pending;
	administered+=pending;
	allJabs+=pending;
	pending=0;
	
	
	if (available>=jabsWanted) {available-=jabsWanted;
	administered+=jabsWanted;
	allJabs+=jabsWanted;}
	else {jabsWanted-=available;
    administered+=available;
    allJabs+=available;
    pending+=jabsWanted;
    available=0;
	}}
	else {pending-=available;
	administered+=available;
	allJabs+=available;
	pending+=jabsWanted;
	available=0;
	
	}}
	  public String toString() {
			 return String.format("Pharmacy %s: %d doses administered; %d doses available; %d pending", postalCode, administered, available, pending);
		 }
	public static String total(){
		//i know this is after unit 1 but also felt nice to use a static method
		return String.format("total globally administered: %d",allJabs);
	}
}

