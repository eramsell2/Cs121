package loopsActivities;
import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("How many floors are in the hotel?");
        int floors = console.nextInt();
        for(int floors2 = 0; floors2<floors; floors2++){
            System.out.println("How many rooms are on this floor?");
            int rooms = console.nextInt();
            System.out.println("how many of the rooms are occupied?");
            int occupied = console.nextInt();
            float occupancyRate = occupied/rooms;
            int vacantRooms = rooms - occupied;
            System.out.println("The number of floors is: " + floors);
            System.out.println("the number of rooms is: " + rooms);
            System.out.println("The number of occupied rooms is: " + occupied);
            System.out.println("The number of vacant rooms is: " + vacantRooms);
            System.out.println("the occupancy rate is: " + occupancyRate);



        }



    }
}
