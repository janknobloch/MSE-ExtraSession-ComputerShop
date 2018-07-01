import java.util.LinkedList;
import java.util.List;

public class Component extends Item {

	private List<Item> items;

	public Component(String name, double price) {
		super(name, price);
		items = new LinkedList<Item>();
	}

	@Override
	public double calculatePrice(int depth) {
		double overall = getPrice();

		System.out.println(toString(depth));
		for (Item i : items) {
			overall += i.calculatePrice(depth + 1);
		}
		return overall;
	}

	public void addItem(Item i) {
		items.add(i);
	}

	public void removeItem(Item i) {
		items.remove(i);
	}

	public String toString(int depth) {
		String tabs = "";
		for (int i = 0; i < depth; i++) {
			tabs += "\t";
		}
		return tabs + "Component [price=" + getPrice() + ", name=" + getName() + "]";
	}
}
