import java.util.Scanner;

public class Player {
	int ID;
	int position;
	int money;
	
	Scanner sc = new Scanner(System.in);
	
	public Player(int ID, int position, int money) {
		this.ID = ID;
		this.position = position;
		this.money = money;
	}
	
	public void movePlayer(Board board) {
		int spaces = (int)(Math.random() * 6) + 1;
		position += spaces;
		System.out.println(String.format("player %d moved %d spaces", ID, spaces));
		//if passing go
		if(position > board.properties.length - 1) {
			position -= board.properties.length;
			money += 200;
			System.out.println(String.format("player %d passed go", ID));
			System.out.println("you now have " + money);
		}
	}
	
	public void checkProperty(Board board) {
		Property property = board.properties[position];
		
		//if it's the first space of the board
		if(property == null) {return;}
		
		else if(property.owner == null) {
			System.out.println(String.format("buy %s? cost: %s rent: %s", property.name, property.cost, property.rent));
			if(property.cost > money) {
				System.out.println("you don't have enough money for this propety");
				return;
			}
			String choice = sc.nextLine();
			if(choice.equals("yes")){
				property.buy(this);
				System.out.println("you have bought " + property.name);
				System.out.println("you now have " + money);
			}
		} else if(property.owner != this) {
			System.out.println(String.format("this property belongs to  player%s. pay %d", property.owner.ID, property.rent));
			property.rent(this, property.owner);
			System.out.println("you now have " + money);
			System.out.println("player " + property.owner.ID + " now has " + property.owner.money);
		} 
	}
}
