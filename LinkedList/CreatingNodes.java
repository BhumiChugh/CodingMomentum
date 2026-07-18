class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}

public class CreatingNodes{
// through recursion
public static void Display(Node head){
    if(head!=null){
        System.out.print(head.val+" ");
        Display(head.next);
    }
}

//new method ke through
    // public static void Display(Node head){
    //     Node temp=head;
    //     while(temp!=null){
    //         System.out.print(temp.val+" ");
    //         temp=temp.next;
    //     }
    // }
    public static void main(String args[]){
        Node a= new Node(20);
        System.out.println("Node a value is: "+a.val);
        System.out.println("Node a pointer is: "+a.next);
        Node b= new Node(30);
        System.out.println("Node b value is: "+b.val);
        System.out.println("Node b pointer is: "+b.next);
        Node c= new Node(40);
        System.out.println("Node c value is: "+c.val);
        System.out.println("Node c pointer is: "+c.next);
        a.next=b;
        b.next=c;
        
        System.out.println("Node a pointer is: "+a.next);
       
        System.out.println("accessing c using a ka pointer"+a.next.next);
        System.out.println("Accessing b directly:"+b);
        System.out.println("Node b pointer is: "+b.next);
        System.out.println("Printing vslue of node c using a:"+a.next.next.val);

        System.out.println();
        System.out.println("Accessing all nodes using head node");
//Directly in main
        // Node temp=a;
        // while(temp!=null){
        //     System.out.println(temp.val);
        //     temp=temp.next;
        // }
        
    Display(a);
    }
}