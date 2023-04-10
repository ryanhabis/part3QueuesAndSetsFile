import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;


class BoundedPriorityQueueSetTest
{


    Task first = new Task("Ryan", "Create a program for client", LocalDate.of(2023, 4,11));
    Task second = new Task("Dylan", "Make a website", LocalDate.of(2023, 4,12));
    Task third = new Task("Richard", "Make an application", LocalDate.of(2023, 4,13));
    Task fourth = new Task("Mawie", "Check for bugs", LocalDate.of(2023, 4,14));
    Task five = new Task("Ron", "Check for bugs", LocalDate.of(2023, 4,15));
    Task six = new Task("Ron", "Check for bugs", LocalDate.of(2023, 4,16));
    Task seven = new Task("Ron", "Check for bugs", LocalDate.of(2023, 4,17));
    Task eight = new Task("Ron", "Check for bugs", LocalDate.of(2023, 4,18));
    Task nine = new Task("Ron", "Check for bugs", LocalDate.of(2023, 4,19));
    Task ten = new Task("Ron", "Check for bugs", LocalDate.of(2023, 4,20));
    Task eleven = new Task("Ron", "Check for bugs", LocalDate.of(2023, 4,21));

    BoundedPriorityQueueSetTest() throws IllegalAccessException
    {
    }


    @Test
    void size_isEmpty()
    {
        System.out.println("Check is the set contains empty");
        BoundedPriorityQueueSet set = new BoundedPriorityQueueSet();
        int expected = 0;
        int actual = set.size();
        assertEquals(expected, actual);
    }

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

    @Test
    void isEmpty_notEmpty()
    {
        System.out.println("Check if the set is not empty");
        BoundedPriorityQueueSet  set = new BoundedPriorityQueueSet();
        set.add(five);
        boolean actual = set.isEmpty();
        assertFalse(actual);
    }

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

    @Test
    void contains()
    {
    }

    @Test
    void indexOf()
    {
    }

    @Test
    void add()
    {

    }

    @Test
    void testPeek() {
        System.out.println("Testing peek() method");
        BoundedPriorityQueueSet set = new BoundedPriorityQueueSet();

        set.add(first);
        set.add(second);
        set.add(third);
        set.add(fourth);
        set.add(five);

        Object expected = first; // expected value is the first element added to the set
        Object actual = set.peek(); // call the peek() method to get the actual value

        assertEquals(expected, actual); // assert that the expected and actual values are equal
    }

    @Test
    void remove()
    {
    }
}