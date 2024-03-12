public class patterns {
    public static void main(String[] args) {

        // *
        // **
        // ***
        // ****
        // for (int row = 0; row < 4; row++) {
        //     for(int col=0;col<=row;col++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // ****
        // ***
        // **
        // *
        // for(int row=4;row>=0;row--){
        //     for(int col=0;col<row;col++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 1
        // 12
        // 123
        // 1234
        // for (int row = 1; row <= 4 ; row++) {
        //     for (int col = 1; col <= row ; col++) {
        //         System.out.print(col);
        //     }
        //     System.out.println();
        // }

            for (int row = 1; row <= 7; row++) {
                for(int col=1;col<=4;col++){
                    if(row>=col){
                        System.out.print("* ");
                    }
                    else{
                        ;
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
    }
}
