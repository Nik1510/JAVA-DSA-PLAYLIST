package OOPS.singleton;

public class singleton {
    private singleton(){

    }
    private static singleton instance;
    public static  singleton getInstance(){
        // check whether 1 obj only is created
        if (instance == null){
            instance = new singleton();
        }

        return instance;
    }
}
