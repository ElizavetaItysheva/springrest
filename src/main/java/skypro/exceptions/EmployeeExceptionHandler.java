package skypro.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class EmployeeExceptionHandler {

    public ResponseEntity<MessageForExceptions> handleException(EmployeeException employeeException){
        MessageForExceptions message = new MessageForExceptions();
        message.setMessage(employeeException.getMessage());

        return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
    }
}
