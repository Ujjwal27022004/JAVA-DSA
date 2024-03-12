package queue;

public class CircularQueue {

    private int f = 0;
    private int e = 0;
    int size = 0;
    protected int[] data ;
    private static final int DEFAULT_SIZE = 10 ;

    CircularQueue(int size){
        this.data = new int[size];
    }
    CircularQueue(){
        this.data = new int[DEFAULT_SIZE];
    }

    public boolean isFull(){
        return size==data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }


    public boolean add(int val){
        if(isFull()){
            System.out.println("Queue is full");
            return false;
        }

        data[e] = val;
        e = e%data.length;
        size++;
        return true;
    }
    public int remove(){

        int temp = data[f];
        if(isEmpty()){
            System.out.println("Queue is empty");
        }

        f = f%data.length;
        size--;
        return temp;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        int i = f;
        do{
            System.out.println(data[i]);
            i++;
            i%=data.length;
        }while(i!=e);
        System.out.println("End");
    }
    public static void main(String[] args) {
        CircularQueue A = new CircularQueue(5);
        A.add(5);
        A.add(5);
        A.add(5);
        A.add(5);
        A.add(5);
        // A.remove();
        // A.remove();
        // A.remove();
        // A.remove();
        // A.remove();
        // A.remove();
        A.display();
    }
    
}
