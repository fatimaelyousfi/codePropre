package ex3;

public enum TypeAnimal   {
	MAMMIFERE("MAMMIFERE" ), REPTILE ("REPTILE"), POISSON ("POISSON");
	
	private String value;

	private TypeAnimal(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;

	}
}
