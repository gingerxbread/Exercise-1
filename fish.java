//mal
public class fish{

	private String color = "default";

	public void Swim(){
		System.out.println(color + " fish swim");
	}

	public void SetColor(String colour){
		color = colour;
	}

	public String GetColor(){
		return color;
	}
}