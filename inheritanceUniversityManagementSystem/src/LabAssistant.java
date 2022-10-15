public class LabAssistant extends Assistant {
    public LabAssistant(String nameSurname, String mpNo, String eposta, String episode, String degree, String officeClock) {
        super(nameSurname, mpNo, eposta, episode, degree, officeClock);
    }

    public void labEnter(){
        System.out.println(getNameSurname() + " laboratuvara girdi !");
    }
}
