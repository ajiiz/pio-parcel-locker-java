public class Main {
    public static void main(String[] args) {
        ParcelLocker locker1 = new ParcelLocker();
        locker1.addParcel(new ParcelB("AAA-12124", 44));
        locker1.addParcel(new ParcelB("AAB-12124", 124));
        locker1.addParcel(new ParcelA("DAA-12124", 44));

        locker1.listParcels();
        locker1.removeParcel("AAA-12124");
        locker1.listParcels();
    }
}
