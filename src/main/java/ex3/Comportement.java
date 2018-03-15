package ex3;

public enum Comportement {
	CARNIVORE ("CARNIVORE"), HERBIVORE ("HERBIVORE"); 
	private String value;

	private Comportement(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;

	}
}


