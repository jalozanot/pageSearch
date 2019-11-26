package co.com.belatrix.test.infraestructure.exception;

import co.com.belatrix.test.domain.constants.errors.DocumentErrorCode;

/**
 * 
 * @author Harry
 *
 */
public class DocumentFileException extends RuntimeException {
	
	private static final long serialVersionUID = 335932166142994938L;

	private final DocumentErrorCode error;

	public DocumentFileException(String message) {
		super(message);
		this.error = DocumentErrorCode.DOCUMENT_ERROR;
	}

	public DocumentErrorCode getError() {
		return error;
	}

}
