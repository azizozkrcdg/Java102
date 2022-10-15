public class Lecturer extends Academician{
    private int doorNumber;

    public Lecturer(String nameSurname, String mpNo, String eposta, String episode, String degree, int doorNumber){
        super(nameSurname, mpNo, eposta, episode, degree);
        this.doorNumber = doorNumber;
    }

    public int getDoorNumber(){
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber){
        this.doorNumber = doorNumber;
    }

    public void meeting(){
        System.out.println(this.getNameSurname() + " toplantıya katıldı !");
    }

    public void takeTest(){
        System.out.println(this.getNameSurname() + " sınav yaptı !");
    }
}
