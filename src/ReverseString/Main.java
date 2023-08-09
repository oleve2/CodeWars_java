package ReverseString;

public class Main {
  public static void main(String[] args) {
    JReverseString("abcdefg");
  }
  
  
  public static void JReverseString(String str) {
    String[] str_split = str.split("");
    int len = str_split.length;
    String[] str_final = new String[len];
    
    for (int i=0; i < str_split.length; i++) {
      str_final[len-1-i] = str_split[i];
    }
    System.out.println(String.join("", str_final));
    // return new StringBuffer(str).reverse().toString();
  }
}
