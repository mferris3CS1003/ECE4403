package Assn1.mf;

public class Buyer {
	  private int buyerId;
	  private static int latestBuyerId=0;
	  private static final String ACCESS_KEY= "TEST";
	  private String status;
	public Buyer() {
	    this.buyerId = 0;
	    this.status= "NONMEMBER";
	    
	}  
	 
	  public int getStatus(String memberKEY) {
		 if (memberKEY.equals(this.ACCESS_KEY)){
			 this.status="MEMBER";
			 buyerId=++latestBuyerId;
		 }
		return buyerId;
	  }
	  public String toString() {
			 return String.format("buyer %d: %s", buyerId, status );
		 }
}
