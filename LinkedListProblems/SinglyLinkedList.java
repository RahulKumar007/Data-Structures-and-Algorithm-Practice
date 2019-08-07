/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListProblems;

import java.util.Scanner;

/**
 *
 * @author sonu
 */
class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        
        linkedList.addToTail(4);
        linkedList.addToHead(5);
        linkedList.addToTail(3);
        linkedList.addToTail(8);
        linkedList.printLinkedlist();
        linkedList.insert(0, 7);
        linkedList.printLinkedlist();
        
//        linkedList.deleteAtBeigning();
//        linkedList.printLinkedlist();
//        
//        linkedList.deleteAtEnd();
//        linkedList.printLinkedlist();

       linkedList.deleteAtPos(2);
       linkedList.printLinkedlist();
       linkedList.deleteAtPos(7);
       linkedList.printLinkedlist();
       
        
        
    }
}
