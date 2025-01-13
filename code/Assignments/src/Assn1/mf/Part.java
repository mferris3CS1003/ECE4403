package Assn1.mf;

public class Part {
  private String code;
  private double cost;
  public Part(String code, double cost) {
    this.code = code;
    this.cost =cost;
}
  public String getcode() {
	  return code;
  }
 public String toString() {
	 return String.format("part %s: $%.2f", code, cost);
 }
  }
