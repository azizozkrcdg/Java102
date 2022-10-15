public class Academician extends Worker {
    private String episode;
    private String degree;

    public Academician(String nameSurname, String mpNo, String eposta, String episode, String degree) {
        super(nameSurname, mpNo, eposta);
        this.episode = episode;
        this.degree = degree;
    }

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void attendClass() {
        System.out.println(this.getNameSurname() + " derse girdi !");
    }

}
