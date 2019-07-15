#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

/**
 * 自定义异常类
 *
 * @author yulezhisi
 **/

public class ${NAME}Exception extends Exception{
    public ${NAME}Exception() {
        super();
    }
    
    public ${NAME}Exception(String message) {
        super(message);
    }
    
    public ${NAME}Exception(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ${NAME}Exception(Throwable cause) {
        super(cause);
    }
    
    protected ${NAME}Exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
