/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycode;

import java.util.Date;

/**
 *
 * @author HP
 */
public abstract class Sach implements ISach{
    protected String masach;
    protected String nhaxuatban;
    protected double dongia;
    protected double soluong;
    
    private Date ngaynhap;

    public Sach(String masach, String nhaxuatban, double dongia, double soluong, Date ngaynhap) {
        this.masach = masach;
        this.nhaxuatban = nhaxuatban;
        this.dongia = dongia;
        this.soluong = soluong;
        this.ngaynhap = ngaynhap;
    }

    public Sach() {
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getNhaxuatban() {
        return nhaxuatban;
    }

    public void setNhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getSoluong() {
        return soluong;
    }

    public void setSoluong(double soluong) {
        this.soluong = soluong;
    }

    public Date getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(Date ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public abstract double tinhthanhtien();
    
    public abstract double tiengiam();
        
}
