
import java.time.LocalDate;
public class Task implements Comparable <Task>
{
    private String owner;
    private String description;
    private LocalDate deadline;
    private final LocalDate currentTime = LocalDate.now();


    /**
     * Constructs a new Task with the specified owner, description, and deadline.
     * Throws an IllegalAccessException if the deadline is before the current time.
     *
     * @param owner      The owner of the task.
     * @param description The description of the task.
     * @param deadline   The deadline for the task.
     * @throws IllegalAccessException If the deadline is before the current time.
     */
    public Task(String owner, String description, LocalDate deadline) throws IllegalAccessException
    {
        if (currentTime.compareTo(deadline) >= 0)
        {
            throw new IllegalAccessException("The time is below 0 ");
        }
        this.owner = owner;
        this.description = description;
        this.deadline = deadline;
    }
    public Task()
    {

    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public LocalDate getDeadline()
    {
        return deadline;
    }


    /**
     * Sets the deadline of the task.
     * Throws an IllegalAccessException if the deadline is before the current time.
     *
     * @param deadline The deadline of the task.
     * @throws IllegalAccessException If the deadline is before the current time.
     */
    public void setDeadline(LocalDate deadline) throws IllegalAccessException
    {
        if (deadline.isBefore(currentTime))
        {
            throw new IllegalAccessException("Your current deadline is invalid");
        }
        this.deadline = deadline;
    }

    public LocalDate getCurrentTime()
    {
        return currentTime;
    }

    /**
     * Compares this task to another task based on their deadline.
     *
     * @param o The task to compare to.
     * @return A negative integer if this task's deadline is before the other task's deadline,
     *         a positive integer if this task's deadline is after the other task's deadline,
     *         or zero if both tasks have the same deadline.
     */
    public int compareTo(Task o)
    {
        return this.deadline.compareTo(o.getDeadline());
    }

    /**
     * Compares this task to another object for equality.
     *
     * @param o The object to compare to.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;

        Task task = (Task) o;

        if (getOwner() != null ? !getOwner().equals(task.getOwner()) : task.getOwner() != null) return false;
        if (getDescription() != null ? !getDescription().equals(task.getDescription()) : task.getDescription() != null)
            return false;
        return getDeadline() != null ? getDeadline().equals(task.getDeadline()) : task.getDeadline() == null;
    }

    @Override
    public int hashCode()
    {
        int result = getOwner() != null ? getOwner().hashCode() : 0;
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getDeadline() != null ? getDeadline().hashCode() : 0);
        return result;
    }

    @Override
    public String toString()
    {
        return "Task{" +
                "owner='" + owner + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                '}';
    }
}
