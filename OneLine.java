import java.util.*;
class OneLine {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence = ");
    String o = sc.nextLine();
    for (int i = o.length()-1;i>=0 ;i--) {
      System.out.println(o.charAt(i));
    }
  }
}
