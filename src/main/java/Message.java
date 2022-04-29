import java.io.Serializable;
import java.util.ArrayList;

public class Message implements Serializable {

    private String message;
    private ArrayList<Integer> messageTo;
    private boolean toAll = false;
    private ArrayList<Integer> currClients;
    public int from;

    Message() {
        messageTo = new ArrayList<>();
    }

    /* Add a user to send specific message */
    public void addUser (Integer user) {
        messageTo.add(user);
    }
    /* clear selectedUsers */
    public void clearUsers() {
        messageTo.clear();
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return this.message;
    }


}
