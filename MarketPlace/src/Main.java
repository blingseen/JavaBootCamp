import inventory.Inventory;
import inventory.Parts;

public class Main {
	public static void main(String args[]){
		Inventory item1 = new Parts("Door",4,10.99,"Chevy","A");
		System.out.println(item1);
		//System.out.println((Parts) item1);
	}
}
