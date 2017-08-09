package PriorityQue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority {

    public static void main(String[] args) {


        PriorityQueue<Integer> priorityQueue = new PriorityQueue();
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.add(5);
        priorityQueue.add(6);

        priorityQueue.comparator();

        for (Integer elements : priorityQueue){
            System.out.println(elements);
        }


    }

    Comparator comparator = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            if( o1.equals(o2)){
                return -1;
            }
            if(o2.equals(o1)){
                return 1;
            }
            else return 0;
        }
    };

}

