import java.util.*;

class Prime{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int n = sc.nextInt();
    int count=0;
    for(int i=2;i<=n%2;i++){
      if(n%i==0){
        count=count+1;
      }
    }
    if(count==0){
      System.out.println("a prime number");
    }
    else{
      System.out.println("not a prime number");
    }
  }
}
