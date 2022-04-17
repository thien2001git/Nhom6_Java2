/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrueLove;

import java.util.ArrayList;

/**
 *
 * @author hxt
 */
public interface IQuanLy {
//    thêm 
    public void add();
//    sửa có thể return cái đối tượng đã sửa
    public void update(int index, Object obj);
//   hàm xóa: có thể return cái đối tượng đã xóa
    public void remove();
//    hàm tìm kiếm: có thể tìm kiếm theo 1 hoặc nhiều thuộc tính trong đối tượng
    public ArrayList<KhachHang> find();
}
