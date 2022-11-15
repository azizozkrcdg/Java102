import java.util.ArrayList;

public class Notebook extends PatikaStore {

    public Notebook(int id, String name, int price, String brand, int storage, String  screen, int ram){
        super(id, name, price, brand, storage, screen, ram);

    }
    public Notebook(){}

    public void notebookList(){
        ArrayList<Notebook> notebook = new ArrayList<>();
        notebook.add(new Notebook(1, "Huawei Matebook 14", 17000, "Huawei",
                1020, "14.0", 16));
        notebook.add(new Notebook(2, "Lenovo V14 IGL    ", 9600, "Lenovo",
                512, "14.0", 8));
        notebook.add(new Notebook(3, "Asus Tuf Gameing  ", 21000, "Asus",
                2048, "15.6", 32));

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("| %-3s | %-20s | %-9s | %-12s | %-9s | %-8s | %-7s |", "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM");
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------");

        for (Notebook notebooks : notebook){
            System.out.printf("| %-3d | %-20s | %-9d | %-12s | %-9d | %-8s | %-7d |",
                    notebooks.getId(), notebooks.getName(), notebooks.getPrice(), notebooks.getBrand(),
                    notebooks.getStorage(), notebooks.getScreen(), notebooks.getRam());
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println("0 - Geri git");
        System.out.print("Seçiminiz : ");
        int select = input.nextInt();
        switch (select){
            case 0:
                storeMenu();
                break;
            default:
                System.out.println("Lütfen geçerli bir seçim yapınız !");
                notebookList();
                break;
        }
    }


}
