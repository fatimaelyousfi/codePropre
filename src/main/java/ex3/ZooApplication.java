package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		Animal a1 = new Animal("Gazelle", TypeAnimal.MAMMIFERE, Comportement.HERBIVORE);    
		Animal a2 = new Animal("Lion", TypeAnimal.MAMMIFERE, Comportement.HERBIVORE);
		Animal a3 = new Animal("Panthère", TypeAnimal.MAMMIFERE, Comportement.CARNIVORE);
		Animal a4 = new Animal("Requin blanc", TypeAnimal.POISSON, Comportement.HERBIVORE);
		Animal a5 = new Animal("Truite dorée", TypeAnimal.POISSON, Comportement.HERBIVORE);
		Animal a6 = new Animal("Boa constrictor", TypeAnimal.REPTILE, Comportement.CARNIVORE);
		Animal a7 = new Animal("Python", TypeAnimal.REPTILE, Comportement.CARNIVORE);
		
		zoo.addAnimal(a1);
		zoo.addAnimal(a2);
		zoo.addAnimal(a3);
		zoo.addAnimal(a4);
		zoo.addAnimal(a5);
		zoo.addAnimal(a6);
		zoo.addAnimal(a7);
	    zoo.afficherListeAnimaux();
	    
	    
	}

}
