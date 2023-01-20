package com.tfms.dao.impl;

import java.sql.Statement;
import java.util.Scanner;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.cj.xdevapi.Statement; 
import com.tfms.dao.TopicBatchDao;
import com.tfms.model.Topic;
import com.tfms.util.Constants;
import com.tfms.util.DatabaseConnection;
import com.tfms.util.MenuCard;

public class TopicBatchDaoImpl implements TopicBatchDao {

private static final Logger logger = Logger.getLogger(TopicBatchDaoImpl.class);
	static Connection con = DatabaseConnection.getConnection();
	Scanner scInt = new Scanner(System.in);
	Scanner scString = new Scanner(System.in);
	MenuCard m=new MenuCard();

	@Override
	public void addBatch(Topic topic) throws SQLException {

		String query = "insert into batch values(?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, topic.getTopicName());

		ps.setString(2, topic.getTrainerId());
		ps.setInt(3, topic.getTraineeId());
		ps.setString(4, topic.getTrainingStartDate());
		ps.setString(5, topic.getTrainingEndDate());
		ps.setString(6, topic.getTrainingDuration());
		ps.executeUpdate();
		logger.info("do you want to continue");
		logger.info("press 1: continue");
		logger.info("else press: 2");
		int i =scInt.nextInt();
		switch(i) {
		case 1:
			m.menu();
			break;
		case 2:
			logger.info("thank you");
			
		}

	}

	@Override
	public void showBatch() throws SQLException {

		// TODO Auto-generated method stub
		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("select* from batch");

//		String query = "select * from batch where traineeId= ?";
//		PreparedStatement ps = con.prepareStatement(query);
//		ResultSet rs=ps.executeQuery();
		while (rs.next()) {
			System.err.println(rs.getString(1) + " , " + rs.getString(2) + " , " + rs.getInt(3) + " , "
					+ rs.getString(4) + " , " + rs.getString(5) + " , " + rs.getString(6));

		}
		logger.info("do you want to continue");
		logger.info("press 1: continue");
		logger.info("else press: 2");
		int i =scInt.nextInt();
		switch(i) {
		case 1:
			m.menu();
			break;
		case 2:
			logger.info("thank you");
			
		}

	}

	@Override
	public void deleteBatch() throws SQLException {
		logger.info("enter the trinee ID");
		int TID = scInt.nextInt();
		PreparedStatement ps1 = con.prepareStatement("delete from batch where traineeId=?");
		ps1.setInt(1, TID);
		int k = ps1.executeUpdate();
		if (k > 0) {
			logger.info("Deleted successfully");
		}
		logger.info("do you want to continue");
		logger.info("press 1: continue");
		logger.info("else press: 2");
		int i =scInt.nextInt();
		switch(i) {
		case 1:
			m.menu();
			break;
		case 2:
			logger.info("thank you");
			
		}

	}

	@Override
	public void updateBatch() throws SQLException {

		PreparedStatement ps2;
		logger.info(Constants.SELECT);
		int press = scInt.nextInt();
		switch (press) {
		case 1:
			try {
				logger.info("enter the trinee ID");
				int TID = scInt.nextInt();
				ps2 = con.prepareStatement("update batch set trainerId=? where traineeId=?");
				logger.info("Enter new trainerId:");
				String id = scString.nextLine();
				ps2.setString(1, id);
				ps2.setInt(2, TID);
				int s = ps2.executeUpdate();
				if (s > 0) {
					logger.info("Updated");
				} else {
					logger.info("Not Updated");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			break;
		case 2:
			try {
				logger.info("enter the trinee ID");
				int TID = scInt.nextInt();
				ps2 = con.prepareStatement("update batch set topicName=? where traineeId=?");
				logger.info("Enter new TopicName:");
				String topicName= scString.nextLine();
				ps2.setString(1, topicName);
				ps2.setInt(2, TID);
				int s = ps2.executeUpdate();
				if (s > 0) {
					logger.info("Updated");
				} else {
					logger.info("Not Updated");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 3:
			try {
				logger.info("enter the trinee ID");
				int TID = scInt.nextInt();
				ps2 = con.prepareStatement("update batch set startDate=? where traineeId=?");
				logger.info("Enter new StartDate:");
				String sDate= scString.nextLine();
				ps2.setString(1, sDate);
				ps2.setInt(2, TID);
				int s = ps2.executeUpdate();
				if (s > 0) {
					logger.info("Updated");
				} else {
					logger.info("Not Updated");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 4:
			try {
				logger.info("enter the trinee ID");
				int TID = scInt.nextInt();
				ps2 = con.prepareStatement("update batch set endDate=? where traineeId=?");
				logger.info("Enter new EndDate:");
				String edate= scString.nextLine();
				ps2.setString(1, edate);
				ps2.setInt(2, TID);
				int s = ps2.executeUpdate();
				if (s > 0) {
					logger.info("Updated");
				} else {
					logger.info("Not Updated");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 5:
			try {
				logger.info("enter the trinee ID");
				int TID = scInt.nextInt();
				ps2 = con.prepareStatement("update batch set trainingDuration=? where traineeId=?");
				logger.info("Enter new Duration:");
				String tDuration = scString.nextLine();
				ps2.setString(1, tDuration);
				ps2.setInt(2, TID);
				int s = ps2.executeUpdate();
				if (s > 0) {
					logger.info("Updated");
				} else {
					logger.info("Not Updated");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		logger.info("do you want to continue");
		logger.info("press 1: continue");
		logger.info("else press: 2");
		int i =scInt.nextInt();
		switch(i) {
		case 1:
			m.menu();
			break;
		case 2:
			logger.info("thank you");
			
		}

	}

}
