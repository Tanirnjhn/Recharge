package com.cg.feedback.dao;

import java.util.HashMap;

import com.cg.feedback.bean.Trainer;

public interface FeedbackDAO {

	  public void addFeedback(Trainer trainer);
	   public HashMap<Integer,Trainer> getTrainerList();
}
