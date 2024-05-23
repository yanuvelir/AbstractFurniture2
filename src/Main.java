public class Main {
    public static void main(String[] args) {

        Client client = new Client("Mike");
        Furniture furniture = new Furniture();
        client.buy(furniture);
    }
}