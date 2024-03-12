package stack;

public class stack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    

    stack(int size) {
        this.data = new int[size];
    }
    stack() {
        this.data = new int[DEFAULT_SIZE];
    }

    public boolean isFull() {
        if (ptr == data.length - 1) {
            return true;
        }
        return false;
    }
    public boolean isEmpty() {
        if (ptr == - 1) {
            return true;
        }
        return false;
    }

    public boolean push(int val) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr] = val;
        return true;
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is Empty");
        }
        return data[ptr--];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        return data[ptr];
    }

    public static void main(String[] args) {
        stack A = new stack(10);
        A.push(5);
        A.push(5);
        A.push(5);
        A.push(5);
        A.push(5);
        A.push(5);
        A.push(5);
        A.push(5);
        A.push(5);
        A.push(6);

        System.out.println(A.peek());
    }
}
