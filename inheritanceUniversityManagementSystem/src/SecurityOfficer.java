public class SecurityOfficer extends Officer{
    private String document;

    public SecurityOfficer(String nameSurname, String mpNo, String eposta, String department, String shift, String document){
       super(nameSurname, mpNo, eposta, department, shift);
       this.document = document;
    }

    public String getDocument(){
        return document;
    }

    public void setDocument(String document){
        this.document = document;
    }

    public void bout(){
        System.out.println(getNameSurname() + " nöbet başında !");
    }
}
