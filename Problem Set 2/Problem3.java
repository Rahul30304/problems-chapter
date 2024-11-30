import java.util.Scanner;

public class Problem3 {
     public static void main(String[] args) {
        System.out.println("Enter input");
        Scanner sc = new Scanner(System.in);
        String firstname = sc.nextLine();
        String lastname = sc.nextLine();
        String fullname = firstname+lastname;
        int n = sc.nextInt();
        int i=0;
        do{
            System.out.println(fullname);
            i++;
        }
        while(i<n);       
    }
}
