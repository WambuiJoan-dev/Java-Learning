public class Salary {
    public static void earn(int amount){
        System.out.println("its payday");
    }
    public static void main(String[] args){
        Salary myObj = new Salary();
        earn(100000);
    }
}
