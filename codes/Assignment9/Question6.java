public class Question6 {
    public static void main(String[] args) {
        int salary = 1000;
        try {
            if (salary < 10000)
                throw new PayOutOfBoundsException("Tor taka nei");
        } catch (PayOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}

class PayOutOfBoundsException extends Exception {
    PayOutOfBoundsException(String s) {
        super(s);
    }

    public String toString() {
        return String.format("TOR TAKA NEI in : Line %s, %s:%s%n", this.getStackTrace()[0].getLineNumber(),
                this.getStackTrace()[0].getClassName(), this.getStackTrace()[0].getMethodName());
    }
}