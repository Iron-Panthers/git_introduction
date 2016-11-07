package october;

public class Money {
	int owner;
	int value;
	public Money(int owner, int value){
		this.owner=owner;
		this.value=value;
	}
	public double getMoney(){
		return value;
	}
}