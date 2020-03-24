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
//    throw new IllegalArgumentException("prepend:hasn't implemented yet");
    Node newNode=new Node(element);
    head=newNode;
  }

  void append(int element) {
//    throw new IllegalArgumentException("append:hasn't implemented yet");
    Node obj=new Node(element);
    obj.next=null;
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
