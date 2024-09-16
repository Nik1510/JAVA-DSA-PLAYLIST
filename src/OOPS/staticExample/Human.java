package OOPS.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean  married;
    static long population ; // static  variable  is common to all (OR) Common properties to all

//     in static condition you cannot use this keyword in it lets see with an example
    // from static you cannot use non-static  stuff

    static void message(){
        System.out.println("Hello World");
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population += 1 ; // Convention to define the static variable which is common to all the classes
        Human.message();
    }

}
