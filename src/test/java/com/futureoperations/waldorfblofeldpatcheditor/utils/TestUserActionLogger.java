package test.java.com.futureoperations.waldorfblofeldpatcheditor.utils;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.UserActionLogger;

import org.junit.Test;

public class TestUserActionLogger {

        private void dummyMethod() {
                UserActionLogger.logUserAction();
        }

        @Test
        public void testUserActionLogger() {
                UserActionLogger userActionLogger = new UserActionLogger();

                userActionLogger.getClass();

                dummyMethod();
        }
}
