package HashMap;

public class MyLinkedList<T, K> {
	
	public INode head;

    public INode tail;

    private int size;

//Default Constructor

    public MyLinkedList() {

        this.head = null;

        this.tail = null;

    }

    /**
     * add node to front of the list (to the head of the list)
     * and increments the size of list
     * @param node
     */

    public void add(INode node) {

        if (this.head == null) {

            this.head = node;

        }

        if (this.tail == null) {

            this.tail = node;

        } else {

            INode temp = head;

            this.head = node;

            this.head.setNext(temp);

        }

        size++;

    }

    /**
     * prints the node keys in the list
     */

    public void printNodes() {

        StringBuilder nodes = new StringBuilder("Node Keys : ");

        INode temp = this.head;

        while (temp != null) {

            nodes.append(temp.getKey());

            if (temp != tail) {

                nodes.append("->");

            }

            temp = temp.getNext();

        }

        System.out.println(nodes);

    }

    /**
     * add the node at the end of list (tail of the list)
     * and increment the size of list
     *
     * @param node
     */

    public void append(INode node) {

        if (this.head == null) {

            this.head = node;

        }

        if (this.tail == null) {

            this.tail = node;

        } else {

            this.tail.setNext(node);

            this.tail = node;

        }




        size++;

    }

    /**
     * inserts the new node next to the @param myNode
     * and increments the size
     * @param myNode
     * @param newNode
     */

    public void insert(INode myNode, INode newNode) {

        INode temp = myNode.getNext();

        myNode.setNext(newNode);

        newNode.setNext(temp);




        size++;

    }




    /**
     * removes the first element (from the head)
     * and decrements the size
     * @return
     */

    public INode pop() {

        INode temp = this.head;

        this.head = head.getNext();

        size--;

        return temp;

    }
    /**
     * removes the last element (from the tail)
     * and decrements the size
     * @return
     */

    public INode popLast() {
        INode temp = this.head;

        while (temp.getNext() != this.tail) {

            temp = temp.getNext();

        }

        this.tail = temp;

        temp = temp.getNext();

        size--;

        return temp;
    }
    /**
     * searches for a given key in list and returns the INode if it finds
     * @param key
     * @return
     */

    public INode search(K key) {
        INode temp = this.head;

        while (temp != null && temp.getNext() != null) {

            if (temp.getKey().equals(key)) {
                System.out.println("Key Found");
                return temp;
            }
        }

        return null;
    }
    /**
     * returns the size of the list
     * @return
     */
    public int size() {

        return this.size;

    }
}
