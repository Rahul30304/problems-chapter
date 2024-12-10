import java.util.Scanner;
class Problem1 {
    public static void main(String[] args) {
        System.out.println("Enter input");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count=0;
         long num = Math.abs(n);
        while(num>0){
            count++;
            num = num/10;
        }
        System.out.println(count);
    }
}