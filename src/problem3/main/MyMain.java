/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.Student.student;
import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue=new MyPriorityQueue();
        queue.enqueue(new student("Prince",45));
        queue.enqueue(new student("Astha",15));
        queue.enqueue(new student("Prince",46));
        queue.enqueue(new student("Pranav",43));
        queue.show();
        queue.dequeue();
        queue.show();
    }
}
