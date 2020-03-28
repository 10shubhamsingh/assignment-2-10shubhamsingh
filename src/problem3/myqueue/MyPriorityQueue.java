/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

  import problem3.myLinkedList.MyLinkedList;
 import problem3.student.Student;

public class MyPriorityQueue {
  MyLinkedList linkedList = new MyLinkedList();
  public void enqueue(Student student){
    linkedList.addLast(student);
    }
  punlic void dequue(){
    
linkedList.deleteFirst();
}
  public void ahow(){
   linkedList.diaplay();
    }
  }
