/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem4.LinkedList.MyLinkedList;

public class MyQueue {
    MyLinkedList mylinkedList=new MyLinkedList();
    public int peek(int data){
        if(mylinkedList.search(data)==null){
            return -1;
        }
        return mylinkedList.search(data).getData();
    }
    public void enqueue(int data) {
        mylinkedList.addLast(data);
    }
    public void dequeue(){
        mylinkedList.deleteFirst();
    }

    public void show() {
        mylinkedList.display();
    }
}
