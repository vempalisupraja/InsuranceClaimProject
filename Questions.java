package com.cg.dto;

public class Questions {
	private String questionId;
	private String question;
	private String answer;
	
	public Questions() {
		super();
	}

	public Questions(String questionId, String question, String answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Questions [questionId=" + questionId + ", question=" + question + ", answer=" + answer + "]";
	}
	
	
	
}
