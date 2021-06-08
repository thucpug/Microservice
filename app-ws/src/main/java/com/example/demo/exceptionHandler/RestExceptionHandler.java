package com.example.demo.exceptionHandler;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.model.ErrorMessageModel;

@ControllerAdvice
public class RestExceptionHandler extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ExceptionHandler(value = { MethodArgumentTypeMismatchException.class })
	public ResponseEntity<?> handleAnyException(MethodArgumentTypeMismatchException ex, WebRequest request) {
		ErrorMessageModel errorMessageModel = new ErrorMessageModel();
		errorMessageModel.setTimestamp(new Date());
		errorMessageModel.setMessage(ex.getMessage());
		return new ResponseEntity<>(errorMessageModel, new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(value = { Exception.class })
	public ResponseEntity<?> handleAnyException(Exception ex, WebRequest request) {
		ErrorMessageModel errorMessageModel = new ErrorMessageModel();
		errorMessageModel.setTimestamp(new Date());
		errorMessageModel.setMessage(ex.getMessage());
		return new ResponseEntity<>(errorMessageModel, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@ExceptionHandler(value = { UserServiceException.class })
	public ResponseEntity<?> handleUserServiceException(UserServiceException ex, WebRequest request) {
		ErrorMessageModel errorMessageModel = new ErrorMessageModel();
		errorMessageModel.setTimestamp(new Date());
		errorMessageModel.setMessage(ex.getLocalizedMessage());
		return new ResponseEntity<>(errorMessageModel, new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}
}
