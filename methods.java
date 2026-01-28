public class methods {
   public static void main(String[] args){
    String name = "Hi";
    printLetters(name);
   } 
   static void printLetters(String str) {
    for (int i=0; i < str.length(); i++) {
        System.out.println(str.charAt(i));
    }
   }
}
