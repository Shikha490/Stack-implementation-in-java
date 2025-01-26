public class StackUsingLinkedList {
    
// creating a Node class
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;

    static class Stack{
        
        //check if stack is Empty
        public static boolean isEmpty(){
            return head==null;
        }

    //Push Operation
        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty() ){
                head = newNode;
                return;

            }
            newNode.next=head;
            head = newNode;
        }

        //Pop operation
        public static int pop(){
            if(isEmpty() ){
                System.out.println("Stack Underflow");
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek operation return top element without removing it
        public static int peek(){
            if(head==null){
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String []args){
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        System.out.println(s1.peek());
        System.out.println("item popped "+s1.pop());
        System.out.println(s1.peek());

    }
}
