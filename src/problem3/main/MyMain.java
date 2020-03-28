/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.student.Student;


// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
  
  public static void main (String args[]){
    
    MyPriorityQueue queue = new MyPriorityQueue();
    queue.enqueue(new Student ("Shubham",10));
    queue.enqueue(new Student("Shikhar,49));
     queue.enqueue(new Student("Kshitij",31)):
     queue.enqueue(new Student("Abhishek",45));
     queue.enqueue(new Student("Leo",36));
     queue.enqueue(new Student("Arya",27));
                              
     queue.show();
     queue.dequeue();
     queue.show();
             

    
    }
}
