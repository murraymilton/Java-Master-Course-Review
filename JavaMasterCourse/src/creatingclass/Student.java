package creatingclass;

public class Student {
    private  String id;
    private  String firstName;
    private  String lastName;

    public Student(String id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Accessor methods for providing access to the instance variables.
     * @return
     */
    public String getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    /**
     * Mutator method for allow other objects to change the variables
     * @param id
     * @param firstName
     * @param lastName
     */
    public void setStudent(String id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
