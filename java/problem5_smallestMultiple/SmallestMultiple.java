public class SmallestMultiple {
  public static void main(String[] args) {

int sum = 0;
int count = 0;
    for(int i = 1; i<1000000000;i++){
      for(int j = 1;j<=20;j++){
        sum = i%j;
        //System.out.println(sum);
        if(sum == 0){
          count ++;
        }
        if (count == 20){
          System.out.println(i);
          System.exit(0);
        }
      }
      count = 0;
    }
  }
}
