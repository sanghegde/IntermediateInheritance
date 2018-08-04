//main function
public class TrainingTest {

	public static void main(String[] args) {
		
		Training publictraining=new PublicTraining(10, "Java", 5000, 50);
		Training corporatetraining=new CorporateTraining(20, "BigData", 35000, 4);
		
		publictraining.getOrderValue();
		System.out.println("cost of the public training"+publictraining.getCost());
		
		corporatetraining.getOrderValue();
		System.out.println("cost of the public training"+corporatetraining.getCost());
		
		
	}

}
