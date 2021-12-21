package pl.vitalikot.prettySimpleTasks.currencySearch;

public class CurrencyReq {

    private String currency;
    private String code;
    private Double mid;

    public CurrencyReq() {
    }

    public CurrencyReq(String code) {
        this.code = code;
    }

    public CurrencyReq(String currency, String code, Double mid) {
        this.currency = currency;
        this.code = code;
        this.mid = mid;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) { this.code = code; }

    public Double getMid() {
        return mid;
    }

    public void setMid(Double mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "CurrencyReq{" +
                "currency='" + currency + '\'' +
                ", code=" + code +
                ", mid=" + mid +
                '}';
    }
}
