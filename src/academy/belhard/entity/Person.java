package academy.belhard.entity;

public class Person {
    protected String firstName;
    protected String  lastName;

    public Person(String firstname, String lastname){
        this.firstName=firstname;
        this.lastName=lastname;
    }
    public  String getFullName(){
       return (firstName + " "+  lastName);
    }

}
