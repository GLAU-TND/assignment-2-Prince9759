/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.Student.student;
import problem3.mylinkedlist.LinkedList;

public class MyPriorityQueue {
    LinkedList linkedList=new LinkedList();
    public void enqueue(student s){
        linkedList.addLast(s);
    }
    public void dequeue(){
        linkedList.deleteFirst();
    }
    public void show(){
        linkedList.display();
    }
}
