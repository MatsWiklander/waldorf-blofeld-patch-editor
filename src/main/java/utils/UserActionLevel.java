package main.java.utils;

import org.apache.log4j.Level;

/**
 * {@link org.apache.log4j.Level} för loggning av användarens handlingar.
 * 
 * @author Mats Wiklander
 * 
 */
public class UserActionLevel extends Level {
        /**
         * 
         */
        private static final long serialVersionUID = 3085754575230468728L;

        /**
         * Värdet på min nivå. Värdet är större än
         * {@link org.apache.log4j.Priority#FATAL_INT}
         */
        public static final int USERACTION_INT = FATAL_INT + 10001;

        /**
         * {@link Level} representerar min lognivå. Den magiska sjuan
         * representerar syslogs loggningsnivå.
         */
        public static final Level USERACTION = new UserActionLevel(
                        USERACTION_INT, "USERACTION", 7);

        /**
         * Kontrollera om val är {@link UserActionLevel#USERACTION_INT}. Om Ja
         * returnera {@link UserActionLevel#USERACTION}, annars anropa
         * {@link UserActionLevel#toLevel(int, Level)} och skicka
         * {@link Level#DEBUG} som standardnivå.
         * 
         * @see Level#toLevel(int)
         * @see Level#toLevel(int, org.apache.log4j.Level)
         * 
         */
        public static Level toLevel(int val) {
                if (val == USERACTION_INT) {
                        return USERACTION;
                }
                return toLevel(val, Level.DEBUG);
        }

        /**
         * Kontrollera om val är {@link UserActionLevel#USERACTION_INT}. Om Ja
         * returnera {@link UserActionLevel#USERACTION}, annars anropa
         * {@link Level#toLevel(int, org.apache.log4j.Level)}
         * 
         * @see Level#toLevel(int, org.apache.log4j.Level)
         */
        public static Level toLevel(int val, Level defaultLevel) {
                if (val == USERACTION_INT) {
                        return USERACTION;
                }
                return Level.toLevel(val, defaultLevel);
        }

        /**
         * Kontrollerar om sArg är "USERACTION" nivå. Om Ja returnera
         * {@link UserActionLevel#USERACTION}, annars anropa
         * {@link UserActionLevel#toLevel(String, Level)} och skicka
         * {@link Level#DEBUG} som standardnivå.
         * 
         * @see Level#toLevel(java.lang.String)
         * @see Level#toLevel(java.lang.String, org.apache.log4j.Level)
         * 
         */
        public static Level toLevel(String sArg) {
                if (sArg != null && sArg.toUpperCase().equals("USERACTION")) {
                        return USERACTION;
                }
                return toLevel(sArg, Level.DEBUG);
        }

        /**
         * Kontroller om sArg är "USERACTION" nivå. Om Ja returnera
         * {@link UserActionLevel#USERACTION}, annars anropa
         * {@link Level#toLevel(java.lang.String, org.apache.log4j.Level)}
         * 
         * @see Level#toLevel(java.lang.String, org.apache.log4j.Level)
         */
        public static Level toLevel(String sArg, Level defaultLevel) {
                if (sArg != null && sArg.toUpperCase().equals("USERACTION")) {
                        return USERACTION;
                }
                return Level.toLevel(sArg, defaultLevel);
        }

        /**
         * Konstruerare
         * 
         * @param arg0
         * @param arg1
         * @param arg2
         */
        protected UserActionLevel(int arg0, String arg1, int arg2) {
                super(arg0, arg1, arg2);

        }
}
