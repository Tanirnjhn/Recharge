package com.cg.feedback.dao;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.cg.feedback.bean.Trainer;
import com.cg.feedback.util.DBUtil;

public class IFeedbackDAO implements FeedbackDAO {
 

	
	HashMap<Integer, Trainer> hm;
	public void addFeedback(Trainer trainer) {
		hm=DBUtil.feedbackList;
		int v=(int)(Math.random()*1000);
		hm.put(v, trainer);
	}

	public HashMap<Integer, Trainer> getTrainerList() {
		hm=DBUtil.feedbackList;
        return hm ;
	}

}
