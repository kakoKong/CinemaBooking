public class CC {
    private String cinemaname;
    private int cinemaCap;
    private int cinemaID = 0;

    public CC(String cinemaname, int cinemaCap){
        this.cinemaname = cinemaname;
        this.cinemaCap = cinemaCap;
        cinemaID++;
    }

    public int getcap(){
        return cinemaCap;
    }
    public String getName(){
        return cinemaname;
    }
    public int getID(){
        return cinemaID;
    }
}