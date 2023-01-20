package com.tfms.model;
//pojo
public class Topic {
	
	private String topicName;
	private String trainerId;
	private int traineeId ;
	private String trainingStartDate;
	private String trainingDuration;
	private String trainingEndDate;
	
	 
	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Topic(String topicName, String trainerId, int traineeId, String trainingStartDate,
			String trainingDuration, String trainingEndDate) {
		super();
		this.topicName = topicName;
		this.trainerId = trainerId;
		this.traineeId = traineeId;
		this.trainingStartDate = trainingStartDate;
		this.trainingDuration = trainingDuration;
		this.trainingEndDate = trainingEndDate;
	}


	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getTrainingStartDate() {
		return trainingStartDate;
	}
	public void setTrainingStartDate(String trainingStartDate) {
		this.trainingStartDate = trainingStartDate;
	}
	public String getTrainingDuration() {
		return trainingDuration;
	}
	public void setTrainingDuration(String trainingDuration) {
		this.trainingDuration = trainingDuration;
	}
	public String getTrainingEndDate() {
		return trainingEndDate;
	}
	public void setTrainingEndDate(String trainingEndDate) {
		this.trainingEndDate = trainingEndDate;
	}


	@Override
	public String toString() {
		return "Topic [topicName=" + topicName + ", trainerId=" + trainerId + ", traineeId=" + traineeId
				+ ", trainingStartDate=" + trainingStartDate + ", trainingDuration=" + trainingDuration
				+ ", trainingEndDate=" + trainingEndDate + "]";
	}

	
	

	
	

}
