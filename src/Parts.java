
public class Parts extends Inventory{
	private String manufacture;
	private String type;
	public Parts(String name, int quantity, double price, String m, String t) {
		super(name, quantity, price);
		manufacture=m;
		type=t;
	}
	@Override
	public String toString() {
		return "Parts [manufacture=" + manufacture + ", type=" + type + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
