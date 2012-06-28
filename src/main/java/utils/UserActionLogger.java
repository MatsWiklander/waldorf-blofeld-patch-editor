package main.java.utils;

import org.apache.log4j.Logger;

public class UserActionLogger {
        public final static void logUserAction() {
                String className;
                String methodName;
                String message;

                Logger logger = Logger.getLogger("UserActionLogger");

                Exception dummyException = new Exception();

                StackTraceElement[] stackTrace;

                stackTrace = dummyException.getStackTrace();

                className = stackTrace[1].getClassName();
                methodName = stackTrace[1].getMethodName();

                message = "{";
                message += "\"className\":\"" + className + "\",";
                message += "\"methodName\":\"" + methodName + "\"";
                message += "}";

                logger.log(UserActionLevel.USERACTION, message);
        }
}
