public class SimpleClass {
    private String email;
    private Status sendStatus;

    public SimpleClass(String email, Status sendStatus) {
        this.email = email;
        this.sendStatus = sendStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Status getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Status sendStatus) {
        this.sendStatus = sendStatus;
    }

    @Override
    public String toString() {
        return "SimpleClass{" +
                "email='" + email + '\'' +
                ", sendStatus=" + sendStatus +
                '}';
    }
}
