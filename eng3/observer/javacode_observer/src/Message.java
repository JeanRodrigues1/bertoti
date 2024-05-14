public class Message implements Observer {

    public void update(String username, String followers){
        System.out.println("Sua conta " + username + "recebeu uma mensagem de " + followers);
    }
}