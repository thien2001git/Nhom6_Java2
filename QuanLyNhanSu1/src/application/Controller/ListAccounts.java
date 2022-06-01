/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.Controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import application.Models.Account;

public class ListAccounts implements Serializable{
	
	List<Account> list = new ArrayList<Account>();
	
	public boolean ThemTK(Account acc) {
        try {
            if (list.contains(acc)) {
                return false;
            } else {
                list.add(acc);
            }
            return true;
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }
    }
	
	public void xoa(Account account) {
		int index = list.indexOf(account);
        list.remove(index);
    }
	
	public int CheckAcc(String username, String password) {
		int count = -1;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getUsername().equals(username) && 
                                list.get(i).getPassword().equals(password)) {
				count = i;
				break;
			}
		}
		return count;
	}
	
	public int getSize() {
		return list.size();
	}
	
	public Account getAccount(int index) {
		return list.get(index);
	}
	
	public boolean IsExist(Account acc) {
            if(list.contains(acc))
                return true;
            return false;
	}
        
        public void them() {
		list.add(new Account("admin", "admin" ,"admin"));
		list.add(new Account("quanly1", "quanly1" ,"quanly"));
		list.add(new Account("quanly2", "quanly2" ,"quanly"));
	}
	
}

