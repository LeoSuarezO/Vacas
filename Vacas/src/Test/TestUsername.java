package Test;

import com.uptc.livestock.model.dao.LoginManage;

public class TestUsername {
	public static void main(String[] args) {
		LoginManage loginManage = new LoginManage();
		System.out.println(loginManage.generateUsername("lola", "labandida", "00000000"));
		System.out.println(loginManage.generateUsername("lola", "labandida", "00000000"));
		System.out.println(loginManage.generateUsername("lola", "labandida", "00000000"));
		System.out.println(loginManage.generateUsername("luis", "elbandido", "00000000"));
	}
}
