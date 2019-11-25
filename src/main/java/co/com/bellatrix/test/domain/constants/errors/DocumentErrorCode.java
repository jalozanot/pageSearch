package co.com.bellatrix.test.domain.constants.errors;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public enum DocumentErrorCode {

	DOCUMENT_ERROR("Error in  document", ErrorCodes.NOTIFICATIONSOURCE),
	
	FILE_NOT_SUPPORT_ERROR("file no support", ErrorCodes.NOTIFICATIONSOURCE);
	
	private DocumentErrorCode(final String errorMessage, final String apiCode) {
		this.errorMessage = errorMessage;
		this.apiCode = apiCode;
	}
	
	private String errorMessage;

	private String apiCode;
	
}
