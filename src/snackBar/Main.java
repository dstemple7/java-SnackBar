package snackBar;

public class Main 
{
	private static void workWithData()
	{
		System.out.println("Time for some grub!");

		// public Snack(String name, int quantity, double cost, int vendingMachineId)
		Snack s1 = new Snack("Chips", 36, 1.75, 1);
		Snack s2 = new Snack("Chocolate Bar", 36, 1.00, 1);
		Snack s3 = new Snack("Pretzel", 30, 2.00, 1);
		Snack s4 = new Snack("Soda", 24, 2.50, 2);
		Snack s5 = new Snack("Water", 20, 2.75, 2);

		// public VendingMachine(String name)
		VendingMachine v1 = new VendingMachine("Food");
		VendingMachine v2 = new VendingMachine("Drink");
		VendingMachine v3 = new VendingMachine("Office");

		// 	public Customer(String name, double cashOnHand)
		Customer c1 = new Customer("Jane", 45.25);
		Customer c2 = new Customer("Bob", 33.14);

		// Customer 1 cash on hand 37.75
		// Quantity of snack 4 is 21
		// Customer 1 cash on hand 35.75
		// Quanity of snack 3 is 29
		// Customer 2 cash on hand 28.14
		// Quantity of snack 4 is 19
		// Customer 1 cash on hand 45.75
		// Customer 1 cash on hand 44.75
		// Quantity of snack 2 is 35
		// Quantity of snack 3 is 41
		// customer 2 cash on hand 22.14
		// Quantity of snack 3 is 38

		 // PROCESSING
		 // Customer 1 (Jane) buys 3 of snack 4 (Soda).
		c1.buySnacks(s4.getTotalCost(3));
		s4.snacksBought(3);
		 // Print Customer 1 (Jane) Cash on hand.
		System.out.println(c1.getName() + " cash on hand " + c1.getCashOnHand());
		 // Print quantity of snack 4 (Soda).
		System.out.println("Quantity of snack 4 is " + s4.getQuantity());
		 // Customer 1 (Jane) buys 1 of snack 3 (Pretzel).
		c1.buySnacks(s3.getTotalCost(1));
		s3.snacksBought(1);
		 // Print Customer 1 (Jane) Cash on hand.
		System.out.println(c1.getName() + " cash on hand " + c1.getCashOnHand());
		 // Print quantity of snack 3 (Pretzel).
		System.out.println("Quantity of snack 3 is " + s3.getQuantity());
		 // Customer 2 (Bob) buys 2 of snack 4 (Soda).
		c2.buySnacks(s4.getTotalCost(2));
		s4.snacksBought(2);
		 // Print Customer 2 (Bob) Cash on Hand.
		System.out.println(c2.getName() + " cash on hand " + c2.getCashOnHand());
		 // Print quantity of snack 4 (Soda).
		System.out.println("Quantity of snack 4 is " + s4.getQuantity());
		 // Customer 1 (Jane) finds $10.
		c1.addCash(10);
		 // Print Customer 1 (Jane) Cash on Hand.
		System.out.println(c1.getName() + " cash on hand " + c1.getCashOnHand());
		 // Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
		c1.buySnacks(s2.getTotalCost(1));
		s2.snacksBought(1);
		 // Print Customer 1 (Jane) Cash on Hand.
		System.out.println(c1.getName() + " cash on hand " + c1.getCashOnHand());
		 // Print quantity of snack 2 (Chocolate Bar).
		System.out.println("Quantity of snack 2 is " + s2.getQuantity());
		 // Add 12 more items to snack 3 (Pretzel).
		s3.addQuantity(12);
		 // Print quantity of snack 3 (Pretzel).
		System.out.println("Quantity of snack 3 is " + s3.getQuantity());
		 // Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
		c2.buySnacks(s3.getTotalCost(3));
		s3.snacksBought(3);
		 // Print Customer 2 (Bob) Cash on hand.
		System.out.println(c2.getName() + " cash on hand " + c2.getCashOnHand());
		 // Print quantity of snack 3 (Pretzel).
		System.out.println("Quantity of snack 3 is " + s3.getQuantity());
	}

	public static void main(String[] args)
	{
		workWithData();
	}
}