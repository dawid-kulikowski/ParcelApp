package Application;
import java.util.Scanner;


public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
        Parcel parcel = new Parcel();
        Parcel[] parcels = new Parcel[3];


        Parcel parcel1 = new Parcel("a",20,"Nowy Targ");



        for (int i = 0; i < parcels.length; i++) {
            System.out.println(" Choose size of a parcel (A,B,C,D): \n");
            parcel.setSize(scanner.next());
            System.out.println("Weight of a parcel: ");
            parcel.setWeight(scanner.nextInt());
            System.out.println("Shipping Address: ");
            parcel.setShippingAddress(scanner.next());
            parcels[i] = new Parcel(parcel.getSize(),parcel.getWeight(),parcel.getShippingAddress());
        }


        for (int i = 0; i < parcels.length; i++)
        {
            System.out.println("Order Details " + (i + 1) + ":"
                    + "\nSize of a parcel: " + parcels[i].getSize()
                    + "\nWeight of a parcel: " + parcels[i].getWeight()
                    + "\nWeight of a parcel: " + parcels[i].getWeight()
                    + "\nShipping details: " + parcels[i].getShippingAddress());
            parcels[i].parcelPrice();

        }
    }
}
