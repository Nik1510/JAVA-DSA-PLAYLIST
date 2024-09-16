package OOPS.Excpection_Handling;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
//            int c= a/b;
//            divide(a,b);
            // mimicing

            throw new Exception("just for fun");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Normal Expection");
        }
        finally {
            System.out.println("this will always run ");
        }

    }

    static int divide(int a, int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("please don't divide by zero ");
        }
        return a/b;
    }
}
