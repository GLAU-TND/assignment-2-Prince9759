/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {
    private int size;
    private int beginning;
    private int top;
    private int maxSize;
    private Student[] circularQueue;
    private boolean isEmpty(){
        return size==0;
    };

    private boolean isFull(){
        return size==maxSize;
    }
}
