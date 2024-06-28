public class reg2 {
    public static int random(int[] A) {
        int a = A[0];
        int b = A[1];
        int j = 0;
        int[] storage = new int[b - a + 1];

        for (int i = a; i <= b; i++) {

            storage[j] = i;
            j++;
        }
        int randomnumber = 0;

        randomnumber = (int) (System.nanoTime() % (b - a + 1));
        return storage[randomnumber];
    }

    public static String randomdept() {
        String[] A = { "it" };
        int n = A.length;
        int randomnumber = 0;

        randomnumber = (int) (System.nanoTime() % (n));
        return A[randomnumber];
    }

    public static int[] addArray(int[][] D) {
        int[] array = new int[100];
        int a=D[0].length; 
        int b=D[1].length; 
        int c=D[2].length; 
        int i=0;
        
        for(int j=0;j<a;j++){
            array[i] = D[0][j];
            i++;
        }
        for(int j=0;j<b;j++){
            array[i] = D[1][j];
            i++;
        }
        for(int j=0;j<c;j++){
            array[i] = D[2][j];
            i++;
        }
        // for (int j = 0; j < array.length; j++) {
        //     System.out.println(array[j]);
            
        // }

        return array;
        

    }

    public static int[] generateRange(int start, int end) {
        int[] range = new int[end - start + 1];
        for (int i = 0; i < range.length; i++) {
            range[i] = start + i;
        }
        return range;
    }

    public static int number() {
        int no = 0;
        int[] A = generateRange(1, 80);
        int[] B = generateRange(151, 160);
        int[] C = generateRange(501, 510);

        int[][] D = { A, B, C };
        int[] combinedArray = addArray(D);

        int[] range={0,combinedArray.length};
        int index = random(range);


         
        return combinedArray[index];
    }

    static void printregno(String[] array) {
        int A[] = { 2021, 2021 };
        int y = random(A);
        String year = Integer.toString(y);
        String department = randomdept();

        String no = Integer.toString(number());
        if (no.length() < 3) {
            no = "0" + no;
        }
        if (no.length() < 2) {
            no = "0" + no;
        }

        int i=0;
        
        String ans = year + "b" + department + no;
        array[i]=ans;
        i++;


        System.out.println(ans);

    }

    public static void main(String[] args) {
        String[] Array = new String[100];

        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }

    }
}
