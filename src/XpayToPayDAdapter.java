public class XpayToPayDAdapter implements PayD {
    private final Xpay xpay;
    public XpayToPayDAdapter(Xpay xpay){
        this.xpay = xpay;
    }

    @Override
    public String getCreditCardNo() {
        return xpay.getCreditCardNo();
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {
        xpay.setCreditCardNo(creditCardNo);
    }

  //...
    @Override
    public String getCardOwnerName() { // call PayD method
        return xpay.getCustomerName(); // XPay method
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        xpay.setCustomerName(cardOwnerName);
    }

    @Override
    public String getCardExpMonthYear() {
        return xpay.getCardExpMonth() + "/" + xpay.getCardExpYear();
    }

    @Override
    public Integer getCVVNo() {
        return (int)xpay.getCardCVVNo();
    }

    @Override
    public Double getTotalAmount() {
        return xpay.getAmount();
    }

    @Override
    public void setCardExpMonthYear(String cardExpMonthYear) {
        xpay.setCardExpMonth(cardExpMonthYear.substring(0, 2));
        xpay.setCardExpYear(cardExpMonthYear.substring(3, 2));
    }

    @Override

    @Override
    public void setCVVNo(Short cVVNo) {
        xpay.setCardCVVNo(cVVNo);
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        xpay.setAmount(totalAmount);
    }

}

