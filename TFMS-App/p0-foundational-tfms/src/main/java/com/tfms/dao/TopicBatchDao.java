package com.tfms.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import com.tfms.model.Topic;

// It is the DAO file

public interface TopicBatchDao {
	
	public abstract void addBatch(Topic topic) throws SQLException;
	public abstract void showBatch()throws SQLException;
	public abstract void deleteBatch()throws SQLException;
	public abstract void updateBatch()throws SQLException;
	


	
}
