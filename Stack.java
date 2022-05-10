import java.util.LinkedList;
import java.util.Stack;
import java.util.ArrayList<T>;
public class Stack {
    Stack<T> example = new ArrayList<>();

    public T push(T newItem){
        example.add(newItem);
        return newItem;
    }

    public T peek(){
        if (example.size()==0 {
            System.out.println("No Element");
            return null;
        }
        return get(example.size() - 1);
    }

    public T pop(){
        if (example.size()==0 {
            System.out.println("NO Element");
            return null;
        }
        T firstElement=peek();

        return example.remove(firstElement);
    }


}