package PracticeAlgorithm;

public class StringPlayground {
  public static String reverseString(String string) {
    String[] arrays = string.split("");
    StringBuilder reservedString = new StringBuilder();
    for (int i = arrays.length - 1; i >=0; i--) {
      reservedString.append(arrays[i]);
    }
    return  reservedString.toString();
  }

  public static String reverseString2(String string) {
    StringBuilder newString = new StringBuilder(string);
    return newString.reverse().toString();
  }


  public static void main (String[] args) {
    System.out.println(reverseString("me iort aht me"));
    System.out.println(reverseString2("me iort aht me"));
  }
}
