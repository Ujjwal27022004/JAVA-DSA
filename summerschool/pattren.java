
import java.util.Scanner;

public class pattren {

    void function(int n){

        int x = n;
        int y=n;
        while(n>=0){
        
        for(int i=0;i<2*n+2;i++){
            System.out.print('*');
        }
        System.out.print('+');

        for(int i=0;i<2*n+2;i++){
            System.out.print('*');
        }
        
        System.out.println();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 2*i; j++) {
                System.out.print(" ");
            }
            
        }
        
        n--;
    }

    
    //     int a=2*x+1;
    //     x=1;
    //     while(x<a-2){
            
    //     for(int i=0;i<2*x+2;i++){
    //         System.out.print('*');
    //     }
    //     System.out.print('+');

    //     for(int i=0;i<2*x+2;i++){
    //         System.out.print('*');
    //     }
    //     System.out.println();
    //     for(int i=y;i>0;i--){
    //         System.out.print(" ");
    //     }
    //     x++;
    // }

    //     while(x>=0){
    //     for(int i=2*x+2;i<1;i++){
    //         System.out.print('*');
    //     }
    //     System.out.print('+');

    //     for(int i=2*x+2;i<1;i++){
    //         System.out.print('*');
    //     }
    //     System.out.println();
    //     x++;
    // }

}


    public static void main(String[] args) {

        pattren A = new pattren();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        A.function(a);
    }
}

