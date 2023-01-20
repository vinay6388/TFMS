package com.tfms.util;

import java.sql.SQLException;
import java.util.Scanner;

import com.tfms.dao.impl.TopicBatchDaoImpl;
import com.tfms.model.Topic;

public class MenuCard {
	public void menu() throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("**Menu**");
		System.out.println("1.Add Batch Details");
		System.out.println("2.Show Batch Details");
		System.out.println("3.Delete Batch Details");
		System.out.println("4.Update Batch Details");
	    int a=sc.nextInt();
	    
	TopicBatchDaoImpl b1=new TopicBatchDaoImpl();
	
				
				switch(a)
				{
				case 1:
					Topic  topic = new Topic();
					System.out.print("Enter the topic name:-");
					topic.setTopicName(sc.nextLine());
					System.out.println("enter traineeid");
					topic.setTraineeId(sc.nextLine());
					System.out.println("enter trainer id");
					topic.setTrainerId(sc.nextLine());
					System.out.println("enter start date");
					topic.setTrainingStartDate(sc.nextLine());
					System.out.println("enter end date");
					topic.setTrainingEndDate(sc.nextLine());
					System.out.println("enter training duration");
					topic.setTrainingDuration(sc.nextLine());
					b1.addBatch(topic);
					
					
					break;
						
					
						
						
				case 2:
					System.out.println("enter id delete");
					
					    break;
			   case 3:
				
						
						break;
					case 4:
						
					
						break;
				default:
					
					System.out.println("please select a valid option");
					break;
			}
	}
}

				
				

		
//		
//			
//	
//
//		}
//	
//
//	
//}
//				
//	
//			
//	
//		
//
//
