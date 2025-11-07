package lat_quiz;

public class ToDoList {

    private String item;
    private boolean done;

    public ToDoList(String item, boolean done) {
        this.item = item;
        this.done = done;
    }
    
    public boolean isDone() { 
        return done; 
    }
    
    @Override
    public String toString(){ 
        String s = ("The to do list item : " + item + "\n");
        if (isDone()) s = s + "has been done"; 
        else s = s + "has not been done";
        return s; 
    } 
    
    public static void main(String [] args){ 
        ToDoList toDoList= new ToDoList("take cat to vet", false);
        System.out.println(toDoList);
    }
}
