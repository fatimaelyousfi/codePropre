package ex3;


public class ZoneCarnivore extends AnimalZone {
	
	public double calculerKgsNourritureParJour(){
		return animaux.size() * 10;
	}
	
}

	/*
	private List<String> types;
	private List<String> noms;
	private List<String> comportements;
	
	public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
	}
	
	public void afficherListeAnimaux(){
		for (String nom: noms){
			System.out.println(nom);
		}
	}
	
	public double calculerKgsNourritureParJour(){
		return noms.size() * 10;
	}
	}
	*/

