import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList<T>;
public class Queue {

    Queue<T> example = new ArrayList<>();
    public T peek () {
        if (example.size()==0) {
            System.out.println("No element");
            return null;
        }
        return get(example.size() - 1);
    }

    public T enqueue (T newItem){
        example.add(newItem);
        return newItem;
    }

    public T dequeue () {
        if (example.size()==0 {
            System.out.println("No Element");
            return null;
        }
        T firstElement=peek();

        return example.remove(firstElement);
    }


}