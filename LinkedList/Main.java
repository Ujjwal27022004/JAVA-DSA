package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL1 A = new LL1();
        A.InsertFirst(2);
        A.InsertFirst(8);
        A.InsertFirst(5);
        A.InsertFirst(56);
        A.InsertFirst(41);
        A.InsertLast(99);
        // A.Insert(100, 3 );
        // A.DeleteFirst();
        System.out.println(A.DeleteLast()); 
        A.Display();  
        System.out.println(A.size);      
        A.Delete(3);
        A.Display();

        A.reverseList(41);

    
    }
    
}

