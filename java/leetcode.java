class leetcode {
    public static void main(String[] args) {
        


    }
    public  static void rotate(int[][] matrix) {
      int[][] matrix2=new int[matrix.length][matrix.length];

      for (int i = 0; i < matrix2.length; i++) {
        for (int j = 0; j < matrix2.length; j++) {
            matrix[j][i]=matrix[i][j];   
        } 
      }
        
    }

   
}