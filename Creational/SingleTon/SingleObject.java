public class SingleObject {

    private static SingleObject instance = new SingleObject();
    private String message;

    private SingleObject(){}

    public static SingleObject getInstance() {
        return instance;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
