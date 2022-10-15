public class Main {
    public static void main(String[] args) {
        Academician a1 = new Academician("Muhammed Aziz Özkaracadağ", "0539815151", "azizozkaracadagg@gmail.com", "CENG", "Doç.");
        a1.login();
        a1.attendClass();
        Officer o1 = new Officer("Osman Özkaracadağ", "05383383838", "osmanozk@gmail.com", "kitchen", "chef");
        o1.login();
        o1.work();
        o1.diningHall();
        Lecturer l1 = new Lecturer("İbrahim Özkaracadağ", "05355353535", "ibrahimozk@gmail.com", "Math", "Dr.", 2);
        System.out.println(l1.getNameSurname() + " kapı numarası : " + l1.getDoorNumber());
        Assistant as1 = new Assistant("Ferhat Yakar", "05323323232", "fyakar@gmail.com", "ENG", "Assistant", "08.00 - 17.00");
        System.out.println(as1.getNameSurname() + " çalışma saatleri : " + as1.getOfficeClock());
        Computing c1 = new Computing("Yunus Alphan", "05365363636", "ynsalphn@gmail.com", "computing", "officer", "network");
        System.out.println(c1.getNameSurname() + " görevi : " + c1.getTask());
        SecurityOfficer so1 = new SecurityOfficer("Onur Avci", "05343343434", "onuravcj@gmail.com", "security", "officer", "security");
        so1.bout();
        LabAssistant la1 = new LabAssistant("Sidar Özkaracadağ", "05343356236", "sdrozk@gmail.com", "FZK", "Assistant", "08.00 - 17.00");
        la1.labEnter();
    }
}
