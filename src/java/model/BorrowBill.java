/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author PC
 */
public class BorrowBill {
    private int id;
    private Date dateBorrow;
    private Cashier cas;
    private Customer cus;
    private int totalDeposit;
    private int totalStory;
    private ArrayList<BorrowingStory> listBorrowingStorys;
}
