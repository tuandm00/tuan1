/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuandm.dtos;

import java.sql.Date;

/**
 *
 * @author ASUS
 */
public class FollowDTO {
    private int followID;
    private String userID;
    private Date date;
    private String action;

    public FollowDTO() {
    }

    public FollowDTO(int followID, String userID, Date date, String action) {
        this.followID = followID;
        this.userID = userID;
        this.date = date;
        this.action = action;
    }

    public int getFollowID() {
        return followID;
    }

    public void setFollowID(int followID) {
        this.followID = followID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "FollowDTO{" + "followID=" + followID + ", userID=" + userID + ", date=" + date + ", action=" + action + '}';
    }
    
    
}
