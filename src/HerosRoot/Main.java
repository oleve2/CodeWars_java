package HerosRoot;

public class Main {
  public static void main(String[] args) {
    JIntSqRoot(144, 1);
  }
  
  public static long JIntSqRoot(long n, long guess) {
    long e = 1;
    double x_start = guess;
    long diff = n;
    
    long steps = 0;
    System.out.println("x_start=" + x_start);
    while (diff > e) {
      steps+=1;
      long x_new = (long) Math.floor((x_start + Math.floor(n / x_start))/2);
      diff = (long) Math.abs(x_new - x_start);
      System.out.println(x_new + " | " + diff);
      x_start = x_new;
    }
    System.out.println("The answer is " + x_start + ", cnt steps=" + steps);
    return steps;
  }
}
