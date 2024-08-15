package PriorityQueue;


class item{
    int value;
    int priority;
};
public class PriorityQueueArray {
  

    static item[] Queue = new item[100];
    static int size=-1;

    public static void enqueue(int value,int priority){

        size++;
        Queue[size] = new item();
        Queue[size].value=value;
        Queue[size].priority=priority;
    }
    
    public static int peek(){
        int highestPriority = 0;
        for(int i=0;i<=size;i++){
            if(Queue[highestPriority].priority > Queue[i].priority){
                highestPriority = i;
                
            }
        }
        return Queue[highestPriority].value;
    }

    public static int dequeue(){
        int val = peek();
        int ind = 0;
        for(int i=0;i<=size;i++){
            if(Queue[i].value == val){
                ind = i;

            }
        }

        for(int i=ind;i<size;i++){
            Queue[i].value = Queue[i+1].value;
            Queue[i].priority = Queue[i+1].priority;
        }
        size--;

        return ind;
    }

    public static void main(String[] args) {
        enqueue(5,5 );
        enqueue(4,4 );
        enqueue(3,3 );
        enqueue(2,2 );
        for (int i = 0; i <= size; i++) {
            System.out.println(Queue[i].value);
        }
        System.out.println(dequeue());
    }
}
