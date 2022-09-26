package Animal;

//class which represent the controller 
public class AnimalController {

	// declaring the variables model and view  
    private AnimalModel model;  
    private AnimalView view; 
    
    // constructor to initialize  
    public AnimalController(AnimalModel model, AnimalView view) {  
       this.model = model;  
       this.view = view;  
    }  
    
    // getter methods  
    public String getAnimalId(){  
        return model.getId();       
    }  
    public String getAnimalName(){  
        return model.getName();       
    }
    public String getAnimalType(){  
        return model.getType();       
    }
    
    
    // setter methods  
    public void setAnimalId(String Id){  
        model.setId(Id);        
    }
    public void setAnimalName(String Name){  
        model.setName(Name);        
    }
    public void setAnimalType(String Type){  
        model.setType(Type);        
    }
    
    // method to update view   
    public void updateView() {                  
       view.printAnimalDetails(model.getName(), model.getId(), model.getType());  
    }  
    
}
