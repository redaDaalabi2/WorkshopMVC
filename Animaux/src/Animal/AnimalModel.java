package Animal;

//class that represents model  
public class AnimalModel {
	
	// declaring the variables  
	private String Animal_Id; 
    private String Animal_Name;   
    private String Animal_Type;  
    
    // defining getter methods 
    public String getId() {  
        return Animal_Id;  
    } 
    public String getName() {  
        return Animal_Name;  
    }
    public String getType() {  
        return Animal_Type;  
    }
    
    // defining setter methods 
    public void setId(String Id) {  
        this.Animal_Id = Id;  
    }  
    public void setName(String Name) {  
        this.Animal_Name = Name;  
    } 
    public void setType(String Type) {  
        this.Animal_Type = Type;  
    } 
    
}
