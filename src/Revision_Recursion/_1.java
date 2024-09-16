package Revision_Recursion;

public class _1 {
    // recursion is the heart of DSA. e.g, :-
    // DP, Binary tree , etc
    public static void main(String[] args) {
//        how to learn recursion
         // write a function that prints hello world

        message();

        System.out.println(" just see hoe the control excutes" );
        message5(); // this is the example how stake is filled
        // moreover how the program excutes and the  flow of the control

    }

    static void message(){

        System.out.println("Hello World 1");
        message1();
    }

       static void message1(){
        System.out.println("Hello World 2");
        message2();
    }
       static void message2(){
        System.out.println("Hello World 3");
        message3();;
    }
       static void message3(){
        System.out.println("Hello World 4");
        message4();
    }
       static void message4(){
        System.out.println("Hello World 5");
    }

   static void message5(){
        message6();
        System.out.println("Hello World 6");
    }

   static void message6(){
        message7();
        System.out.println("Hello World 7");
    }

   static void message7(){
        message8();
        System.out.println("Hello World 8");
    }

   static void message8(){
        message9();
        System.out.println("Hello World 9 ");
    }

   static void message9(){
        System.out.println("Hello World 10 ");
    }


}
