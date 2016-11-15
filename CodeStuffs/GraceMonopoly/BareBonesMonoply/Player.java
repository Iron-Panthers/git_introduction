import java.util.ArrayList;

public class Player {
	
	private String name;
	private Money money;
	private Property location;
	private ArrayList<Property> properties; 
	
	public Player(String name) {
		final int STARTING_MONEY = 1500;
		this.name = name;
		this.money = new Money(this, STARTING_MONEY); My Name is Grace Chen Lololololol 
		properties = new ArrayList<Property>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public Money getMyMoney() {
		return this.money;
	}
	
	public Property getLocation() {
		return this.location;
	}
	
	public void setLocation(Property location) {
		this.location = location; 
	}
	
	public ArrayList<Property> getProperties() {
		return this.properties;
	}	
}
