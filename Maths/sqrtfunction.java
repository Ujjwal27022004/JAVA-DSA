//Newtons Square root method
package Maths;
class sqrtfunction{

    public static double sqrt(int n){

        double x = n;  
        double root; 
        int count = 0; 
     
        while (true)
        { 
            count++; 

            root = 0.5 * (x + (n / x)); 
            if (Math.abs(root - x) < 1) 
                break; 
            x = root; 
        } 
     
        return root; 
    }
    public static void main(String[] args) {
        System.out.println(sqrtfunction.sqrt(16));
    }
}