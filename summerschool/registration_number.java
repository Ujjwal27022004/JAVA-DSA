public class registration_number {
    public static int random(int[] A){
        int a= A[0];
        int b = A[1];
        int j=0;
        int[] storage = new int[b-a+1];

        for(int i=a;i<=b;i++){
            
            storage[j]=i;
            j++;
        }
        int randomnumber=0;
        
        randomnumber = (int)(System.nanoTime()%(b-a+1));
        return storage[randomnumber];
    }
    public static String randomdept(){
        String[] A = {"cs","it","pr","me","ce","te","ie","ch","ee"};
        int n = A.length;
        int randomnumber=0;
        
        randomnumber = (int)(System.nanoTime()%(n));
        return A[randomnumber];
    }

    public static int number(){
        int no=0;
        int[] A = {1,80};
        int[] B = {151,153};
        int[] C = {501,510};

        int[] D = new int[3];
        D[0] = random(A);
        D[1]= random(B);
        D[2]=random(C);
        
        int[] Z = {0,2};
         int index = random(Z);
         no = D[index];
        return no;
    }

    static void printregno(){
        int A[] = {1983,2025};
        int y = random(A);
        String year = Integer.toString(y);
        String department = randomdept();
        
        String no = Integer.toString(number());
        
        if(no.length()<3){
            no = "0"+no;
        }
        if(no.length()<2){
            no = "0"+no;
        }

        String ans = year+"b"+department+no;

        System.out.println(ans);

    }

    public static void main(String[] args) {
        registration_number.printregno();
        
    }
}
