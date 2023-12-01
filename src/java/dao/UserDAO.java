/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.User;

/**
 *
 * @author PC
 */
public class UserDAO extends DAO {
    public UserDAO(){
        super();
    }
    
    public boolean checkLogin(User u){
        boolean res = false;
        try {
            String querry = "EXEC [dbo].[CheckLogin] @username = ?, @password=?";
            PreparedStatement ps = con.prepareStatement(querry);
            ps.setString(1,u.getUsername());
            ps.setString(2,u.getPassword());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                u.setId(rs.getInt(1));
                u.setName(rs.getString(2));
                u.setEmail(rs.getString(3));
                u.setTel(rs.getString(4));
                u.setAddress(rs.getString(5));
                u.setRole(rs.getString(8));
                res = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            res = false;
        }
        return res;
    }
}
