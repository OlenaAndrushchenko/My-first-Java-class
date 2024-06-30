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
    private String countryOfBirth;
    private char gender;
    
    public Person(String name, String lastName, String id, int yearOfBirth, String countryOfBirth, char gender) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.yearOfBirth = yearOfBirth;
        this.countryOfBirth = countryOfBirth;
        this.gender = gender;
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
    
    public String getCountryOfBirth() {
        return countryOfBirth;
    }
    
    public char getGender() {
        return gender;
    }
    
    
    public void print() {
        System.out.println(this.toString());
    }
    
    @Override
    public String toString() {
        return "Person name: " + name + 
        ", last name: " + lastName + 
        ", DNI: " + id + 
        ", year of birth: " + yearOfBirth +
        ", country of birth: " + countryOfBirth +
        ", gender: " + gender;
    }
    
}
// public void print() {
//     System.out.println("Person name: " + name + ", last name: " + lastName + ", DNI: " + id + ", year of birth: " + yearOfBirth );
// }
