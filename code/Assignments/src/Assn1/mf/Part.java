package Assn1.mf;

public class Part {
  private String code;
  private double cost;
  private String Desc;
  public Part(String code, String Desc, double cost) {
    this.code = code;
    this.cost =cost;
    this.Desc=Desc;
}
  public String getcode() {
	  return code;
  }
  public String getDescription() {
	  return Desc;
  }
  public double getPrice() {
	  return cost;
  }
  
 public String toString() {
	 return String.format("part %s: %s $%.2f", code, Desc, cost);
 }
  }
