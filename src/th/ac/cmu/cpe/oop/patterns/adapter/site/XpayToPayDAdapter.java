package th.ac.cmu.cpe.oop.patterns.adapter.site;
import th.ac.cmu.cpe.oop.patterns.adapter.payd.PayD;
import th.ac.cmu.cpe.oop.patterns.adapter.xpay.Xpay;
public class XpayToPayDAdapter implements PayD {
    private final Xpay xpay;
    public XpayToPayDAdapter(Xpay xpay){
        this.xpay = xpay;
    }

    // getters and setters

  ...
