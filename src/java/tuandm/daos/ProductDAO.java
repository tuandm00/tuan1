/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuandm.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import tuandm.dtos.ProductDTO;
import tuandm.utils.Utils;

/**
 *
 * @author ASUS
 */
public class ProductDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<ProductDTO> getAll(int pageIndex, int pageSize) {
        try {
            String sql = "SELECT [ProductID]\n"
                    + "      ,[ProductName]\n"
                    + "      ,[Price]\n"
                    + "      ,[Description]\n"
                    + "      ,[Image]\n"
                    + "      ,[Quantity]\n"
                    + "      ,[Create_Date]\n"
                    + "      ,[Status]\n"
                    + "  FROM [dbo].[Product] Where [Status] = 1 ORDER BY [ProductID] OFFSET (?*?-?) ROWS FETCH NEXT ? ROWS ONLY";
            conn = new Utils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, pageIndex);
            ps.setInt(2, pageSize);
            ps.setInt(3, pageSize);
            ps.setInt(4, pageSize);
            rs = ps.executeQuery();
            List<ProductDTO> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new ProductDTO(rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getDate(7),
                        rs.getBoolean(8)));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public int countPage(int pageSize) {
        try {
            String query = "select Count(*) from [dbo].[Product]";

            conn = new Utils().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            int count = 0;
            if (rs.next()) {
                count = rs.getInt(1);
            }
            int numOfPage = count / pageSize;
            if (count % pageSize != 0) {
                numOfPage++;
            }
            return numOfPage;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return 0;
    }

    public List<ProductDTO> searchProductByName(String search) {
        try {
            String sql = "SELECT [ProductID]\n"
                    + "      ,[ProductName]\n"
                    + "      ,[Price]\n"
                    + "      ,[Description]\n"
                    + "      ,[Image]\n"
                    + "      ,[Quantity]\n"
                    + "      ,[Create_Date]\n"
                    + "      ,[Status]\n"
                    + "  FROM [dbo].[Product]"
                    + "  WHERE [Status] = 1 AND [ProductName] LIKE ?";
            conn = new Utils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + search + "%");
            rs = ps.executeQuery();

            List<ProductDTO> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new ProductDTO(rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getDate(7),
                        rs.getBoolean(8)));
            }
            return list;

        } catch (Exception e) {
        }
        return null;
    }

    public boolean add(ProductDTO dto) {
        try {
            String sql = "INSERT INTO [dbo].[Product]\n"
                    + "           ([ProductName]\n"
                    + "           ,[Price]\n"
                    + "           ,[Description]\n"
                    + "           ,[Image]\n"
                    + "           ,[Quantity]\n"
                    + "           ,[Status])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?,?)";
            conn = new Utils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, dto.getProductName());
            ps.setDouble(2, dto.getPrice());
            ps.setString(3, dto.getDescription());
            ps.setString(4, dto.getImage());
            ps.setInt(5, dto.getQuantity());
            ps.setBoolean(6, dto.isStatus());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    public boolean delete(String productID) {
        try {
            String sql = "UPDATE [dbo].[Product]\n"
                    + "      SET [Status] = 0"
                    + "      WHERE [ProductID] = ? ";
            conn = new Utils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, productID);
            ps.executeUpdate();

            return true;
        } catch (Exception e) {
        }
        return false;
    }

    public boolean update(ProductDTO dto) {
        try {
            String sql = "UPDATE [dbo].[Product]\n"
                    + "   SET [ProductName] = ?\n"
                    + "      ,[Price] = ?\n"
                    + "      ,[Description] = ?\n"
                    + "      ,[Image] = ?\n"
                    + "      ,[Quantity] = ?\n"
                    + "      ,[Status] = ?\n"
                    + " WHERE [ProductID] = ?";
            conn = new Utils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, dto.getProductName());
            ps.setDouble(2, dto.getPrice());
            ps.setString(3, dto.getDescription());
            ps.setString(4, dto.getImage());
            ps.setInt(5, dto.getQuantity());
            ps.setBoolean(6, dto.isStatus());
            ps.setInt(7, dto.getProductID());
            ps.executeUpdate();
            return true;

        } catch (Exception e) {
        }
        return false;
    }

    public ProductDTO getProductByID(int productid) {
        try {
            String sql = "SELECT [ProductID]\n"
                    + "      ,[ProductName]\n"
                    + "      ,[Price]\n"
                    + "      ,[Description]\n"
                    + "      ,[Image]\n"
                    + "      ,[Quantity]\n"
                    + "      ,[Create_Date]\n"
                    + "      ,[Status]\n"
                    + "  FROM [dbo].[Product]"
                    + "  WHERE [ProductID] = ?";
            conn = new Utils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, productid);
            rs = ps.executeQuery();
            if (rs.next()) {
                ProductDTO dto = new ProductDTO(rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getDate(7),
                        rs.getBoolean(8));

                return dto;
            }
        } catch (Exception e) {
        }
        return null;
    }
}
