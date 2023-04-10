import java.util.NoSuchElementException;

public class BoundedPriorityQueueSet
{
    private int size;
    private Node first;
    private Node last;

    //might not need it here.
    private final int MAXIMUM_SIZE;
    // 1. A default constructor that sets the maximum size of the queue to be 10 Tasks.

    /**
     * Default constructor that sets the maximum size of the queue to be 10 Tasks.
     */
    public BoundedPriorityQueueSet()
    {
        MAXIMUM_SIZE = 10;
    }
    // 2. A parameterised constructor that takes in one parameter – the maximum size of the queue.

    /**
     * Parameterized constructor that takes in the maximum size of the queue as a parameter.
     * @param maxSize the maximum size of the queue
     */
    public BoundedPriorityQueueSet(int maxSize)
    {
        MAXIMUM_SIZE = maxSize;
    }

    //3. A method called size() that takes no parameters & returns the number of Tasks currently stored in your queue.

    /**
     * Returns the number of Tasks currently stored in the queue.
     * @return the number of Tasks in the queue
     */
    public int size()
    {
        return size;
    }

    //4. A method called isEmpty() that takes no parameters. This should return whether there is data currently stored
    //in the queue.

    /**
     * Returns whether there is data currently stored in the queue.
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty()
    {
        return size == 0;
    }

    //5. A method called isFull() that takes no parameters. This should return whether the queue is currently full.

    /**
     * Returns whether the queue is currently full.
     * @return true if the queue is full, false otherwise
     */
    public boolean isFull()
    {
        return size >= MAXIMUM_SIZE;

    }

    //6. A method called add() that takes a single parameter, a Task to be added to the queue. As this is a priority
    //queue, you should add the Task into the appropriate position based on its priority relative to what is already in
    //the queue. Where the queue is full when this method is called, an IllegalStateException should be
    //thrown. Where the Task is already present in the queue, a DuplicateElementException should be thrown.
    //The method should return the position at which the Task was added.

    /**
     * Returns whether the queue contains a specific Task.
     * @param value the Task to be checked
     * @return true if the queue contains the Task, false otherwise
     */
    public boolean contains(Task value) {
        return indexOf(value) != -1;
    }

    /**
     * Gets the index of a specific Task in the queue.
     * @param value the Task to be searched for
     * @return the index of the Task in the queue, -1 if not found
     */    public int indexOf(Task value) {
        Node current = first;
        int index = 0;
        while (current != null) {
            if (current.data.equals(value)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1; // Return -1 if Task not found in the queue
    }

    /**
     * Adds a Task to the queue in the appropriate position based on its priority relative to what is already in the queue.
     * Throws an IllegalStateException if the queue is full when this method is called.
     * Throws a DuplicateElementException if the Task is already present in the queue.
     * @param value the Task to be added to the queue
     * @return the position at which the Task was added
     * @throws IllegalStateException if the queue is full
     * @throws DuplicateElementException if the Task is already present in the queue
     */
    public boolean add(Task value) {

            if (contains(value)) {
                throw new DuplicateElementException("Task already present in the queue.");
            }


        if (isFull()) {
            throw new IllegalStateException("Priority queue is full.");
        }
        Node newNode = new Node(value);
        if(isEmpty()){
            first = newNode;
            last = newNode;
        }else if(value.getDeadline().compareTo(first.data.getDeadline()) < 0){
            newNode.next = first;
            first = newNode;
        }else if(value.getDeadline().compareTo(first.data.getDeadline()) >= 0){
            last.next = newNode;
            last = newNode;
        }else{
            Node current = first.next;
            Node previous = first;

            while(current.data.getDeadline().compareTo(value.getDeadline()) >= 0){
                previous = current;
                current = current.next;
            }

            previous.next = newNode;
            newNode.next = current;
        }

        size++;
        return true;
    }

    protected static class Node {

        protected Task data;
        protected Node next;

        /**
         * Constructor for Node class.
         *
         * @param value The value to be stored in the Node.
         */
        public Node(Task value) {
            this.data = value;
            this.next = null;
        }
    }

    //7. A method called peek() that takes no parameters. The method should return the first Task in the queue. Where
    //the queue is empty when this method is called, a NoSuchElementException should be thrown.

    /**
     * Peek at the first Task in the queue without removing it.
     *
     * @return The first Task in the queue.
     * @throws NoSuchElementException If the queue is empty.
     */
    public Task peek(){
        if(isEmpty()){
            throw new NoSuchElementException("The queue is empty");
        }

        return first.data;
    }

    //8. A method called remove() that takes no parameters. The method should remove the first Task from the queue
    //and return it. Where the queue is empty when this method is called, a NoSuchElementException should be
    //thrown.

    /**
     * Remove and return the first Task from the queue.
     *
     * @return The first Task in the queue.
     * @throws NoSuchElementException If the queue is empty.
     */
    public Task remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("Empty queue.");
        }
        // Store the original task to be removed
        Task original = first.data;

        // Update the first pointer and last pointer if necessary
        first = first.next;
        if (first == null) {
            last = null;
        }

        // Decrement the size of the queue
        size--;

        // Return the removed task
        return original;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        Node currentNode = first;
        while(currentNode.next != null){
            sb.append(currentNode.data).append(", ");
            currentNode = currentNode.next;
        }
        sb.append(currentNode.data).append("}");
        return sb.toString();
    }

}
