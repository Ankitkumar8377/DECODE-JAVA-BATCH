import java.util.Scanner;

public class ReversedStarTriangle {
     public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter n: ");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.printf( "*" + " " );
            }

            System.out.println();
        }
        sc.close();

    }
    
}