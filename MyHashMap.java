package HashMap;

public class MyHashMap<K,V> {
    MyLinkedList<K> myLinkedList;
	private Object myLinkedList1;

    public MyHashMap(MyLinkedList<K> myLinkedList) {
        this.myLinkedList1 = myLinkedList;
    }

    public MyLinkedList<K> getMyLinkedList() {
        MyLinkedList myLinkedList;
		return myLinkedList;
    }
}