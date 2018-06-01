package Test;

import java.util.ArrayList;
import java.util.Scanner;

import com.uptc.livestock.model.dao.LoginManage;
import com.uptc.livestock.model.entity.Rancher;
import com.uptc.livestock.utilities.PasswordUtil;

public class TestUsername {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<Rancher> ranchers = new ArrayList<>();
		int option = -1;
		do {
			System.out.print("Nombre : ");
			String name = sc.nextLine();
			System.out.print("Apellido : ");
			String lastname = sc.nextLine();
			System.out.print("Usuario : ");
			System.out.println(LoginManage.useName(name, lastname));
			String password;
			String password2;

			do {
				System.out.print("Contraseña : ");
				password = sc.nextLine();
				System.out.print("Confirmar contraseña : ");
				password2 = sc.nextLine();
				if (!password.equals(password2))
					System.out.println("Las contraseñas no coinciden");
			} while (!password.equals(password2));
			System.out.println("Contraseña admitida");
			ranchers.add(new Rancher((short) 0, name, lastname, "ss", 00, LoginManage.useName(name, lastname)));
			LoginManage.generateUsername(name, lastname, PasswordUtil.getHash(password));

			System.out.print("salir? [1]");
			option = Integer.parseInt(sc.nextLine());
		} while (option != 1);
		for (Rancher rancher : ranchers) {
			System.out.println(rancher.getUsername());
		}
	}
}
