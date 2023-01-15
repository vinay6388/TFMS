package com.tfms.app.menu;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

//import com.revature.dao.UserDao;
//import com.revature.dao.UserDaoImpl;
//import com.revature.model.User;
//import com.revature.util.DateTimeUtil;	
import com.tfms.util.MenuCard;

public class MenuDrivenApplication {

	/**
	 * @param args
	 * @throws IOException
	 * @throws SQLException
	 */
	public static void main(String[] args) {
		char choice = 'y';
		//UserDao userDao = new UserDaoImpl();
		do {
			MenuCard.print();
			Scanner choiceScan = new Scanner(System.in);
			choice = choiceScan.next().charAt(0);
			switch (choice) {
			case '1':
				addForm();
				break;
			case '2':
				updateForm();
				break;
			case '3':
				deleteForm();
				break;
			case '4':
				searchSpecificForm();
				break;
			default:
				System.out.println("      Wrong option selected!");
			}
		} while (choice !='n');
	}

	private static void searchSpecificForm() { //throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("You Selected -Search Guest");
		System.out.print("Please Enter Login ID To Search:");
		String loginId = scan.nextLine();
		//User found = userDao.getUser(loginId.trim());
//		if (Objects.nonNull(found)) {
//			System.out.println("Guest Found!");
//			System.out.println(found);
//		} else {
//			System.out.print("Guest Not Found!");
//		}
	}

	private static void deleteForm() { //throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("You Selected -Delete Guest");
		System.out.print("Please Enter Login ID To Delete:");
		String loginId = scan.nextLine();
//		if (Objects.nonNull(userDao.getUser(loginId))) {
//			int result = userDao.delete(loginId.trim());
//			if (result > 0)
//				System.out.print("Guest Deleted sucessfully!");
//		} else {
//			System.out.print("Incorrect Login Id!");
//		}
	}

	private static void updateForm() {//throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("You Selected -Update Guest");
		System.out.print("Please Enter You Login ID:");
		String loginId = scan.nextLine();
//		if (Objects.nonNull(userDao.getUser(loginId))) {
//			System.out.print("Please Enter New Password:");
//			String password = scan.nextLine();
//			int result = userDao.update(new User(loginId.trim(), password.trim(), DateTimeUtil.getCurrentDateTime()));
////			if (result > 0)
//				System.out.print("Guest Updated sucessfully!");
//		} else
//			System.out.print("Incorrect Login Id!");
	}

	private static void addForm() {//throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("You Selected -Add Guest");
		System.out.print("Please Enter You Login ID (can't change later):");
		String loginId = scan.nextLine();
//		if (Objects.isNull(userDao.getUser(loginId))) {
//			System.out.print("Please Enter You Password:");
//			String password = scan.nextLine();
//			int result = userDao.add(new User(loginId.trim(), password.trim(), DateTimeUtil.getCurrentDateTime()));
//			if (result > 0)
//				System.out.print("Guest added sucessfully!");
//		}
//		else {
//			System.out.print("Login Id Already Taken!");
//		}
	}
}
