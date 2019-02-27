package com.cg.feedback.service;

import java.util.HashMap;

import com.cg.feedback.bean.Trainer;
import com.cg.feedback.dao.FeedbackDAO;
import com.cg.feedback.dao.IFeedbackDAO;

public class IFeedbackService implements FeedbackService {
     FeedbackDAO repo=new IFeedbackDAO();
	public void addFeedback(Trainer trainer) {
		
		repo.addFeedback(trainer);
	}

	public HashMap<Integer, Trainer> getTrainerList() {
		
		return repo.getTrainerList();
	}

}
