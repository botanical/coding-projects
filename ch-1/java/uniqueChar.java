/* implement an algorithm to determine if a string has all unique characters */
public class uniqueChar {
  public static boolean uniqueChar(String str) {
     boolean [] char_array = new boolean[256]; // asumming ASCII character set
     for (int i = 0; i < str.length(); i++){
         // there is an implicit cast from char to int in java
         // but to go from int to char, it must be explicit
         int val = str.charAt(i);
         if ( char_array[val] ) {
           return false;
         }
         else {
           char_array[val] = true;
         }
     }
     return true;
  }

  public static void main(String args[]) {
     System.out.println( uniqueChar(args[0]) );
  }
}

