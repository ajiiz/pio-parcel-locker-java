public class Main {
    public static void main (String[] args) {
        ParcelLocker locker1 = new ParcelLocker();
        locker1.addParcel(new ParcelA("ABC-12345", 12));
        locker1.addParcel(new ParcelA("ADC-44215", 123));
        locker1.addParcel(new ParcelB("AAD-44112", 125));

        locker1.getParcels();
        locker1.removeAllParcels();
        locker1.getParcels();
    }
}
