//parent class training
abstract public class Training {

	private int id;
	private String subject;
	private double fees;
	
	public Training(int id, String subject, double fees) 
	{
		super();
		this.id = id;
		this.subject = subject;
		this.fees = fees;
	}

	public double getFees() {
		return fees;
	}
	
	abstract public  void getOrderValue();
	abstract public double getCost() ;


}


	

	


	
	
	
	
	
