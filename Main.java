public class Main {
    final int x=10 ;// use final to remove the ability to override attributes
//overriding existing values
    public static void main(String[] args) {
        Main myObj = new Main();
        myObj.x = 25;
        System.out.println(myObj.x);
    }
}
