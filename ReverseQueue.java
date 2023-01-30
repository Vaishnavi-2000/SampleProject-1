package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReverseQueue {

	public static void queueReverse(Queue<Integer> input) {
		if(input.size()<=1)
			return;
		int elem=input.remove();
		queueReverse(input);
		input.add(elem);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			q.add(sc.nextInt());
		}
		queueReverse(q);
		while(!q.isEmpty()) {
			System.out.print(q.remove()+" ");
		}

	}

}
