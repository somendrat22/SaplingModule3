public class NewClass {
    {
        // Instance Block 
    }
    public static class Hospital{ // Instance Class

        static {
            System.out.println("Hii I am inside static block");
        }
        
        Hospital(){
            System.out.println("Inside constructor");
        }
        // Instance block they will run before constructor 
        {
            // Instance Block or Instance Area
            // Database connection, We want to import some files.
            System.out.println("Inside Instance Block");
        }
        void main(){

        }

    }
    public static void main(String[] args) { // static function
        // Enter Your Code Here


        Hospital medanta = new Hospital();
    }
}
