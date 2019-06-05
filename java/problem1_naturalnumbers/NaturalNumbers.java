import java.util.concurrent.TimeUnit;

public class NaturalNumbers {

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    int sum = 0;
    int i = 1;
    long j = 1000;
    while(i < j){
      if(i % 3 == 0 || i % 5 == 0){
        sum +=i;
      }
      i++;
    }
    System.out.println(sum);
    long endTime = System.currentTimeMillis();
    long duration = endTime - startTime;
    System.out.println(duration);
  }
}
