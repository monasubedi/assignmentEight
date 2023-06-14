package ProblemOne;

public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String last,String first,int a){
        this.lastName = last;
        this.firstName = first;
        this.age = a;
    }
    public String getLast(){
        return lastName;
    }

    @Override
    public String toString(){
        return "Person[lastName =" + lastName + "\n First Name = " + firstName +"\nAge = " + age + "]";
    }
}
