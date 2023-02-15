//import th.ac.cmu.cpe.oop.patterns.adapter.payd.PayD;
//import th.ac.cmu.cpe.oop.patterns.adapter.site.XpayImpl;
//import th.ac.cmu.cpe.oop.patterns.adapter.site.XpayToPayDAdapter;

public class Main {
    public static void main(String[] args) {
//---------------------------------------FACTORY PATTERN------------------------------------------------------------
        ShapeFactory sf = new ShapeFactory();
        Shape s = sf.getShape(1);
        s.draw();

//---------------------------------------ADAPTER PATTERN------------------------------------------------------------
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Champoo CGM48");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((Short) 235);
        xpay.setAmount(2565.23);
        PayD payD = new XpayToPayDAdapter(xpay);
        testPayD(payD);

        private static void testPayD(PayD payD) {
            System.out.println(payD.getCardOwnerName());
            System.out.println(payD.getCreditCardNo());
            System.out.println(payD.getCardExpMonthYear());
            System.out.println(payD.getCVVNo());
            System.out.println(payD.getTotalAmount());
        }
    }
}