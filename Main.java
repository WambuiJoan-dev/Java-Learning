public class Main{
     //create a checkage() method with an integer variable
     static void checkAge(int age) {
        //if age is less that 18 print "access denied"
        if (age < 18){
            System.out.println("Access denied -  You are too young");
        }
        //if age is greater than or equal to 18 print access granted
        else {
            System.out.println("Access granted - You are old enough");
        }
     }
     public static void main(String[] args) {
        checkAge(17);
     }
}