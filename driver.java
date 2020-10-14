//mal
public class driver{

	public static void main(String [] arg){
		fish nemo = new fish();

		nemo.Swim();
		nemo.color = "orange";
		nemo.Swim();

		fish dory = new fish();
		dory.Swim();
		dory.color = "purple";
		dory.Swim();
	}
}