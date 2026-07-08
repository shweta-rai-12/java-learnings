package dsa.linkedlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LoopInLinkedList {

    public static boolean hasLoop(List<Integer> ll) {
        HashMap<Integer, LinkedList<Integer>> map = new HashMap<>();
        while (ll != null) {

        }
        return false;
    }

    public static void main(String[] args) {

        // Just created a linked list - NOt sure how to put loop
        List<Integer> list = new LinkedList<>();
        for(int i=0;i<8;i++){
            list.add(i);
        }
        System.out.println("Linked List: " + list);
        // Now lets create a loop in the linked list
        // We will create a loop by making the last node point to the 3rd node
        // This is just a simulation, in real linked list we would have to manipulate the node
        // But here we will just simulate the loop by creating a reference to the 3rd node and then adding it to the end of the list
        Integer loopNode = list.get(2);
        list.add(loopNode);
        System.out.println("Linked List with loop: " + list);
        // Now we will check if there is a loop in the linked list
        // We will use Floyd's Cycle Detection Algorithm
        boolean hasLoop = hasLoop(list);
        System.out.println("Does the linked list have a loop? " + hasLoop);
    }
}
