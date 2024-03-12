import java.util.ArrayList;

class Solution {
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m) {
        ArrayList<Integer> result = new ArrayList<>();

        int top=0;
        int bottom = n;
        int left = 0;
        int right = m;

        while(top<=bottom && left<=right){
            for (int j = left; j < m; j++) {
                    result.add(matrix[top][j]);
            }

            for(int i=top;i<n;i++){
                result.add(matrix[i][right]);
            }

            for(int j=right;j>left;j--){
                result.add(matrix[bottom][j]);
            }
            for (int i = bottom; i > top; i--) {
                result.add(matrix[i][left]);
                
            }
        }

        return result;
       
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        int n = matrix.length;
        int m = matrix[0].length;

        ArrayList<Integer> boundary = boundaryTraversal(matrix, n, m);

        System.out.println("Boundary Traversal (Clockwise): " + boundary);
    }
}
