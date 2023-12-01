
import dao.UserDAO;
import model.User;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        User u = new User();
        u.setUsername("abc");
        u.setPassword("123");
        UserDAO ud = new UserDAO();
        //System.out.println(u.username);
        System.out.println(ud.checkLogin(u));
        System.out.println(u.getRole());
    }
}
