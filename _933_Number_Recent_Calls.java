import java.util.LinkedList;
import java.util.Queue;

public class _933_Number_Recent_Calls {
    public _933_Number_Recent_Calls() {

    }
    private Queue<Integer> myQueue = new LinkedList<>();
    
    public int ping(int t) {
        myQueue.add(t);

        while(myQueue.peek() < (t - 3000)) {
            myQueue.remove();
        }

        return myQueue.size();
    }
    public static void main(String[] args) {
        
    }
}
