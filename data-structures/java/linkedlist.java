class Node {
  protected int value;
  protected Node next;


  public Node() {
    next = null;
    value = 0;
  }

  public Node(int v, Node n) {
    value = v;
    next = n;
  }

  public void setNext(Node n) {
    next = n;
  }

  public void setValue(int v) {
    value = v;
  }

  public Node getNext() {
    return next;
  }

  public int getValue(){
    return value;
  }
}


public class linkedlist {
  
  protected Node head; 
  protected Node tail;
  public int size; 

  public linkedlist() {
    head = null;
    tail = null;
    size = 0;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public int getSize() {
    return size;
  }

  public Node find(int val) {
    Node n = head;
    while (n != null) {
      if (n.value == val) {
        return n;
      }
      else {
        n = n.getNext();
      }
    }
    return n;
  }

  public void delete(int val) {
     Node n = find(val);
     Node tmp1 = head;
     Node tmp2 = tmp1;
     // Check if list is empty
     if (head == null) {
       System.out.println("List is empty!");
       return;
     }
     else if (size == 1){
       head = null;
       size--;
     }
     else if (n == head) {
        head = n.next;
        size--;
     }
     else if (n == tail) {
        while (tmp1.next != null) {
          tmp2 = tmp1;
          tmp1 = tmp1.next;
        }
        tmp2.next = null;
        size--;
     } 
     else {
        while (tmp1.value != val) {
          if (tmp1.next == null) {
            System.out.println("Given node not found in list");
            break;
          }
          tmp2 = tmp1;
          tmp1 = tmp1.next;
        }
        tmp2.next = tmp1.next;
     }


  }


  public void insert(int val) {
    Node n_ptr = new Node(val, null);
    size++;

    if (head == null) {
      head = n_ptr;
      tail = head;
    }
    else {
      tail.setNext(n_ptr);
      tail = n_ptr;
    }
  }
 
 public void display() {
   if (head == null) {
     System.out.println("\n List is Empty\n");
   }
   else {
     Node tmp = head;
     System.out.print("\n\n Elements in linked list are : \n");
     while (tmp.next != null) {
       System.out.println(tmp.value);
       tmp = tmp.next;
     }
     System.out.println(tmp.value);
   }
 }


 public static void main(String args[]) {
    linkedlist ll_one = new linkedlist();
    ll_one.insert(1);
    ll_one.insert(2);
    ll_one.insert(3);
    ll_one.insert(4);
    ll_one.insert(5);
    ll_one.delete(3);
    ll_one.display();    


 }
}



