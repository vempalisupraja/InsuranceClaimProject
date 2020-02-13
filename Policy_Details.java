package com.cg.dto;

public class Policy_Details {

	private int policyNumber;
	private String questionId;
	private String answer;
	private int claimNumber;
	
	public Policy_Details() {
		
	}

	public Policy_Details(int policyNumber, String questionId, String answer, int claimNumber) {
		super();
		this.policyNumber = policyNumber;
		this.questionId = questionId;
		this.answer = answer;
		this.claimNumber = claimNumber;
	}

	public int getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getClaimNumber() {
		return claimNumber;
	}

	public void setClaimNumber(int claimNumber) {
		this.claimNumber = claimNumber;
	}

	@Override
	public String toString() {
		return "Policy_Details [policyNumber=" + policyNumber + ", questionId=" + questionId + ", answer=" + answer
				+ ", claimNumber=" + claimNumber + "]";
	}
	
	
	
}
