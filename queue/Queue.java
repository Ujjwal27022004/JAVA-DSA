package queue;

public class Queue {

    public static void main(String[] args) {
        Queue A = new Queue(5);
        A.add(5);
        A.add(5);
        A.add(5);
        A.add(5);
        A.add(5);
        A.remove();
        A.remove();
        A.remove();
        A.remove();
        A.remove();
        A.remove();
        A.display();
    }
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end=0;

    Queue(int size){
        this.data = new int[size];
    }

    Queue(){
        this.data = new int[DEFAULT_SIZE];
    }

    public boolean add(int val){
        if(isFull()){
            System.out.println("stack is full");
            return false;
        }
        data[end] = val;
        end++;
        return true;
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("stack is Empty");
        }
        int removed = data[0];
        for(int i=1;i<data.length;i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("End");
    }

    public boolean isFull(){
        if(end == data.length){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(end == 0){
            return true;
        }
        return false;
    }
}
