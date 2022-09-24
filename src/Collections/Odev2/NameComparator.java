package Collections.Odev2;

import java.util.Comparator;

public class NameComparator implements Comparator<Kisiler> {

    @Override
    public int compare(Kisiler o1, Kisiler o2) {
        return o1.getIsim().compareToIgnoreCase(o2.getIsim());
    }
}
