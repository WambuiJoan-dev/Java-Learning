// public class Main {

//     public void fullThrottle() {
//         System.out.println("The car is going fast!");
//     }
//     public void speed(int maxSpeed) {
//         System.out.println("Max speed is: " + maxSpeed);
//     }
//     public static void main(String[] args) {
//         Main myCar = new Main();
//         myCar.fullThrottle();
//         myCar.speed(180);
//     }
// }
import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}