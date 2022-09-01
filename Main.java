import java.util.LinkedList;
import java.util.Queue;

public class Main{
    //abstract data type can be implemented with arrays or linked lists
    //First In First Out (FIFO) like waiting in line
    //Several applications in operating systems and thread mangagment


    /*Queues Applications
        graph algorithms rely heavily on queues(breadth-first search)
        useful when a reasource is shared with several consumers(threads stored in queues)
    
    */
    public static void main(String[] args) {
        //queue is a super interface of Deque interface which extends linked list
        Queue<String> queue = new LinkedList<>();//allowing the use of linked list w/ queue

        //O(1)
        queue.add("Matthew"); //throws exception if failed
        queue.offer("Test"); //returns boolean handles exception from add

        // System.out.println("removing item: " + queue.remove());
        // System.out.println("Checking item: " + queue.element());

        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }
        System.out.println(queue.size());

    }
    /*INSERT - add() throws exception / offer() returns special value
     *REMOVE - remove() throws exception / poll() returns special value
     *EXAMINE - element() throws exception / peek() returns special value
     */
}