

public class Strategy {
    public static void main(String args[]) {
        Vampiro kill = new Vampiro();
        kill.setEliminacao(new Sunlight());
        kill.getEliminacao();
        System.out.println("---------------");
        kill.setEliminacao(new HolyWeapons());  // Change 'New' to 'new'
        kill.getEliminacao();  // Add parentheses to getPower()
    }
}

// fim
