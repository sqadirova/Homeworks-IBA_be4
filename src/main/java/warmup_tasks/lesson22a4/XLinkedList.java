package warmup_tasks.lesson22a4;

public class XLinkedList {

  static class Node {
    final int value;
    Node next;

    Node(int value) {
      this.value = value;
    }

    Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }

  }

  Node head = null;

  // it modifies the structure and returns new head
  void prepend(int element) {
    Node node=new Node(element);
    node.next=head;
    head=node;

  }

  void append(int element) {
    Node node=new Node(element);
    if(head==null){
      head=node;
    }else{
      Node curr=head;
      while(curr.next!=null){
        curr=curr.next;
      }
      curr.next=node;
    }
  }

  int size() {
    throw new IllegalArgumentException("size:hasn't implemented yet");
  }

  boolean contains(int element){
    throw new IllegalArgumentException("contains:hasn't implemented yet");
  }

  Node reverse() {
    throw new IllegalArgumentException("reverse:hasn't implemented yet");
  }

  String represent() {
    throw new IllegalArgumentException("represent:hasn't implemented yet");
  }

}
