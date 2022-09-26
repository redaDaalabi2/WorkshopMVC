package Animal;

//main class 
public class MVCAnimalMain {
	
	private static AnimalModel retriveAnimalFromDatabase(){  
        AnimalModel Animal = new AnimalModel(); 
        System.out.println("\nAnimal Details before updating");
        Animal.setId("1");
        Animal.setName("Luna");    
        Animal.setType("Cat");  
        return Animal;  
    } 

	public static void main(String[] args) {
		
		// fetching the animal record based on the animal_Id from the database  
        AnimalModel animalmodel = retriveAnimalFromDatabase();
        
        // creating a view to write Animal details on console  
        AnimalView animalview = new AnimalView();  
        
        AnimalController animalcontroller = new AnimalController(animalmodel, animalview);  
        
        animalcontroller.updateView();  
        
        //updating the animal model data 
        animalcontroller.setAnimalId("1");
        animalcontroller.setAnimalName("Jackson"); 
        animalcontroller.setAnimalType("Chien");
        System.out.println("\nAnimal Details after updating");  
        
        animalcontroller.updateView();
        
	} 

}
