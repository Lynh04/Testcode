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
public class SachGiaoKhoa extends Sach{
     private String tinhTrang;

    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa(String tinhTrang, String maSach, String nhaXuatban, double donGia, double soLuong, Date ngayNhap) {
        super(maSach, nhaXuatban, donGia, soLuong, ngayNhap);
        this.tinhTrang = tinhTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    

   

    @Override
    public double tinhthanhtien() {
        return soluong*dongia - tiengiam();
    }
    

    @Override
    public double tiengiam() {
         if (tinhTrang.equalsIgnoreCase("mới")){
            return soluong*dongia*0.1;
        }
        else {
            return soluong*dongia*0.5;
        }
    }
}
