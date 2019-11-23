package co.com.belatrix.test.infraestructure.exception.advisor;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class DocumentAdvisor {

	@ExceptionHandler(Exception.class)
	public Object handle(Exception exception) {
		
		return /*ResponseEntity
				.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(new Object(Notification
						.builder( exception.getMessage(), exception.getError().getApiCode()).source(ErrorCodes.NOTIFICATIONSOURCE).build()));
*/ null;
	}
	
}
