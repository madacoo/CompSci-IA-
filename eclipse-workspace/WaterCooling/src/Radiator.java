
public class Radiator {
	String name; 
	String maxfancount;
	String metal;
	
	public Radiator(String name, String maxfancount, String metal) {
		this.name = name;
		this.maxfancount = maxfancount; 
		this.metal = metal; 
}

	public String getName() {
		return name;
	}

	public String getMaxFanCount() {
		return maxfancount;
	}

	public String getMetal() {
		return metal;
	}
	
	public String toString() {
		return name; 
	}
	
}