package OOPS.interFaceses;

public class Car implements Engine ,Brake{
    @Override
    public void Brakes() {
        System.out.println("I brakes like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start like normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like normal car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like normal car");
    }
}
