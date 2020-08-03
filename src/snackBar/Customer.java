// TO DONE: 
// buy snacks. Given the total cost of the snacks to be purchased, reduce the cash on hand by that amount

package snackBar;

public class Customer 
{
	private static int maxId = 0;
	private int id;
	private String name;
	private double cashOnHand;

	// constructor
	public Customer(String name, double cashOnHand)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.cashOnHand = cashOnHand;
	}

	//getters: id, name, cashOnHand
	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public double getCashOnHand()
	{
		return cashOnHand;
	}

	// setters: name
	public void setName(String name)
	{
		this.name = name;
	}

	public void addCash(double amount)
	{
		this.cashOnHand = this.cashOnHand + amount;
	}

	public void buySnacks(double amount)
	{
		this.cashOnHand = this.cashOnHand - amount;
	}
	
}