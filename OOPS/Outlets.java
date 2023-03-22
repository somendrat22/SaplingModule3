public class Outlets {
    public static void main(String[] args) {
        PizzaBaseManagementSystem dominosGurgoan = new PizzaBaseManagementSystem(1, 2, 3);
        boolean res  = dominosGurgoan.checkBase(1);
        System.out.println(res);
        res  = dominosGurgoan.checkBase(1);
        System.out.println(res);
    }
}
