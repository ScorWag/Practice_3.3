public class CreditPaymentService {
    public int calculate(int sum, int year, float percent) {
        float monthPercent = percent / (100 * 12);
        int calculatePayment = (int) (sum * (monthPercent / (1 - (1 / Math.pow((1 + monthPercent), year * 12)))));
        return calculatePayment;
    }
}
