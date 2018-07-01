
public class Part extends Item {

	public Part(String name, double price) {
		super(name, price);

	}

	@Override
	public double calculatePrice(int depth) {
		System.out.println(toString(depth));
		return getPrice();
	}

	public String toString(int depth) {
		String tabs = "";
		for (int i = 0; i < depth; i++) {
			tabs += "\t";
		}
		return tabs + "Part [price=" + getPrice() + ", name=" + getName() + "]";
	}

}
