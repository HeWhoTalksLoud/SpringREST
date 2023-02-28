package skypro.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<MessageForExceptions> handleException(
            EmployeeException employeeException) {
        MessageForExceptions message = new MessageForExceptions();
        message.setMessage(employeeException.getMessage());

        return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
    }
}
