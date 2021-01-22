/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuandm.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import tuandm.dtos.FollowDTO;
import tuandm.dtos.ProductDTO;
import tuandm.utils.Utils;

/**
 *
 * @author ASUS
 */
public class FollowDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public boolean addFollow(String userid , String action) {
        try {
            String sql = "INSERT INTO [dbo].[Follow]\n"
                    + "           ([UserID]\n"
                    + "           ,[Action])\n"
                    + "     VALUES\n"
                    + "           (?,?)";
            conn = new Utils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1,userid);
            ps.setString(2, action);
            ps.executeUpdate();

            return true;
        } catch (Exception e) {
        }
        return false;
    }
    
    
}
