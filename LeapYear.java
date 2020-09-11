import java.util.*;

class LeapYear{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the year");
    int a = 0;
    a = sc.nextInt();
    if(a%4==0){
    System.out.println(a+" is a leap year");
    }
    else{
    System.out.println(a+" is not a leap year");
    }
  }
}
