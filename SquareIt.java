class SquareIt {
    public static void main(String[] args){
        int[] arr={2, 3, 4, 5};
        int[] squaredArr = squareArray(arr);
    }

    static int[] squareArray(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        return arr;
    }
}