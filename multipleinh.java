class A{
    public void Car(){
        System.out.println("Audi Car");
    }
    }
    class B extends A{
        public void bike(){
    System.out.println("Duke Bike");
        }
    }
    class C extends B{
        public void cycle(){
            System.out.println("BSA cycle")
        }
    }
    public class Inheritance{
        public static void main(String[] args) {
            B ob=new B();
            ob.Car();
            ob.bike();
            ob.cycle();
     }
    }

    