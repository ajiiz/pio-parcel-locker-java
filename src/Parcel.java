public abstract class Parcel {

    private String code;
    private int weight;

    Parcel(String code, int weight) {
        setCode(code);
        setWeight(weight);
    }

    public void setCode(String code) {
        if (code != null && code.matches("^[A-Za-z]{3}-[0-9]{5}$")) {
            this.code = code;
        } else {
            throw new IllegalArgumentException("Niepoprawny kod paczki!");
        }
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCode() {
        return code;
    }

    public int getWeight() {
        return weight;
    }
}
