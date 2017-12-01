import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by KellyR on 30/11/2017.
 */
@Entity
public class UserDetails {

    @Id
    private int userId;
    private String userName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



}
