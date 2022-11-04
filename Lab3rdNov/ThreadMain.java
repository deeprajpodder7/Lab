package Lab3rdNov;
import java.util.ArrayList;
public class ThreadMain {
	public static void main(String[] args) {
	ListLoader obj= new ListLoader();
	long responseBefore=System.currentTimeMillis();
	obj.loadList(0, 10000000);
	long responseAfter= System.currentTimeMillis();
	System.out.println("the difference between the start time and end time of the process: " +(responseAfter-responseBefore));
}}
class ListLoader{
	public static void loadList(int startNumber, int lastNumber) {
		 ArrayList<Integer> L= new ArrayList<Integer>(lastNumber);
		for(int i=startNumber;i<=lastNumber;i++) {
			L.add(i);
		}
	}
}

class Thread1 extends Thread{
	public void run() {}
}
class Thread2 extends Thread{}



