public class DuplicateElementException extends RuntimeException
{
    /**
     * Constructs a new {@code DuplicateElementException} instance with the specified error message.
     *
     * @param message the error message.
     */
    public DuplicateElementException(String message)
    {
        super (message = "You cannot add a duplicate ");
    }
}
