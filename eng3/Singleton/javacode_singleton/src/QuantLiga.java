public class QuantLiga{
    private static QuantLiga instance;
    private int count;

    private QuantLiga() {
        this.count = 0;
    }

    public static QuantLiga getInstance() {
        if (instance == null) {
            instance = new QuantLiga();
        }
        return instance;
    }

    public void incrementCount() {
        this.count++;
    }

    public int getCount() {
        return count;
    }
}
