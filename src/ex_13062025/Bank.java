package ex_13062025;

public class Bank {
        private String currency;
        private Integer amount;

    public Bank(String currency,Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankname){
        if (!bankname.currency.equalsIgnoreCase("INR")){
            try {
                throw new Exception("currency does not match");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        Integer sum = this.amount + bankname.amount;
        return sum;
    }
}


