public class Task {
    
    String name, description;
    
    public Task(String n, String d){
        name = n;
        description = d;
    }
    
    public String setDescription(String desc){
        description = desc;
        return description;
    }
    public String setName(String nm){
        name = nm;
        return name;
    }
    
    public String toString(){
        return "Name: " + name + "\nDescription: " + description + "\n=========\n";
    }
    
    public String getDescription(){
        return description;
    } 
    
    public String getName(){
        return name;
    }
    
    public boolean validate() {
        if (name == null || description == null || name.equals("") || description.equals("")) {
            return false;
        } else {
            return true;
        }
    }
}
