package application.Controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import application.Models.TuyenDung;

public  class ListTuyenDung implements Serializable{
	
	List<TuyenDung> list = new ArrayList<TuyenDung>();
	
	
	public boolean ThemTD(TuyenDung ns) {
		try {
            if (list.contains(ns)) {
                return false;
            } else {
                list.add(ns);
            }
            return true;
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }
	}
	
	public void Sua(String mans, TuyenDung newns) {
		TuyenDung ns = new TuyenDung(mans);
		list.set(list.indexOf(ns), newns);
	}
	
	public void xoa(TuyenDung ns) {
		int index = list.indexOf(ns);
        list.remove(index);
    }
	
	public TuyenDung getTuyenDung(int index) {
		return list.get(index);
	}
	
	public int getSize() {
		return list.size();
	}
	
	public void them() {
		list.add(new TuyenDung("D0001", "Dang Van A", "nam", "01/01/1969", "0987654321", "DVA@gmail.com", "Ha Noi", "Dai Hoc", "Cong Nghiep", "Ky Thuat Phan Mem", "Gioi", "Nhan vien"));
		list.add(new TuyenDung("D0002", "Dang Van A", "nam", "01/01/1969", "0987654321", "DVA@gmail.com", "Ha Noi", "Dai Hoc", "Cong Nghiep", "Ky Thuat Phan Mem", "Gioi", "Nhan vien"));
		list.add(new TuyenDung("D0003", "Dang Van A", "nam", "01/01/1969", "0987654321", "DVA@gmail.com", "Ha Noi", "Dai Hoc", "Cong Nghiep", "Ky Thuat Phan Mem", "Gioi", "Nhan vien"));
		list.add(new TuyenDung("D0004", "Dang Van A", "nam", "01/01/1969", "0987654321", "DVA@gmail.com", "Ha Noi", "Dai Hoc", "Cong Nghiep", "Ky Thuat Phan Mem", "Gioi", "Nhan vien"));
		list.add(new TuyenDung("D0005", "Dang Van A", "nam", "01/01/1969", "0987654321", "DVA@gmail.com", "Ha Noi", "Dai Hoc", "Cong Nghiep", "Ky Thuat Phan Mem", "Gioi", "Nhan vien"));
		list.add(new TuyenDung("D0006", "Dang Van A", "nam", "01/01/1969", "0987654321", "DVA@gmail.com", "Ha Noi", "Dai Hoc", "Cong Nghiep", "Ky Thuat Phan Mem", "Gioi", "Nhan vien"));
		list.add(new TuyenDung("D0007", "Dang Van A", "nam", "01/01/1969", "0987654321", "DVA@gmail.com", "Ha Noi", "Dai Hoc", "Cong Nghiep", "Ky Thuat Phan Mem", "Gioi", "Nhan vien"));
		list.add(new TuyenDung("D0008", "Dang Van A", "nam", "01/01/1969", "0987654321", "DVA@gmail.com", "Ha Noi", "Dai Hoc", "Cong Nghiep", "Ky Thuat Phan Mem", "Gioi", "Nhan vien"));
		list.add(new TuyenDung("D0009", "Dang Van A", "nam", "01/01/1969", "0987654321", "DVA@gmail.com", "Ha Noi", "Dai Hoc", "Cong Nghiep", "Ky Thuat Phan Mem", "Gioi", "Nhan vien"));
		list.add(new TuyenDung("D0010", "Dang Van A", "nam", "01/01/1969", "0987654321", "DVA@gmail.com", "Ha Noi", "Dai Hoc", "Cong Nghiep", "Ky Thuat Phan Mem", "Gioi", "Nhan vien"));

	}
}
