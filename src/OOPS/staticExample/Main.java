package OOPS.staticExample;

public class Main {
    // Human is in same package. so, we do not need to import the package
    public static void main(String[] args) {
//        Human kunal = new Human(19, "kunal",10000,false);
//        Human rahul = new Human(19, "kunal",10000,false);
//
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//
//        greeting();// this non static method which cannot be assessed by static variable
      Main funn = new Main();
      funn.fun2();

    }
    // this is not dependent on object
    static  void fun(){
//        greeting(); // you cannot use this because it requires an instance
        // but the function you are using it in does not depend on instances

//        you cannot access non-static stuff without referencing thier instance in a staic context

//        hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){
//         here we do not need to create an object for fun2 because it will be created
        greeting();
    }
    // we know that something which is not static, belongs to an object
    void greeting (){
        fun();
        System.out.println("Hello world");
    }
}
