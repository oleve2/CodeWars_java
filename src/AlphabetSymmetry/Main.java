package AlphabetSymmetry;

public class Main {
  public static void main(String[] args) {
    int[] r = JAlphabetSymmetry(new String[]{"abode","ABc","xyzD"});
    for (int item : r) {
      System.out.println(item);
    }
  }
  
  public static int[] JAlphabetSymmetry(String[] arr) {
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    int[] arrRes = new int[arr.length];
  
    for (int i=0; i < arr.length; i++) {
      System.out.println(arr[i]);
      String word = arr[i].length() > 26 ? arr[i].substring(0,25) : arr[i];
      int counter = 0;
      for (int j=0; j < word.length(); j++) {
        if (Character.toLowerCase(word.charAt(j)) == alphabet.charAt(j)) {
          counter+=1;
        }
      }
      arrRes[i] = counter;
    }
    return arrRes;
  }
  
}
