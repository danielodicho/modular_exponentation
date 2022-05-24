import java.math.BigInteger;
public class Main
{
  //precondition: base > 1, exp > -1, mod > 0
  //postcondition: return base to the power of exponent, (modulo mod)
  public static int moduloPower(int b, int exponent, int modx)
  {
    int base = b;
    int exp = exponent;
    int mod = modx;
    // 9^5 mod 17 =
    //9 = 4
    // 4^2 = 1 
    //  2^4 = 16 mod 5 1
    int end = 1;
    while (exp>0){
      if (exp %2 == 1){
         end *= base;  
       
        }  
      if (exp == 1){
        return (end % mod);
      }
      
      base = (base*base) % mod;
      exp/= 2;
      
    }
    return base;
    }

  public static BigInteger moduloPowerCheat(BigInteger base, BigInteger exponent, BigInteger mod)
  {
    return new BigInteger("-1");
  }
  //Feel free to add additional methods
}