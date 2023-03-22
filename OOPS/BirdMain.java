public class BirdMain {


    static class Bird{
        void fly(){
            System.out.println("Flap your wings");
        }
    }

   class Eagle extends Bird{ // Instance class 

        
        void fly(){
            // Overiding is a concept in which we will keep our function as same but we will change buisness logic in that.
            System.out.println("Fly long distance");
        }

        
    }
    public static void main(String[] args) {
        BirdMain bm = new BirdMain();
        Eagle e1 = bm.new Eagle();
        e1.fly(); // Eagle has inherited the behaviour of its parent class Bird
        Bird b = new Bird();
        b.fly();
    }
}
