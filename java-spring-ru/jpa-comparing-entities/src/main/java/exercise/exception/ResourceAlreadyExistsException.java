package exercise.exception;

// BEGIN
public class ResourceAlreadyExistsException extends ResponseEntityExceptionHandler {
    public ResourceAlreadyExistsException(String message) {
        return super(message);
    }
}
// END
