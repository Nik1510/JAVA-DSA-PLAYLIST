package OOPS.singleton;

import OOPS.acess.A;

public class main {
    public static void main(String[] args) {
        singleton obj = singleton.getInstance();

        singleton obj2 = singleton.getInstance();


        singleton obj3 = singleton.getInstance();

//         all 3 reference variable are pointing to just one object
    }
}
