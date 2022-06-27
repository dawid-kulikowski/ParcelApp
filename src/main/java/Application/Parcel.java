package Application;

import java.util.Locale;

public class Parcel {

    private String size;
    private int weight;
    private String shippingAddress;

    public Parcel() {
    }

    public Parcel(String size, int weight, String shippingAddress) {
        this.size = size;
        this.weight = weight;
        this.shippingAddress = shippingAddress;
    }



    public void setSize(String size) {
        if (size.toLowerCase().equals("a") || size.toLowerCase().equals("b") || size.toLowerCase().equals("c") || size.toLowerCase().equals("d")) {
            this.size = size;
        } else {
            throw new IllegalArgumentException("Wrong parcel size. Choose between A,B,C,D.");
        }
    }


    public void setWeight(int weight) {
        if (weight<=20 && weight>0) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Weight of a parcel is too heavy.");
            }
        }


    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void parcelPrice () {

        float price;

        switch(size.toLowerCase()) {
            case "a" : {
                price = 14.99f;
                System.out.println("Your parcel shipping price: " + price + "PLN");
                break;
            }
            case "b" : {
                price = 17.99f;
                System.out.println("Your parcel shipping price: " + price + "PLN");
                break;
            }
            case "c" : {
                price = 19.99f;
                System.out.println("Your parcel shipping price: " + price + "PLN");
                break;
            }
            case "d" : {
                price = 24.99f;
                System.out.println("Your parcel shipping price: " + price + "PLN");
                break;
            }
            default:
                System.out.println("Incorrect size of a parcel.");
        }
    }
}
