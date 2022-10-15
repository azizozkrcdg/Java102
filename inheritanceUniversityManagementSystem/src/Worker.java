public class Worker {
    private String nameSurname;
    private String mpNo;
    private String eposta;

    public Worker(String nameSurname, String mpNo, String eposta) {
        this.nameSurname = nameSurname;
        this.mpNo = mpNo;
        this.eposta = eposta;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getMpNo() {
        return mpNo;
    }

    public void setMpNo(String mpNo) {
        this.mpNo = mpNo;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public void login() {
        System.out.println(this.getNameSurname() + " üniversiteye giriş yaptı !");
    }

    public void exit() {
        System.out.println(this.getNameSurname() + " üniversiteden çıkış yaptı !");
    }

    public void diningHall() {
        System.out.println(this.getNameSurname() + " yemekhaneye girdi !");
    }


}
