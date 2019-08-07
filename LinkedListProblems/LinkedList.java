/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListProblems;

/**
 *
 * @author sonu
 */
public class LinkedList {
    Node head;
    int size = 0;
    void addToHead(int d) {
        Node n = new Node(d);
        n.next = head;
        head = n;
        size++;
    }
    
    void addToTail(int d) {
        Node n = new Node(d);
        Node curr = head;
        if(head==null) {
            head = n;
        }
        else {
            while(curr.next!=null) {
                curr = curr.next;
            }
            curr.next = n;
        }
        
        size++;
        
        
    }
    
    void insert(int pos, int d) {
        Node n = new Node(d);
        if(pos==0) {
            addToHead(d);
        }
        else {
           Node curr = head;
            for(int i=1;i<size;i++) {
                if(pos==i) {
                    Node temp = curr.next;
                    curr.next = n;
                    n.next = temp;
                    size++;
                    return;
                }
                
                curr = curr.next;
            }
            
        }
    }
    
    void deleteAtBeigning() {
        if(head==null) return;
        head = head.next;
        size--;
    }
    
    void deleteAtEnd() {
        if(head==null) {
            return;
        }
        
        if(head.next==null) {
            head=head.next;
            size--;
            return;
        }
        Node curr = head;
        while(curr.next.next!=null) {
            curr = curr.next;
        }
        
        curr.next = null; // or curr.next = curr.next.next;
        
        size--;
        
    }
    
    void deleteAtPos(int pos) {
        if(pos==0) {
            deleteAtBeigning();
            return;
        }
        
        Node curr = head;
        
        for(int i=0;i<size-1;i++) {
            if(pos-1==i) {
                curr.next = curr.next.next;
                size--;
                return;
            }
            
            curr = curr.next;
        }
        
    }
    
    void printLinkedlist() {
        System.out.println("size : " + size);
        Node curr = head;
        while(curr!=null) {
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        
        System.out.println();
    }
}
