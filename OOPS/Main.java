public class Main{

    int a = 5; // instance variable
    static int b = 10; // static variable
    
    public static class Emp{
        String name;
        int empId;
        static String compName;
        Emp(String name, int empId){
            this.name = name;
            this.empId = empId;
        }
    }
    public static class Car{
        int wheels;
        int sterringWheel;
        int engine;
        String carName;
        int seats;
    
        Car(){
            System.out.println("Inside 0 param constructor");
        }
        Car(int a, int b){
            this();
            System.out.println("Inside 2 param Constructor");
           
        }
        {
            System.out.println("Hii I am in Instance Block");
        }
        
        Car(int wheels, int sterringWheel, int engine, String carName, int seats){
            this();
            
            System.out.println("Inside 4 param constructor");
            this.wheels = wheels;
            this.sterringWheel = sterringWheel;
            this.engine = engine;
            this.carName = carName;
            this.seats = seats;
            
            
        }

        public void startEngine(){ 
            System.out.println("Starting engine of" + carName);
        }
        public void applyBreak(){
            System.out.println("Applying Brakes");
        }
        public void playRadio(){
            System.out.println("Playing Radio of" + carName);
        }
    }
    public static void main(String [] args){
        // static area 
        //Car innova = new Car(4, 1, 1600, "innova", 7);
        // Car c1 = new Car();  
        // Main m = new Main();
        // System.out.println(m.a);
        // System.out.println(b);// static variable is directly accesable in static area
        // Emp e1 = new Emp("Somendra", 1);
        // Emp e2 = new Emp("N", 2);
        // System.out.println(Emp.compName);
        // Emp.compName = "Deloitte";
        // System.out.println(Emp.compName);
        Car c = new Car();

    }

    // public void directAccess(){
    //     // Instance Area ? 
    //     System.out.println(a);
    //     System.out.println(Main.b); // we can access static variable by using class Name 
        
    //     instanceMethod();

    // }

    // public static void staticMethod(){
    //     Main m = new Main();
    //     m.instanceMethod();
    // }

    // public void instanceMethod(){
    //     Main.staticMethod();
    // }

}