import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParcelLocker {

    private List<Parcel> parcels = new ArrayList<>();
    private int lockerCapacity = 15;

    void addParcel(Parcel parcel) {
        if (lockerCapacity > 0) {
            if (parcel != null) {
                parcels.add(parcel);
                lockerCapacity--;
            } else {
                throw new IllegalArgumentException("Niepoprawna paczka (Nie moze byc NULL)!");
            }
        } else {
            throw new IllegalArgumentException("Niestety limit paczkomatu zostal osiagniety!");
        }
    }

    void listParcels() {
        for (Parcel p : parcels) {
            System.out.println("Kod: " + p.getCode() + ", waga: " + p.getWeight());
        }
    }

    void removeAllParcels() {
        parcels.clear();
        lockerCapacity = 25;
    }

    void removeParcel(String code) {
        Iterator<Parcel> it = parcels.iterator();
        int parcelLength = parcels.size();
        while(it.hasNext()) {
            if (it.next().getCode().equals(code)) {
                it.remove();
                lockerCapacity++;
            }
        }
        if (parcelLength == parcels.size()) {
            throw new IllegalArgumentException("Brak paczki o podanym kodzie");
        }
    }
}
