package snackBar;

public class Snack 
{
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	// constructor
	public Snack(String name, int quantity, double cost, int vendingMachineId)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
	}
	// getters
	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public int getQuantity()
	{
		return quantity;
	}
	public double getCost()
	{
		return cost;
	}

	public int getVendingMachineId()
	{
		return vendingMachineId;
	}

	public double getTotalCost(int amount)
	{
		return amount * this.cost;
	}

	// setters
	public void setName(String name)
	{
		this.name = name;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	public void setVendingMachineId(int vendingMachineId)
	{
		this.vendingMachineId = vendingMachineId;
	}

	public void snacksBought(int amount)
	{
		this.quantity = this.quantity - amount;
	}

	public void addQuantity(int amount)
	{
		this.quantity = this.quantity + amount;
	}
}