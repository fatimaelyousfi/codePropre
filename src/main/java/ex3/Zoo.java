package ex3;

public class Zoo {

	protected String nom;
	protected SavaneAfricaine savaneAfricaine;
	protected ZoneCarnivore zoneCarnivore;
	protected FermeReptile fermeReptile;
	protected Aquarium aquarium;
	
	public Zoo(String nom){
		this.nom = nom;
		savaneAfricaine = new SavaneAfricaine();
		zoneCarnivore  = new ZoneCarnivore();
		fermeReptile= new FermeReptile(); 
		aquarium = new Aquarium();
	}
	
	public SavaneAfricaine getSavaneAfricaine() {
		return savaneAfricaine;
	}

	public void setSavaneAfricaine(SavaneAfricaine savaneAfricaine) {
		this.savaneAfricaine = savaneAfricaine;
	}

	public ZoneCarnivore getZoneCarnivore() {
		return zoneCarnivore;
	}

	public void setZoneCarnivore(ZoneCarnivore zoneCarnivore) {
		this.zoneCarnivore = zoneCarnivore;
	}

	public FermeReptile getFermeReptile() {
		return fermeReptile;
	}

	public void setFermeReptile(FermeReptile fermeReptile) {
		this.fermeReptile = fermeReptile;
	}

	public Aquarium getAquarium() {
		return aquarium;
	}

	public void setAquarium(Aquarium aquarium) {
		this.aquarium = aquarium;
	}

	public void addAnimal(Animal animal){
		
		if (animal.getTypeAnimal().equals(TypeAnimal.MAMMIFERE) 
				&& animal.getComportement().equals(Comportement.CARNIVORE))
			zoneCarnivore.addAnimal(animal);
		
		else if(animal.getTypeAnimal().equals(TypeAnimal.MAMMIFERE)
				&& animal.getComportement().equals(Comportement.HERBIVORE))
			savaneAfricaine.addAnimal(animal);
		
		else if (animal.getTypeAnimal().equals(TypeAnimal.POISSON))
			aquarium.addAnimal(animal);
			
		else if (animal.getTypeAnimal().equals(TypeAnimal.REPTILE))
			fermeReptile.addAnimal(animal);	
	}
	
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
		
	}

