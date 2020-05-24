/**
 * user
 */
public class CU {

    private String username;
    private int userID = 0;

    public CU(String username){
        this.username = username;
        userID++;
    }

    public int getID(){
        return userID;
    }
    public String getName(){
        return username;
    }


}