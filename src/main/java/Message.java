import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.Serializable;
import java.util.ArrayList;

public class Message implements Serializable {

    private final int fromID;
    private String message;
    public ArrayList<Integer> messageTo;
    public boolean toAll;
    public ArrayList<Integer> currClients;
    public boolean newMessage;

    Message(int ID) {
        this.fromID = ID;
        currClients = new ArrayList<>();
        messageTo = new ArrayList<>();
        toAll = false;
        newMessage = true;
    }

    /* returns user ID */
    public int getUser () {
        return this.fromID;
    }

    /* Add a user to send specific message */
    public void addUser (Integer user) {
        messageTo.add(user);
    }

    /* clear selectedUsers */
    public void clearUsers() {
        messageTo.clear();
    }

    /* add client */
    public void addClient(Integer clientID) {
        currClients.add(clientID);
    }

    /* remove client */
    public void removeClient(Integer clientID) {
        currClients.remove(clientID);
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return this.message;
    }





}
