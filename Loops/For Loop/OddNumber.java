public class OddNumber {
    public static void main(String[] args) {
        
        int i;
        for( i = 1; i<=100 ; i++){
            if(i%2==0) continue; //Due to Continue Statement, when condition meet then new loops will start
            System.out.print( i + " ");
        }
    }
}
