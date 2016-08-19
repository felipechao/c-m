
package helpers;


public class PrimeNumbers {

   
    public Boolean isPrime(Integer num){
        for (int i = 2; i < (num/2); i++) {
            if (num % i== 0) {
                return false;
            }
        }
    
    return true;
    }
    
    public Boolean isPerfectNatural(Integer num){
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i== 0) {
                sum +=i;
            }
        }
    
    return (sum == num) ? true:false;
    }
    
    public static void main(String[] args) {
        PrimeNumbers p= new PrimeNumbers();
        System.out.println(p.isPerfectNatural(28));
    }
}

