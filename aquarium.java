//Muhd Akmal bin Ismail
public class aquarium {
	public int length, height, width;

	public void fillFish(){
		fish dfish = new fish();
		//dfish.color = "greenblackgold";
		
		dfish.SetColor("GreenBlackGold");
		System.out.println("Many " + dfish.GetColor() + " fish here");

		dfish.Swim();
	}


}