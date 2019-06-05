import java.util.List;
import java.util.ArrayList;

public class Palindrome{
  static int noLength = 0;
  public static void main(String[] args) {
    int sum = 1;

    List<Integer> noList = new ArrayList<>();

    int d1 =100;
    int d2 =100;

    for(d1 = 100; d1< 1000; d1++){
      while(d2>99 && d2<1000){
        int temp = d1*d2;
        if(checkIfPalindrome(temp)){
          if (temp>sum)
          sum = temp;
      }
        // System.out.println(d1 + " " + d2 + " " + sum);
        d2++;
      }
      d2 = 100;
    }
    System.out.println(sum);
  }

  //Checks if an integer is a palindrome
  public static boolean checkIfPalindrome(int number){
    int r,sum = 0; //r = remainder
    int temp = 0;
    temp = number;
    while(number>0){
      r = number%10;
      sum = (sum*10)+r;
      number /= 10;
    }
    if (temp == sum){
      return true;
    }else
    return false;
  }
}
