import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CouponNumberCollector {
    public  static int generateCouponNumber(int n) {
    	Random random = new Random();
        return random.nextInt(n);
    }
    public static int collectCoupons(int n) {
        HashSet<Integer> distinctCoupons = new HashSet<>();
        int totalRandomNumbers = 0;
        while (distinctCoupons.size() < n) {
            int coupon = generateCouponNumber(n);
            totalRandomNumbers++;
            distinctCoupons.add(coupon);
        }
        return totalRandomNumbers;
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of distinct coupons: ");
        int numberOfCoupons = scanner.nextInt();
        int randomNumbersGenerated = collectCoupons(numberOfCoupons);
        System.out.println("Total distinct coupons: " + numberOfCoupons);
        System.out.println("Total random numbers generated: " + randomNumbersGenerated);


	}

}
