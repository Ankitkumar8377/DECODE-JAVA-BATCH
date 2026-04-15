import java.util.Scanner;

 public class StarRectangle {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter rows and columns: ");
        int m=sc.nextInt();
        int n=sc.nextInt();

        for(int i=1;i<=m;i++){ //i = Rows
            for(int j=1;j<=n;j++){ //j = Columns
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }

}
    