package dev.olena.ex_person.models;

//class created 
// create atribute name

// commands 
// ctrl + . (actions and quick fix)
// Right mouse click (access to source Action)
// shift + alt + f (format file)

public class Person {

    private String name;
    private String lastName;
    private String id;
    private int yearOfBirth;

    
    public Person(String name, String lastName, String id, int yearOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.yearOfBirth = yearOfBirth;
    }
    
    public String getName() {
        return name;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getId() {
        return id;
    }
    
    public int getYearOfBirth() {
        return yearOfBirth;
    }


    // public void print() {
    //     System.out.println("Person name: " + name + ", last name: " + lastName + ", DNI: " + id + ", year of birth: " + yearOfBirth );
    // }

    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Person name: " + name + ", last name: " + lastName + ", DNI: " + id + ", year of birth: " + yearOfBirth;
    }
}
