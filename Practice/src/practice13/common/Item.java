package practice13.common;

public class Item {

	public Item(String name,int additionalDamage) {
		this.name = name;
		this.additionalDamage = additionalDamage;
	}


	private String name;

	private int additionalDamage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAdditionalDamage() {
		return additionalDamage;
	}

	public void setAdditionalDamage(int additionalDamage) {
		this.additionalDamage = additionalDamage;
	}




}
