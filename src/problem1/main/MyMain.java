/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

public class MyMain {

public static void main(String[] args) {
   MyBinarySearchTree binarySearchTree = new MyBinarySearchTree();
   binarySearchTree.insert(10);
  binarySearchTree.insert(35);
   binarySearchTree.insert(50);
    binarySearchTree.insert(45);


 System.out.println("Left child of the BinarySearch tree: ");
 binarySearchTree.traverse();
 System.out.println("Number of Parents not having their left child :");
 System.out.println(binarySearchTree.getCountRight());

}
}
