class Collatz {
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        int n = 1634;
        int i = 0;
        System.out.print(n);

        while (n != 1){
            if (isEven(n)) {
                System.out.println("is even");
                n /= 2;
            
            }
            System.out.println(n);
            i+=1;
        }
        System.out.println(" reached in " + i + " steps");
    }
}
