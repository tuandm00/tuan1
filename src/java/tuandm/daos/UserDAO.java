/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuandm.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import tuandm.dtos.ProductDTO;
import tuandm.dtos.UserDTO;
import tuandm.utils.Utils;

/**
 *
 * @author ASUS
 */
public class UserDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public UserDTO checkLogin(String userID, String password) {
        UserDTO result = null;

        try {
            String sql = "SELECT [Fullname]\n"
                    + "      ,[Role]\n"
                    + "  FROM [dbo].[User]"
                    + " WHERE [UserID] = ? AND [Password] = ?";

            conn = new Utils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, userID);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                String fullname = rs.getString("Fullname");
                String role = rs.getString("Role");
                result = new UserDTO(userID, fullname, "", "", "", "", role);
            }
        } catch (Exception e) {

        }
        return result;
    }

    public UserDTO loginGooogle(String userID) {
        UserDTO result = null;

        try {
            String sql = "SELECT [Fullname]\n"
                    + "      ,[Role]\n"
                    + "  FROM [dbo].[User]"
                    + " WHERE [UserID] = ?";

            conn = new Utils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, userID);
            rs = ps.executeQuery();
            if (rs.next()) {
                String fullname = rs.getString("Fullname");
                String role = rs.getString("Role");
                result = new UserDTO(userID, fullname, "", "", "", "", role);
            }
        } catch (Exception e) {

        }
        return result;
    }

    public boolean createGoogle(UserDTO dto) {
        try {
            String sql = "INSERT INTO [dbo].[User]\n"
                    + "           ([UserID]\n"
                    + "           ,[Fullname]\n"
                    + "           ,[Email]\n"
                    + "           ,[Role])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?)";
            conn = new Utils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, dto.getUserID());
            ps.setString(2, dto.getFullname());
            ps.setString(3, dto.getEmail());
            ps.setString(4, dto.getRole());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
        }
        return false;
    }
}
