package LinkedList;

public class LL1 
{

    // declaration of head tail and size
    private Node head;
    private Node tail;
    int size;

    // Constructor of main class
    LL1() 
    {
        this.size = 0;
    }

    // Node structure
    public class Node 
    {
        private int value;
        private Node next;

        // Values given to node
        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // get the node at an index

    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }


    // Insert First element

    public void InsertFirst(int value)
    {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    // Insert at last

    public void InsertLast(int value){

        if(tail==null){
            InsertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size ++;
    }

    // Insert at any position

    public void Insert(int value,int index){
        if(index==0){
            InsertFirst(value);
            return;
        }
        if(index == size){
            InsertLast(value);
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size ++;   
        }

        // Delete first node
        public int DeleteFirst(){
            Node node = head;
            head = head.next;

            if(head==null){
                tail = null;
            }
            size--;
            return node.value;
        }

        // Delete last node

        public int DeleteLast(){

            if(size <= 1){
                return DeleteFirst();
            }
            Node secondLast = get(size-2);
            int value = tail.value;
            tail = secondLast;
            secondLast.next=null;

            return value;
        }

        // Delete at any index

        public int Delete(int index){
            if(index == 0){
                return DeleteFirst();
            }
            if(index == size-1){
                return DeleteLast();
            }

            Node prev = get(index - 1);
            int value = prev.next.value;
            prev.next = prev.next.next;

            return value;

        }
 
    //Display linkedlist
    public void Display()
    {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }

    // Find node index
    public Node index(int val){
        Node temp = head;
        while(temp != null){
            if(temp.value == val){
                return temp;
            }
            temp = temp.next;
        }
        return temp;
    }


    
    
        public Node reverseList(Node head) {
            if(head==null){
                return head;
            }
            Node prev = null;
            Node curr = head;
            while(curr != null){
                Node temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            head = prev;
            return head;
        }
        

     

}
