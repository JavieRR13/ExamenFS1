package javiermartin.fullstack.galeria.exceptions.handlers;

import java.net.URI;
import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javiermartin.fullstack.galeria.exceptions.*;
	

	@RestControllerAdvice
	public class GlobalExceptionHandler {

	    @ExceptionHandler(ArtworkCreationException.class )
	    public ProblemDetail handleAtworkCreationException(ArtworkCreationException e) {

	        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
	        problemDetail.setTitle("Artwork Exception Occurred");
	        problemDetail.setType(URI.create("http://cesurformacion.com/"));
	        problemDetail.setProperty("errorCategory", "Artwork");
	        problemDetail.setProperty("timeStamp", Instant.now());

	        return problemDetail;
	    }

	}
