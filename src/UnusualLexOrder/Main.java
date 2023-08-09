package UnusualLexOrder;

public class Main {
  public static void main(String[] args) {
    String[] res = Solution.unusualLexOrder(new String[]{"ta", "nigeb", "gninnigeb", "eht"});
    //String[] res = UnusualLexOrder.Solution.unusualLexOrder(new String[]{"a", "b", "a", "d", "c"});
  
    System.out.println("=========================");
    for (String s: res) {
      System.out.println(s);
    }
  }
}
