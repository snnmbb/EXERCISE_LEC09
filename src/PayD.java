public interface PayD {
    public String getCreditCardNo();
    public String getCardOwnerName();
    public String getCardExpMonthYear();
    public Integer getCVVNo();
    public Double getTotalAmount();
    public void setCreditCardNo(String creditCardNo);
    public void setCardOwnerName(String cardOwnerName);
    public void setCardExpMonthYear(String cardExpMonthYear);
    public void setCVVNo(Short cVVNo);
    public void setTotalAmount(Double totalAmount);

}
