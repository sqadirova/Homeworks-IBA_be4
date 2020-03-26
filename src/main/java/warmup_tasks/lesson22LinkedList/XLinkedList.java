package warmup_tasks.lesson22LinkedList;

import java.util.StringJoiner;

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

  private static int size = 0;

  // it modifies the structure and returns new head
  void prepend(int element) {
    Node node = new Node(element);
    node.next = head;
    head = node;
    size++;

  }

  void append(int element) {
    Node node = new Node(element);
    if (head == null) {
      head = node;
    } else {
      Node curr = head;
      while (curr.next != null) {
        curr = curr.next;
      }
      curr.next = node;
    }
    size++;
  }

  int size() {
    return size;
  }

  boolean contains(int element) {
    throw new IllegalArgumentException("contains:hasn't implemented yet");
  }

  Node reverse() {
    throw new IllegalArgumentException("reverse:hasn't implemented yet");
  }

  String represent() {
    StringJoiner sj = new StringJoiner(",", "(", ")");
    Node curr = head;
    while (curr != null) {
      sj.add(String.valueOf(curr.value));
      curr = curr.next;
    }
    return sj.toString();
  }

  String represent2() {
    StringJoiner sj = new StringJoiner(",", "(", ")");
    for (Node curr = head; curr != null; curr = curr.next) {
      sj.add(String.valueOf(curr.value));
    }
    return sj.toString();
  }

  /**
   * TO IMPLEMENT RECURSIVE IMPLEMENTATION FOR
   * LIST REPRESENTATION
   */
  private void attach_next(Node curr, StringJoiner sj) {
    if (curr == null) return;
    sj.add(String.valueOf(curr.value));
    attach_next(curr.next, sj);
  }

  public String represent3r() {
    StringJoiner sj = new StringJoiner(",", "(", ")");
    attach_next(head, sj);
    return sj.toString();
  }

  public int length_iter() {
    int length = 0;
    for (Node curr = head; curr != null; curr = curr.next) {
      length++;
    }
    return length;
  }

  public int length_r() {
    return 0;
  }

  public int length_tr() {
    return 0;
  }


}
