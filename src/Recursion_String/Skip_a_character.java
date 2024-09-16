package Recursion_String;

public class Skip_a_character {
    public static void main(String[] args) {
//        skip("","baccdah");
        System.out.println(skip2("baccdah"));
    }
    static void skip(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unProcessed.charAt(0);
        if(ch=='a'){
            skip(processed, unProcessed.substring(1));
        }
        else {
            skip(processed+ch,unProcessed.substring(1));
        }
    }


    // returning an string
    static String skip2( String unProcessed){
        if(unProcessed.isEmpty()){
            return "";
        }

        char ch = unProcessed.charAt(0);
        if(ch=='a'){
          return   skip2( unProcessed.substring(1));
        }
        else {
            return ch+skip2(unProcessed.substring(1));
        }
    }


}
