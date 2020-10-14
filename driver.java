//mal
public class driver{

	public static void main(String [] arg){
		fish nemo = new fish();

		nemo.Swim();
		//nemo.color = "orange";
		nemo.SetColor("orange");
		nemo.Swim();

		shark josh = new shark();
		josh.Eat();
		josh.Swim();
		josh.SetSharpTeeth(138);
		josh.Eat();

		// fish dory = new fish();
		// dory.Swim();
		// //dory.color = "purple";
		// dory.SetColor("purple");
		// dory.Swim();

		// aquarium fancyAquarium = new aquarium();
		// fancyAquarium.fillFish();


	}
}