import java.util.Scanner;
import java.util.TreeSet;

public class PatikaStore {
    private int id;
    private String name;
    private int price;
    private String brand;
    private int storage;
    private String screen;
    private int ram;

    public PatikaStore(int id, String name, int price, String brand, int storage, String screen,int ram){
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
        this.setBrand(brand);
        this.setStorage(storage);
        this.screen = screen;
        this.setRam(ram);
    }

    public PatikaStore(){}

    Scanner input = new Scanner(System.in);
    public void brandPrint(){
        TreeSet<String> brands = new TreeSet<>();
        brands.add("Samsung");
        brands.add("Lenovo");
        brands.add("Apple");
        brands.add("Huawei");
        brands.add("Casper");
        brands.add("Asus");
        brands.add("HP");
        brands.add("Xiaomi");
        brands.add("Monster");

        System.out.println("MARKALARIMIZ");
        System.out.println("------------");

        for (String brand: brands){
            System.out.println(" - " + brand);
        }

        System.out.println("------------");
        System.out.println("0 - Geri git");
        System.out.print("Seçiminiz : ");
        int select = input.nextInt();
        switch (select){
            case 0:
                storeMenu();
                break;
            default:
                System.out.println("Lütfen geçerli bir seçim yapınız !");
                brandPrint();
                break;
        }

    }

    public void storeMenu(){
        System.out.println(" --- Ana Menü --- ");
        System.out.println(
                        "1 - Notebook İşlemleri \n" +
                        "2 - Cep Telefonu İşlemleri \n" +
                        "3 - Marka Listele \n"+
                        "0 - Çıkış Yap");
        System.out.println("-------------------------");
        System.out.print("Seçiminiz : ");
        int select = input.nextInt();
        switch (select){
            case 1:
                Notebook notebook = new Notebook();
                notebook.notebookList();
                break;
            case 2:
                MobilePhone mobilePhone = new MobilePhone();
                mobilePhone.mobilePhoneList();
                break;
            case 3:
                brandPrint();
                break;
            case 0:
                System.out.println("Bye bye :)");
                System.exit(0);
                break;
            default:
                System.out.println("Lütfen geçerli bir seçim yapınız !");
                storeMenu();
                break;
        }
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getScreen(){
        return screen;
    }

    public void setScreen(String screen){
        this.screen = screen;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
