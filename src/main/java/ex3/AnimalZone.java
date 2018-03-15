package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class AnimalZone {

	protected List<Animal> animaux = new ArrayList<>();
	
	
	public List<Animal> getAnimaux() {
		return animaux;
	}

	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}

	public void addAnimal(Animal animal) {
		animaux.add(animal);
		
	}
	
	public void afficherListeAnimaux(){
		for (Animal ani: animaux){
			System.out.println(ani.getNomAnimal());
		}
	}
	
	public int compterAnimaux(){
		return animaux.size();
	}
	
	public abstract double calculerKgsNourritureParJour();
}

