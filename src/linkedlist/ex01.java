package linkedlist;

import java.util.Hashtable;

public class ex01 {
public static void deleteDups(Node n){
	Hashtable table = new Hashtable();
	Node previous = null;
	while (n != null){
		 if(table.containsKey(n.data)){
			 previous.next = n.next;
		 }
		 else{
			 table.put(n.data, true);
			 previous = n;
		 }
		 n = n.next;
	}
}
}
