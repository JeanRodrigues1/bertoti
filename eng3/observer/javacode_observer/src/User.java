import java.util.ArrayList;
import java.util.List;

public class User {
    private List<Observer> observers;
    private String username;
    private String followers;

    public User(){
        this.observers = new ArrayList<>();
        this.username = "";
        this.followers = "";
    }

    public void setUser(String username, String followers){
        this.username = username;
        this.followers = followers;
        notify(username, followers);
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }


    public void notify(String username, String followers){
        this.observers.stream().forEach(item -> {
            item.update(username, followers) ;
        });
    }

}

