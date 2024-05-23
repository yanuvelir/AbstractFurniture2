public class Client {

    private String name;
    public Client(String n){
        this.name = n;
    }

    public void buy(Furniture f){
        System.out.println("Client " + name + " bought furniture! ("+ f.getClass().getName() +")");
    }
}
