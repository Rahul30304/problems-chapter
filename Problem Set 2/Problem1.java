import java.util.Scanner;
class Problem1 {
    public static void main(String[] args) {
        System.out.println("Enter input");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for(int i=0;i<y;i++){
            System.out.println(x);
        }
    }
}