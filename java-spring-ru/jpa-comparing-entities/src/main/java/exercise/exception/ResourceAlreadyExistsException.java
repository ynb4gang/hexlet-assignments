package exercise.exception;

// BEGIN
public class ResourceAlreadyExistsException extends RuntimeException {
    public ResourceAlreadyExistsException(String message) {
        return super(message);
    }
}
// END
