//class for corporatetraining to calculate the cost
public class CorporateTraining extends Training {
	
	
	private int days;
	private double cost;
	

	public CorporateTraining(int id, String subject, double fees, int days) 
	{
		super(id, subject, fees);
		this.days = days;
	}

	public void getOrderValue() 
	{
		this.cost=days*getFees();
	}

	public double getCost() {
		return cost;
	}
}
