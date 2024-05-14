public class LikePhoto implements Observer {

    public void update(String username, String followers){
        System.out.println("Sua conta " + username + "foi seguida por: " + followers);
    }
}
