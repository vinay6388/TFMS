package com.tfms.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tfms.dao.TopicBatchDao;
import com.tfms.model.Topic;
import com.tfms.util.DatabaseConnection;

public class TopicBatchDaoImpl implements TopicBatchDao{
	static Connection con = DatabaseConnection.getConnection();

	@Override
	public void addBatch(Topic topic) throws SQLException {
		String query = "insert into batch(topicName) VALUES ( ?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, topic.getTopicName());
		ps.setString(2, topic.getTraineeId());
		ps.setString(3, topic.getTrainerId());
		ps.setString(4, topic.getTrainingStartDate());
		ps.setString(5, topic.getTrainingEndDate());
		ps.setString(6, topic.getTrainingDuration());
		
		System.out.println(ps.executeUpdate());
		
		 
		
		
	}

	@Override
	public void showBatch() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBatch(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBatch(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
}


	

		

