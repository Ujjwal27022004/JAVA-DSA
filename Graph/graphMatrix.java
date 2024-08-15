package Graph;

public class graphMatrix {
    public static void main(String[] args) {
        int n=5;
        int m=6;

        int[][] nodes = new int[n+1][n+1];

        nodes[1][2] = 1;
        nodes[1][3] = 1;
        nodes[3][4] = 1;
        nodes[2][4] = 1;
        nodes[2][5] = 1;
        nodes[4][5] = 1;

        nodes[2][1] = 1;
        nodes[3][1] = 1;
        nodes[4][3] = 1;
        nodes[4][2] = 1;
        nodes[5][2] = 1;
        nodes[5] [4]= 1;

        for(int i=0;i<=n;i++){
            for (int j = 0; j <= n; j++) {
                System.out.print(nodes[i][j]+"  ");
            }
            System.out.println();
        }
        


    }
}
