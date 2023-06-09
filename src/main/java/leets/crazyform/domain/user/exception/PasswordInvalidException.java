package leets.crazyform.domain.user.exception;

import leets.crazyform.global.error.ErrorCode;
import leets.crazyform.global.error.exception.ServiceException;

public class PasswordInvalidException extends ServiceException {
    public PasswordInvalidException() {
        super(ErrorCode.USER_NOT_FOUND);
    }
}
