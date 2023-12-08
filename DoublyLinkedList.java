import java.io.*;
class DoublyLinkedList
{
    class Node
    {
        int data;
        Node prev;
        Node next;
        public Node(int data)
        {
            this.data = data;
        }
    }
    Node head = null;
    Node tail = null;
    void addNode(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            newNode.next = null;
        }
    }
    void deleteNode()
    {
        if(head==null)
        {
            System.out.println("Empty List !");
        }
        else if(head==tail)
        {
            head=tail=null;
        }
        else
        {
            tail = tail.prev;
            tail.next = null;
        }
    }
    void display()
    {
        if(head==null)
        {
            System.out.println("Empty List !");
        }
        else
        {
            Node temp = head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) throws IOException
    {
        int data,cho;
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        do
        {
            System.out.println("1.Insert\n2.Delete\n3.Display\n4.Exit\nEnter your choice : ");
            cho = Integer.parseInt(bufferedReader.readLine());
            switch(cho)
            {
                case 1 :
                {
                    System.out.println("Enter the data : ");
                    data = Integer.parseInt(bufferedReader.readLine());
                    doublyLinkedList.addNode(data);
                    break;
                }
                case 2 :
                {
                    doublyLinkedList.deleteNode();
                    break;
                }
                case  3 :
                {
                    doublyLinkedList.display();
                }
                case 4 :
                {
                    break;
                }
            }
        }while(cho<=3);
    }
}