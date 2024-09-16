package Recursion_String;

public class skip_a_string {
    public static void main(String[] args) {
//        System.out.println(skipApple("bacappledah"));
//        System.out.println(skipApple("appleis"));
        System.out.println(skipAppNotApple("bacappledah"));
        System.out.println(skipAppNotApple("bacappdah"));
    }
    static String skipApple(String unProcessed){
        if(unProcessed.isEmpty()){
            return "";
        }


        if(unProcessed.startsWith("apple")){
            return   skipApple( unProcessed.substring(5));
        }
        else {
            return unProcessed.charAt(0)+ skipApple(unProcessed.substring(1));
        }
    }

    // Skip App not apple
    static String skipAppNotApple(String unProcessed){
        if(unProcessed.isEmpty()){
            return "";
        }


        if(unProcessed.startsWith("app") && !unProcessed.startsWith("apple")){
            return   skipAppNotApple( unProcessed.substring(5));
        }
        else {
            return unProcessed.charAt(0)+ skipAppNotApple(unProcessed.substring(1));
        }
    }
}
