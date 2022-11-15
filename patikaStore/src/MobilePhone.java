import java.util.ArrayList;

public class MobilePhone extends PatikaStore{
    private int camera;
    private int battery;
    private String color;

    public MobilePhone(int id, String name, int price, String brand, int storage, String screen, int camera, int battery, int ram, String color){
        super(id, name, price, brand, storage, screen, ram);
        this.setCamera(camera);
        this.setBattery(battery);
        this.setColor(color);
    }
    public MobilePhone(){}

    public void mobilePhoneList(){
        ArrayList<MobilePhone> mobilePhones = new ArrayList<>();
        mobilePhones.add(new MobilePhone(1, "Samsung Galaxy A51", 5200, "Samsung", 64, "6.5",
                32, 3200, 6, "Siyah"));
        mobilePhones.add(new MobilePhone(2, "İphone 11", 10200, "Apple", 64, "6.1",
                16, 4200, 6, "Mavi"));
        mobilePhones.add(new MobilePhone(3, "Redmi Note 10 pro", 7300, "Xiaomi", 128, "6.5",
                64, 4000, 12, "Beyaz"));

        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %s | %-19s | %-9s | %-12s | %-9s | %-8s | %-8s | %-8s | %-7s | %-8s |", "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "Kamera", "Batarya", "RAM", "Renk");
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");

        for (MobilePhone phone : mobilePhones){
            System.out.printf("| %d | %-19s | %-9d | %-12s | %-9d | %-8s | %-8d | %-8d | %-7d | %-8s |",
                    phone.getId(), phone.getName(), phone.getPrice(), phone.getBrand(),
                    phone.getStorage(), phone.getScreen(), phone.getCamera(), phone.getBattery(), phone.getRam(), phone.getColor());
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");

        System.out.println("0 - Geri git");
        System.out.print("Seçiminiz : ");
        int select = input.nextInt();
        switch (select){
            case 0:
                storeMenu();
                break;
            default:
                System.out.println("Lütfen geçerli bir seçim yapınız !");
                mobilePhoneList();
                break;
        }

    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
