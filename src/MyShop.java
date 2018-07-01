
public class MyShop {

	public static void main(String[] args) {

		Component computer = new Component("My Computer", 00.00);

		Part pc_case = new Part("CASE", 150.00);
		Part monitor = new Part("Monitor", 250.00);

		Component mainboard = new Component("Mainboard", 200.00);
		Part cpu = new Part("CPU", 250.00);
		Part ram = new Part("RAM", 250.00);
		mainboard.addItem(cpu);
		mainboard.addItem(ram);

		computer.addItem(pc_case);
		computer.addItem(mainboard);
		computer.addItem(monitor);

		System.out.println("\n\nOverall Price for my computer: "+computer.calculatePrice(0));

	}
}
