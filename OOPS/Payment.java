public class Payment {
    abstract static class Pay{
        // Which is visible to user
        abstract void doPayment(); // doPayment has no implementation 
    }
    public static class PayWithRazaorPay extends Pay{
        // All the functionality of this Pay class will come into PayWIthRazorPay
        @Override
        void doPayment(){
            System.out.println("Doing Transaction with Razor Pay");
        }
    }



    public static void main(String[] args) {
        // Enter Your Code Here 
        Pay p1 = new PayWithRazaorPay();
        p1.doPayment();
    }
}
