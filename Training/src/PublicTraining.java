//derived class
public class PublicTraining extends Training {

	private int partcipants;
	private double cost;
	
	public PublicTraining(int id, String subject, double fees, int partcipants ) {
		super(id, subject, fees);
		this.partcipants = partcipants;
		
	}
	
	public void getOrderValue() 
	{
		this.cost=partcipants*getFees();
	}

	public double getCost() {
		return cost;
	}

	
	
	
}
