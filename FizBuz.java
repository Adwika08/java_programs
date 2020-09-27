class FizBuz {
  public static void main(String args[]) {
    for (int i=1;1<=50 ;i++ ) {
      if (i%3==0) {
        System.out.print("Fizz");
      } else if (i%5==0) {
        System.out.print("Buzz");
      } else if (i%15==0) {
        System.out.print("FizzBuzz");
      } else {
        System.out.print(i);
      }
    }
  }
}
