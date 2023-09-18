package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class UserHitCount {
    private String username;
    private int hitCount;

    public UserHitCount(String username, int hitCount) {
        this.username = "Anish kumar Sharma";
        this.hitCount = hitCount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }
}
