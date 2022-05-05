public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int monthPaymentForOneYear = service.calculate(1_000_000, 1, 9.99F);
        System.out.println(monthPaymentForOneYear);

        int monthPaymentForTwoYear = service.calculate(1_000_000, 2, 9.99F);
        System.out.println(monthPaymentForTwoYear);

        int monthPaymentForThreeYear = service.calculate(1_000_000, 3, 9.99F);
        System.out.println(monthPaymentForThreeYear);
    }
}
