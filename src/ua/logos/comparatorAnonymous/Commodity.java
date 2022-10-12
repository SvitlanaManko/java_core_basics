package ua.logos.comparatorAnonymous;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Commodity {

    public static List<Product> listProduct = new ArrayList<>();

    public static void main(String[] args) {
        listProduct.add(new Product("laminate", 120, 35, 200));
        listProduct.add(new Product("parquet", 56, 23, 150));
        listProduct.add(new Product("linoleum", 500, 150, 25));
        listProduct.add(new Product("film", 110, 60, 350));
        System.out.println("Hi, I'm yor virtual assistant. Choose an option:");
        Scanner scan = new Scanner(System.in);
        int input = 0;
        while (input != 9) {
            System.out.println("===================================");
            System.out.println("1 - Add product");
            System.out.println("2 - Remove the product");
            System.out.println("3 - Replace the product");
            System.out.println("4 - Sort by name");
            System.out.println("5 - Sort by length");
            System.out.println("6 - Sort by width");
            System.out.println("7 - Sort by weight");
            System.out.println("8 - Output the element of the collection with index 'I'");
            System.out.println("9 - Exit the program");
            System.out.println("===================================");
            input = scan.nextInt();
            switch (input) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    removeTheProduct();
                    break;
                case 3:
                    replaceTheProduct();
                    break;
                case 4:
                    sortByName();
                    break;
                case 5:
                    sortByLength();
                    break;
                case 6:
                    sortByWidth();
                    break;
                case 7:
                    sortByWeight();
                    break;
                case 8:
                    outputTheElementOfTheCollectionWithIndexI();
                    break;
                case 9:
                    exitTheProgram();
                    break;
                default:
                    System.out.println("Try again!");
            }
        }
    }

    public static void addProduct() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter product name:");
        String productName = scan.next();
        System.out.println("Enter products length:");
        int length = scan.nextInt();
        System.out.println("Enter products width:");
        int width = scan.nextInt();
        System.out.println("Enter products weight:");
        int weight = scan.nextInt();
        listProduct.add(new Product(productName, length, width, weight));
        System.out.println("Success!");
    }

    public static void removeTheProduct() {
        Scanner scan = new Scanner(System.in);
        Iterator<Product> productIterator = listProduct.iterator();
        System.out.print("Enter product name:");
        String productToBERemoved = scan.next();
        while (productIterator.hasNext()) {
            String product = productIterator.next().getProductName();
            if (productToBERemoved.equalsIgnoreCase(product)) {
                productIterator.remove();
                System.out.println("Success!");
            }
        }
        System.out.println(listProduct);
    }

    public static void replaceTheProduct() {
        Scanner scan = new Scanner(System.in);
        Iterator<Product> productIterator = listProduct.iterator();

        System.out.println("Enter product name:");
        String productName = scan.next();
        while (productIterator.hasNext()) {
            Product next = productIterator.next();
            String nextProductName = next.getProductName();
            if (productName.equalsIgnoreCase(nextProductName)) {
                System.out.println("Enter new nextProductName name:");
                String productNewName = scan.next();
                next.setProductName(productNewName);

                System.out.println("Enter new products length:");
                int lengthNewProduct = scan.nextInt();
                next.setProductLength(lengthNewProduct);

                System.out.println("Enter new products width:");
                int widthNewProduct = scan.nextInt();
                next.setProductWidth(widthNewProduct);

                System.out.println("Enter new products weight:");
                int weightNewProduct = scan.nextInt();
                next.setProductWeight(weightNewProduct);
            }
        }
    }

    public static void sortByName() {
        listProduct.sort(new ProductByNameComparator());
        System.out.println(listProduct);
    }

    public static void sortByLength() {
        ProductByLengthComparator productByLengthComparator = new ProductByLengthComparator();
        listProduct.sort(productByLengthComparator);
        System.out.println(listProduct);
    }

    public static void sortByWidth() {
        listProduct.sort(new ProductByWidthComparator());
        System.out.println(listProduct);
    }

    public static void sortByWeight() {
        listProduct.sort(new ProductByWeightComparator());
        System.out.println(listProduct);
    }

    public static void outputTheElementOfTheCollectionWithIndexI() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the serial number of the product:");
        int index = scan.nextInt();
        System.out.println(listProduct.get(index-1));
    }

    public static void exitTheProgram() {
        System.exit(0);
    }
}
