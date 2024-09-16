package OOPS.acess;

public class ObjectDemo {
    int num;
    float gpa;

    public ObjectDemo(int num , float gpa) {
        this.num = num;
       this.gpa = gpa;
    }

    // we will go to detail of how to create it in hash map lecture
    @Override
    public int hashCode() {
        return super.hashCode();
    }


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num ==((ObjectDemo)obj).num;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public String toString() {
        return super.toString();
    }


    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(34,56.8f);
        ObjectDemo obj2 = new ObjectDemo(34, 78.9f);

        if (obj1 == obj2){
            System.out.println("obj is equal to obj2");
        }
        if (obj1.equals(obj2)){
            System.out.println("obj is equal to obj2");
        }


//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
    }


}
