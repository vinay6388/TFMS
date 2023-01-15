DROP DATABASE IF EXISTS TFMS;
CREATE DATABASE TFMS;  # This is my main database
USE TFMS;
DROP TABLE IF EXISTS Batch;
CREATE TABLE Batch
(
	topicName varchar(20) not null,
    trainerId char(4),
    traineeId int(4),
    startDate date not null,
    endDate date not null,
    FOREIGN KEY (trainerId) REFERENCES Trainer(trainerId),
    FOREIGN KEY (traineeId) REFERENCES Associate(traineeId)
    
);