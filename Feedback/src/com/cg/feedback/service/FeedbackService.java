package com.cg.feedback.service;

import java.util.HashMap;

import com.cg.feedback.bean.Trainer;

public interface FeedbackService {

	   public void addFeedback(Trainer trainer);
	   public HashMap<Integer,Trainer> getTrainerList();
}
