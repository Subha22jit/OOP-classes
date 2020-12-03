public class Question7 {
    public static void main(String[] args) {
        TesterClass tc = new TesterClass();
        try {
            tc.f();
        } catch (SecondException e) {
            System.out.println(e);
        }
    }
}

class TesterClass {
    void f() throws SecondException {
        try {
            this.g();
        } catch (FirstException e) {
            System.out.println(e);
            throw new SecondException("Second");
        }
    }

    void g() throws FirstException {
        throw new FirstException("FIRST");
    }
}

class FirstException extends Exception {
    FirstException(String s) {
        super(s);
    }

    public String toString() {
        return String.format("PROTHOM EXCEPTION in : Line %s, %s:%s%n", this.getStackTrace()[0].getLineNumber(),
                this.getStackTrace()[0].getClassName(), this.getStackTrace()[0].getMethodName());
    }
}

class SecondException extends Exception {
    SecondException(String s) {
        super(s);
    }

    public String toString() {
        return String.format("DWITIO EXCEPTION in : Line %s, %s:%s%n", this.getStackTrace()[0].getLineNumber(),
                this.getStackTrace()[0].getClassName(), this.getStackTrace()[0].getMethodName());
    }
}