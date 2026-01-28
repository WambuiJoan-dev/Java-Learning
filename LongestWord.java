class LongestWord {
    public static void main(String[] args) {
        String[] arr = {"Jo", "Mia", "Emma", "Tom"};
        //call the method to find the longest word
        String longest = longestWord(arr); 
    }
    public static String longestWord(String[] arr) {
        String longest = "";
        for (String word : arr) {//iterate through the array
            if (word.length() > longest.length()) { //CHECK IF WOrd is longer than longest
                longest = word; //if word is longer update longest
            }
        }
        return longest;
    }
}
