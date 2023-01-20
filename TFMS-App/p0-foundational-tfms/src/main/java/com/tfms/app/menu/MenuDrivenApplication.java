package com.tfms.app.menu;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.tfms.dao.impl.TopicBatchDaoImpl;
import com.tfms.util.MenuCard;
public class MenuDrivenApplication {
	/**
	 * 
	 * @throws IOException
	 * @throws SQLException
	 */
	public static void main(String[] args) throws SQLException {
		MenuCard m=new MenuCard();
		m.menu();
	}	
}



