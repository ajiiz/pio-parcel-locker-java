import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ParcelLocker {

    private List<Parcel> parcels = new ArrayList<>();
    private int lockerCapacity = 3;

    void addParcel(Parcel parcel) {
        if (lockerCapacity > 0) {
            parcels.add(parcel);
            setLockerCapacity(lockerCapacity-1);
        } else {
            throw new IllegalArgumentException("Niestety limit paczkomatu zostal osiagniety!");
        }

    }

    void getParcels() {
        if (parcels.isEmpty()) {
            System.out.println("Brak dodanych paczek");
        } else {
            System.out.println("Lista dodanych paczek: ");
        }
        for (Parcel p : parcels) {
            System.out.println("Kod: " + p.getCode() + ", waga: " + p.getWeight());
        }
    }

    void removeAllParcels() {
        parcels.clear();
        setLockerCapacity(25);
    }

    void removeParcel(String code) {
        for (Parcel p : parcels) {
            if (code.equals(p.getCode())) {
                parcels.remove(p);
            } else {
                throw new NoSuchElementException("Brak paczki o podanym kodzie!");
            }
        }
    }

    public int getLockerCapacity() {
        return lockerCapacity;
    }

    public void setLockerCapacity(int lockerCapacity) {
        this.lockerCapacity = lockerCapacity;
    }
}
