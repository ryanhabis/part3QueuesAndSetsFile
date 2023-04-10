import java.time.LocalDate;

public class app
{
    public static void main(String[] args) throws IllegalAccessException
    {
        
        Task first = new Task("Ryan", "Create a program for client", LocalDate.of(2023, 4,11));
        Task second = new Task("Dylan", "Make a website", LocalDate.of(2023, 4,12));
        Task third = new Task("Richard", "Make an application", LocalDate.of(2023, 4,13));
        Task fourth = new Task("Mawie", "Check for bugs", LocalDate.of(2023, 4,14));
        Task five = new Task("Ron", "Check for bugs", LocalDate.of(2023, 4,15));

        BoundedPriorityQueueSet sets = new BoundedPriorityQueueSet();
        sets.add(first);
        sets.add(second);
        sets.add(third);
        sets.add(fourth);
        sets.add(five);

        System.out.println(sets);

    }
}
