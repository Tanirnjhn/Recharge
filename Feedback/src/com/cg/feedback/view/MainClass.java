package com.cg.feedback.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.feedback.bean.Trainer;
import com.cg.feedback.dao.IFeedbackDAO;
import com.cg.feedback.service.FeedbackService;
import com.cg.feedback.service.IFeedbackService;

public class MainClass {

	
	public static void main(String[] args) {
		FeedbackService fbSer=new IFeedbackService();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("1. Enter details of the feedback");
		System.out.println("2. Display");
		System.out.println("3. Exit");
		System.out.println("Enter Choice");
		int choice=scanner.nextInt();
		
		switch(choice)
		{
		case 1: 
			{
				System.out.println("Enter name of trainer");
		String tn=scanner.next();
		System.out.println("Enter trainer courseNsme");
		String tcn=scanner.next();
		System.out.println("Enter Date of Starting");
		String tsd=scanner.next();
		System.out.println("Enter Date of Ending");
		String ted=scanner.next();
		System.out.println("Enter training rating");
		int tr=scanner.nextInt();
		
		Trainer train=new Trainer(tn,tcn,tsd,ted,tr);
		
		fbSer.addFeedback(train);
		Map<Integer,Trainer> tre=fbSer.getTrainerList();
		for(Map.Entry<Integer, Trainer> i:tre.entrySet())
		{
			System.out.println(i.getValue().getName());
			System.out.println(i.getValue().getCourseName());
			System.out.println(i.getValue().getStartDate());
			System.out.println(i.getValue().getEndDate());
			System.out.println(i.getValue().getRating());
		}
		 break;
			}
		case 2:
		{
			System.out.println("Enter valid ratings");
			int rate=scanner.nextInt();
			Map<Integer,Trainer> tre1=fbSer.getTrainerList();
			for(Map.Entry<Integer, Trainer> a:tre1.entrySet())
		{
				if(rate==a.getValue().getRating())
				{
				System.out.println(a.getValue().getName());
				System.out.println(a.getValue().getCourseName());
				System.out.println(a.getValue().getStartDate());
				System.out.println(a.getValue().getEndDate());
				System.out.println(a.getValue().getRating());
			}
			
		
			else
			{
				System.out.println(" invalid rating");
			    
		}
		}
			break;
		}
	
			
		
		case 3:
		{
			System.exit(0);
		}
		
	}

	}
}
