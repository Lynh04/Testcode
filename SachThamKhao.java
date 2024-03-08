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
public class SachThamKhao extends Sach{
     private double Thue;

    public SachThamKhao() {
    }

    public SachThamKhao(double Thue, String maSach, String nhaXuatban, double donGia, double soLuong, Date ngayNhap) {
        super(maSach, nhaXuatban, donGia, soLuong, ngayNhap);
        this.Thue = Thue;
    }

    public double getThue() {
        return Thue;
    }

    public void setThue(double Thue) {
        this.Thue = Thue;
    }


    @Override
    public double tinhthanhtien() {
        return (soluong*dongia) + this.Thue - tiengiam();
    }

    @Override
    public double tiengiam() {
       return (soluong*dongia) + this.Thue - tiengiam();
    }
}
