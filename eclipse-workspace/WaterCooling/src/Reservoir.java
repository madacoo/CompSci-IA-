
public class Reservoir extends Part{
	String combo; 
	public Reservoir(String name, String combo) {
		partName = name; 	
		this.combo = combo; 

		}
	public String getName() {
		return partName;
	}

	public String getCombo() {
		return combo;
	}
	
}
