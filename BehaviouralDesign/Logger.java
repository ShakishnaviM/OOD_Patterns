
    public abstract class Logger {
        public static int INFO = 1;
        public static int DEBUG = 2;
        public static int ERROR = 3;

        protected int level;
        protected Logger nextLogger;

        public void setNextLogger(Logger nextLogger) {
            this.nextLogger = nextLogger;
        }

        public void logMessage(int level, String message) {
            if (this.level <= level) {
                write(message);
            }
            if (nextLogger != null) {
                nextLogger.logMessage(level, message);
            }
        }

        abstract protected void write(String message);
    }

    class ConsoleLogger extends Logger {
        public ConsoleLogger(int level) {
            this.level = level;
        }

        @Override
        protected void write(String message) {
            System.out.println("Standard Console::Logger: " + message);
        }
    }

    class ErrorLogger extends Logger {
        public ErrorLogger(int level) {
            this.level = level;
        }

        @Override
        protected void write(String message) {
            System.out.println("Error Console::Logger: " + message);
        }
    }

    

