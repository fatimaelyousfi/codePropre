package ex3;

public class Animal {

	String nomAnimal;
	TypeAnimal typeAnimal;
	Comportement comportement;
	
	public Animal (String nomAnimal,TypeAnimal typeAnimal, Comportement comportement){
		this.nomAnimal= nomAnimal;
		this.typeAnimal = typeAnimal;
		this.comportement = comportement;
	}
	
	
	@Override
	public String toString() {
		return "Animal [nomAnimal=" + nomAnimal + ", typeAnimal=" + typeAnimal + ", comportement=" + comportement + "]";
	}

	public String getNomAnimal() {
		return nomAnimal;
	}

	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}


	public TypeAnimal getTypeAnimal() {
		return typeAnimal;
	}


	public void setTypeAnimal(TypeAnimal typeAnimal) {
		this.typeAnimal = typeAnimal;
	}


	public Comportement getComportement() {
		return comportement;
	}


	public void setComportement(Comportement comportement) {
		this.comportement = comportement;
	}


}
