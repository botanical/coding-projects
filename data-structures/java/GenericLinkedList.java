class Node<T> {
  protected T value;
  protected Node<T> next;


  public Node(T value) {
    this.value = value;
  }

  /*public Node(T v, Node<T> n) {
    value = v;
    next = n;
  }*/

  public void setNext(Node<T> n) {
    next = n;
  }

  public void setValue(T v) {
    value = v;
  }

  public Node<T> getNext() {
    return next;
  }

  public T getValue(){
    return value;
  }
}


public class GenericLinkedList<T> {
  
  protected Node<T> head; 
  protected Node<T> tail;
  public int size; 

  /*public GenericLinkedList() {
    head = null;
    tail = null;
    size = 0;
  }*/

  public boolean isEmpty() {
    return head == null;
  }

  public int getSize() {
    return size;
  }

  public Node<T> find(Node<T> val) {
    Node<T> n = head;
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

  public void delete(Node<T> val) {
     Node<T> n = find(val);
     Node<T> tmp1 = head;
     Node<T> tmp2 = tmp1;
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


  public void insert(Node<T> val) {
    Node<T> n_ptr = (val);
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
     Node<T> tmp = head;
     System.out.print("\n\n Elements in linked list are : \n");
     while (tmp.next != null) {
       System.out.println(tmp.value);
       tmp = tmp.next;
     }
     System.out.println(tmp.value);
   }
 }


 public static void main(String args[]) {
    GenericLinkedList<Integer> ll_one = new GenericLinkedList<Integer>();

    ll_one.insert(new Node<Integer>(1));
    
    ll_one.display();    
    ll_one.insert(new Node<Integer>(2));
    ll_one.display();    
    ll_one.insert(new Node<Integer>(3));
    ll_one.display();    
    ll_one.insert(new Node<Integer>(4));
    ll_one.display();    
    ll_one.insert(new Node<Integer>(1));
    ll_one.display();    
    ll_one.delete(new Node<Integer>(1));
    ll_one.display();    
    ll_one.insert(new Node<Integer>(5));
    ll_one.display();    
    ll_one.insert(new Node<Integer>(6));
    ll_one.display();    
    ll_one.delete(new Node<Integer>(4));
    ll_one.display();    
    ll_one.insert(new Node<Integer>(6));
    ll_one.display();    
    ll_one.insert(new Node<Integer>(8));
    ll_one.display();    
    ll_one.insert(new Node<Integer>(9));
    
    ll_one.display();    


 }
}



