/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycode;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class DSSach {
     ArrayList<Sach> list;

    public ArrayList<Sach> getList() {
        return list;
    }

    public void setList(ArrayList<Sach> list) {
        this.list = list;
    }

    public DSSach() {
        list = new ArrayList<Sach>();
    }

    public void themMoi(Sach sa) {
        list.add(sa);
    }

    public Sach Tim(String maSach) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).masach.equalsIgnoreCase(maSach)) {
                return list.get(i);
            }
        }
        return null;
    }

    public void Xoa(String maSach) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).masach.equalsIgnoreCase(maSach)) {
                list.remove(i);
                break;

            }
        }
    }

    public void capNhat(Sach sa) {
        for (int i = 0; i < list.size(); i++) {
            if (sa.getMasach().trim().equalsIgnoreCase(list.get(i).masach)) {
                list.set(i, sa);
            }
        }
    }
       
    

    public double tongTienSGK() {
        double sumSGK = 0;
        for (Sach sach : list) {
            if (sach instanceof SachGiaoKhoa) {
                SachGiaoKhoa sgk = (SachGiaoKhoa) sach;
                sumSGK += sgk.tinhthanhtien();
            }
        }
        return sumSGK;
    }

    public double tongTienSachThamKhao() {
        double sumSTK = 0;
        for (Sach sach : list) {
            if (sach instanceof SachThamKhao) {
                SachThamKhao stk = (SachThamKhao) sach;
                sumSTK += stk.tinhthanhtien();
            }
        }
        return sumSTK;
    }

}
