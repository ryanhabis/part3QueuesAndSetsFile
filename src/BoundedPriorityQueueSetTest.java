import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;


class BoundedPriorityQueueSetTest
{


    Task first = new Task("Ryan", "Create a program for client", LocalDate.of(2023, 4,15));
    Task second = new Task("Dylan", "Make a website", LocalDate.of(2023, 4,12));
    Task third = new Task("Richard", "Make an application", LocalDate.of(2023, 4,13));
    Task fourth = new Task("Mawie", "Check for bugs", LocalDate.of(2023, 4,14));
    Task five = new Task("Ron", "Check for bugs", LocalDate.of(2023, 4,15));
    Task six = new Task("Ron", "Check for bugs", LocalDate.of(2023, 4,16));
    Task seven = new Task("Ron", "Check for bugs", LocalDate.of(2023, 4,17));
    Task eight = new Task("Ron", "Check for bugs", LocalDate.of(2023, 4,18));
    Task nine = new Task("Ron", "Check for bugs", LocalDate.of(2023, 4,19));
    Task ten = new Task("Ron", "Check for bugs", LocalDate.of(2023, 4,20));

    BoundedPriorityQueueSetTest() throws IllegalAccessException
    {
    }


    /**
     * test to check the size() method of BoundedPriorityQueueSet when the set is empty.
     *
     * This test creates a new BoundedPriorityQueueSet, and then checks the size of the set using the size() method.
     * The expected result is 0, as the set should be empty initially and have no elements.
     *
     * This test also includes a console output to indicate the purpose of the test.
     */
    @Test
    void size_isEmpty()
    {
        System.out.println("Check is the set contains empty");
        BoundedPriorityQueueSet set = new BoundedPriorityQueueSet();
        int expected = 0;
        int actual = set.size();
        assertEquals(expected, actual);
    }

    /**
     * Test to check the size() method of BoundedPriorityQueueSet when the set is not empty.
     *
     * This test creates a new BoundedPriorityQueueSet and adds multiple elements to it using the add() method.
     * Then, it checks the size of the set using the size() method.
     * The expected result is the number of elements added to the set, which is 5 in this case.
     *
     */
    @Test
    void size_notEmpty()
    {
        BoundedPriorityQueueSet set = new BoundedPriorityQueueSet();

        set.add(first);
        set.add(second);
        set.add(third);
        set.add(fourth);
        set.add(five);

        int expected = 5;
        int actual = set.size();
        assertEquals(expected, actual);
    }

    @Test
    void isEmpty()
    {
        System.out.println("Check if the set is empty");
        BoundedPriorityQueueSet  set = new BoundedPriorityQueueSet();
        boolean actual = set.isEmpty();
        assertTrue(actual);
    }

    /**
     * This test is to check the isEmpty() method of BoundedPriorityQueueSet when the set is not empty.
     *
     * This test creates a new  BoundedPriorityQueueSet, adds an element to it, and then checks if the set is empty
     * using the isEmpty() method. The expected result is false, as the set should not be empty after adding
     * an element to it.
     *
     */
    @Test
    void isEmpty_notEmpty()
    {
        System.out.println("Check if the set is not empty");
        BoundedPriorityQueueSet  set = new BoundedPriorityQueueSet();
        set.add(five);
        boolean actual = set.isEmpty();
        assertFalse(actual);
    }
    /**
     * Tests the isFull() method with a full set of elements in the BoundedPriorityQueueSet.
     *
     * Test steps:
     * 1. Create a new  BoundedPriorityQueueSet.
     * 2. Add a full set of elements to the set.
     * 3. Call the isFull() method to check if the set is full.
     * 4. Assert that the expected result matches the actual result.
     */

    @Test
    void testIsFull_WithFullSet()
    {
        System.out.println("Testing isFull() method with full set");
        BoundedPriorityQueueSet  set = new BoundedPriorityQueueSet();

        set.add(first);
        set.add(second);
        set.add(third);
        set.add(fourth);
        set.add(five);
        set.add(six);
        set.add(seven);
        set.add(eight);
        set.add(nine);
        set.add(ten);

        boolean expected = true;
        boolean actual = set.isFull();
        assertEquals(expected, actual);
    }

    /**
     * Tests the isFull() method with a not-full set of elements in the BoundedPriorityQueueSet.
     *
     * Test steps:
     * 1. Create a new BoundedPriorityQueueSet.
     * 2. Add a set of elements to the set that is not full.
     * 3. Call the isFull() method to check if the set is full.
     * 4. Assert that the actual result is false, indicating that the set is not full.
     */
    @Test
    void testIsFull_WithNotFullSet()
    {
        System.out.println("Testing isFull() method with not full set");
        BoundedPriorityQueueSet  set = new BoundedPriorityQueueSet();

        set.add(first);
        set.add(second);
        set.add(third);
        set.add(fourth);
        set.add(five);
        set.add(ten);

        boolean actual = set.isFull();
        assertFalse(actual);
    }

    /**
     * Tests the contains() method in the BoundedPriorityQueueSet.
     *
     *
     * Test steps:
     * 1. Create a new BoundedPriorityQueueSet.
     * 2. Add a set of elements to the set.
     * 3. Call the contains() method with an element that is present in the set.
     * 4. Assert that the actual result is true, indicating that the element is present in the set.
     * 5. Call the contains() method with an element that is not present in the set.
     * 6. Assert that the actual result is false, indicating that the element is not present in the set.
     *
     */
    @Test
    void testContains() {
        System.out.println("Testing contains() method");
        BoundedPriorityQueueSet set = new BoundedPriorityQueueSet();

        // Add a set of elements to the set
        set.add(first);
        set.add(second);
        set.add(third);
        set.add(fourth);

        // Test contains() with an element that is present in the set
        boolean actual = set.contains(first);

        assertTrue(actual);

    }

    @Test
    void indexOf()
    {

    }

    @Test
    void add()
    {
        System.out.println("Testing add() method");
        BoundedPriorityQueueSet set = new BoundedPriorityQueueSet();

        set.add(first);

        int excpected = 1;
        int actual = set.size();

        assertEquals(excpected, actual);
    }

    @Test
    void testPeek() {
        System.out.println("Testing peek() method");
        BoundedPriorityQueueSet set = new BoundedPriorityQueueSet();

        set.add(second);
        set.add(first);
        set.add(third);
        set.add(fourth);
        set.add(five);

        Object expected = second; // expected value is the first element added to the set
        Object actual = set.peek(); // call the peek() method to get the actual value

        assertEquals(expected, actual); // assert that the expected and actual values are equal
    }

    /**
     * Tests the contains() method in the BoundedPriorityQueueSet.
     *
     * Test steps:
     * 1. Create a new BoundedPriorityQueueSet.
     * 2. Add a set of elements to the set.
     * 3. Call the contains() method with an element that is present in the set.
     * 4. Assert that the actual result is true, indicating that the element is present in the set.
     * 5. Call the contains() method with an element that is not present in the set.
     * 6. Assert that the actual result is false, indicating that the element is not present in the set.
     */
    @Test
    void remove()
    {
        System.out.println("Testing remove() method");
        BoundedPriorityQueueSet set = new BoundedPriorityQueueSet();

        // Add a set of elements to the set
        set.add(first);
        set.add(second);
        set.add(third);
        set.add(fourth);

        Task expected = first;

        // Test remove() the first element that is present in the set
        Task actual = set.remove();


        assertEquals(actual,expected);
    }
}