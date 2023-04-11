# Task Specification:
Implement a class named Task. A Task is made up of two String fields: an owner and a description. The Task class should
also contain a LocalDate (from java.time) field called deadline. Your Task class should provide the following functionality:

1. A constructor that takes in the three parameters – owner, description and deadline. You should perform
validation to confirm that the deadline field is not before or equal to the current date, and handle any failing
appropriately.
Note: You can use the compareTo method from the LocalDate class to check this (today’s date can be gotten using
LocalDate.now()).
2. Getter and setter methods for the three fields. Again, you should validate the deadline information in
setDeadline() and handle any failing values appropriately.
3. An equals() method and a hashCode() method – these should base their calculation on the owner, description
and deadline fields.
4. A toString() method that returns the artist and title information in a well-formatted manner.

Tasks should have a natural order based on their deadline, in ascending order (i.e. from soonest to latest).
Reminder: You define the natural order of a class by implementing the Comparable interface in that class and
including the appropriate logic in the resulting compareTo() method.

# Exception Specification:
Implement a DuplicateElementException to be thrown where a second copy of the same element is attempted to
be added to a structure.

# Queue Specification:
Implement a BoundedPriorityQueueSet to hold Task objects. This queue should be implemented as a link-based queue
class named BoundedPriorityQueueSet. The following functionality should be provided:
1. A default constructor that sets the maximum size of the queue to be 10 Tasks.
2. A parameterised constructor that takes in one parameter – the maximum size of the queue.
3. A method called size() that takes no parameters & returns the number of Tasks currently stored in your queue.
4. A method called isEmpty() that takes no parameters. This should return whether there is data currently stored
in the queue.
5. A method called isFull() that takes no parameters. This should return whether the queue is currently full.
6. A method called add() that takes a single parameter, a Task to be added to the queue. As this is a priority
queue, you should add the Task into the appropriate position based on its priority relative to what is already in
the queue. Where the queue is full when this method is called, an IllegalStateException should be
thrown. Where the Task is already present in the queue, a DuplicateElementException should be thrown.
The method should return the position at which the Task was added.
7. A method called peek() that takes no parameters. The method should return the first Task in the queue. Where
the queue is empty when this method is called, a NoSuchElementException should be thrown.
8. A method called remove() that takes no parameters. The method should remove the first Task from the queue
and return it. Where the queue is empty when this method is called, a NoSuchElementException should be
thrown.

# Testing, Documentation & Source Control:
You are required to write unit tests for all of your Queue’s methods. You are required to develop your application as a
git-managed project hosted on github. Code should be committed regularly, not as a handful of large-scale changes.
