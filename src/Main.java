public class Main {
    public static void main(String[] args) {

        Client client = new Client("Mike");
        Furniture furniture = new Chair(TypeOfAssembling.GLUED);
        client.buy(furniture);
        System.out.println(TypeOfAssembling.GLUED);
    }
}