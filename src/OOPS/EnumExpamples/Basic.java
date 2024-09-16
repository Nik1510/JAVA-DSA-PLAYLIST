package OOPS.EnumExpamples;

public class Basic {
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constant
        // public static and final
        // since its final you can create child enum
        // type is Week
        Week(){
            System.out.println("Constructor called for "+this );
        }
        // this is public or protected
        // why? we don't want  to create new objects
        // this is not the enum concept, that's why

        // internally :  public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

//        for (Week day : Week.values()){
//            System.out.println(day);
//        }

//        System.out.println(week.ordinal());
    }
}
