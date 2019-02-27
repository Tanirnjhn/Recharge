package com.cg.feedback.util;

import java.time.LocalDate;
import java.util.HashMap;

import com.cg.feedback.bean.Trainer;

public class DBUtil {
 
	public static HashMap<Integer,Trainer> feedbackList=new HashMap<>();
	
	static{
		feedbackList.put(41,new Trainer("Smitha", "Java", "13-03-2000","10-04-2000", 5));
		feedbackList.put(22,new Trainer("Smitha", "Java", "01-01-2000","10-01-2000", 4));
		feedbackList.put(43,new Trainer("Smitha", "Java","13-01-2001","23-10-2001",3));
	}

	
	
	
	
}