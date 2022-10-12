package ua.logos.comparatorAnonymous;

import java.util.Comparator;

public class ProductByWidthComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {

        if (o1.getProductWidth() > o2.getProductWidth()) {
            return 1;
        } else if (o1.getProductWidth() < o2.getProductWidth()) {
            return -1;
        } else {
            return o1.getProductName().compareTo(o2.getProductName());
        }
    }
}



