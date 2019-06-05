public class primeFactors{
  public static void main(String[] args) {
//    long prime = 13195;
    long prime = Long.parseUnsignedLong("600851475143");

    if(prime%2 == 0)
      System.out.println(2);

    while (prime%2 == 0)
      prime = prime/2;

    for(int i = 3; i<= Math.sqrt(prime) ; i += 2){
      while (prime % i == 0){
        System.out.println(i);
        prime = prime / i;
      }
    }

    if(prime > 2)
      System.out.println(prime);
  }
}
