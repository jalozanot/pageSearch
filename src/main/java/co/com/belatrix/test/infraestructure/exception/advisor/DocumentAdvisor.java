package co.com.belatrix.test.infraestructure.exception.advisor;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import co.com.belatrix.test.infraestructure.adapters.dto.Notification;
import co.com.belatrix.test.infraestructure.exception.DocumentFileException;
import co.com.bellatrix.test.domain.constants.errors.ErrorCodes;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class DocumentAdvisor {

	@ExceptionHandler(DocumentFileException.class)
	public ResponseEntity<Notification> handle(DocumentFileException exception) {

		Notification notification = new Notification();
		notification.setMessage(exception.getMessage());
		notification.setCode(exception.getError());
		notification.setSource(ErrorCodes.NOTIFICATIONSOURCE);
		
		return new ResponseEntity<>(notification, HttpStatus.INTERNAL_SERVER_ERROR);

	}
	
}
