public class CC {
    //name of the cinema
    private String cinemaname;
    //total capacity
    private int cinemaCap;
    //available space
    private int bookingid;

    public CC(String cinemaname, int cinemaCap){
        this.cinemaname = cinemaname;
        this.cinemaCap = cinemaCap;
    }

    public int getcap(){
        return cinemaCap;
    }
    public String getName(){
        return cinemaname;
    }

}