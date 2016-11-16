
public class Property {
	private double pvalue;
	private double mvalue;
	private double rent;
	public String name;
	public boolean isOwned;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public Property(String name, double pvalue, double mvalue, double rent) {
		this.pvalue = pvalue;
		this.mvalue = mvalue;
		this.rent = rent;
		this.name = name;
		boolean isOwned = false;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		String output = "";
		output += name;
		return name;
	}
	
}
