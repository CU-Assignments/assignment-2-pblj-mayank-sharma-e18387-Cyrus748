class EasyLevel {
    private int id;
    private String name;
    private double price;
    
    public EasyLevel(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public void displayProduct() {
        System.out.println("Product Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
    
    public static void main(String[] args) {
        EasyLevel p = new EasyLevel(101, "Laptop", 75000);
        p.displayProduct();
    }
}
