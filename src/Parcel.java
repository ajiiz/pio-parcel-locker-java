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
        if (code != null && weight > 0) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Niepoprawna waga paczki");
        }

    }

    public String getCode() {
        return code;
    }

    public int getWeight() {
        return weight;
    }
}
