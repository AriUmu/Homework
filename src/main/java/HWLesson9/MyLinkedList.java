package HWLesson9;

/**
 * Created by arina on 12.07.17.
 */
public class MyLinkedList {
    Node first;
    Node last;
    int size;

    public void add(String value){
        Node node = new Node(value, null);
        if(first == null){
            first = node;
        }
        else {
            last.next = node;
        }
        last = node;
        size++;
    }

    public boolean remove(String value){
        boolean result = false;
        Node current = first;
        Node prev = null; //предыдущий

        while(current != null){
            if(current.value.equals(value)){
                if(prev == null){
                    first = current.next;
                }
                else {
                    prev.next = current.next;
                }
                size--;
                result = true;
                break;
            }
            prev = current;
            current = current.next;
        }
        if (first == null) {
            last = null;
        }
        return result;
    }

    public boolean remove(int index){
        Node current = first;
        Node prev = null; //предыдущий
        int num = 0;
        boolean flag = false;
        if(index == 0){
            first = current.next;
            size--;
            return true;
        }
        while (num != index){
            prev = current; //
            current = current.next; //следующее значение
            num++;
        }
        if(current != null){
            prev.next = current.next;
            size--;
            flag = true;
        }
        return flag;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node current = first;

        builder.append("[ ");
        for (int i = 0; i < size; i++) {

            builder.append(current.value);
            builder.append(" ");
            current = current.next;
        }
        builder.append("]");

        return builder.toString();
    }
}
