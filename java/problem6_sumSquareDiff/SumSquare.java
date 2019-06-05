public class SumSquare {

  public static void main(String[] args) {
    int sum;
    int naturalNumber = 100;
    sum = squareOfSum(naturalNumber)- sumOfSquare(naturalNumber);
    System.out.println(sum);
  }

  public static int sumOfSquare(int numbers){
    int sum = 0;
    for(int i = 1; i<=numbers; i++){
        sum += i*i;
    }
    return sum;
  }

  public static int squareOfSum(int numbers){
    int sum = 0;
    int partialSum = 0;
    for(int i = 1; i<=numbers; i++){
      partialSum += i;
    }
    sum = partialSum*partialSum;
    return sum;
  }

}
