import java.util.ArrayList;
import java.util.List;

public class Fibonacci{
  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    List<Integer> fibNumbers = new ArrayList<>();


    int number = 1;
    int prevNo = 0;
    while(number<4000000){
      int sum = 0;
      sum = number + prevNo;
      prevNo = number;
      number = sum;
      if (number % 2 == 0){
        fibNumbers.add(number);
      }
    }
    int sum = 0;
    for(int d : fibNumbers){
      if(d % 2 ==0){
        sum+=d;
      }
    }
    System.out.println("sum = " + sum);
    long endTime   = System.currentTimeMillis();
    long totalTime = endTime - startTime;
    System.out.print(totalTime);
  }
}
