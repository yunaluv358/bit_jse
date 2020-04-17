package com.jse.game;

public class RPSGame {
	private int userValue;
	private int computerValue;
	
	public void setUserValue(int userValue) {
		this.userValue=userValue;
	}
	public int getUserValue() {
		return userValue;
	}
	public void setComputerValue(int computerValue) {
		this.computerValue=computerValue;
	}
	public int getComputerValue() {
		return computerValue;
	}
	
	
	public String game() {
	
		String result ="";
	
		if(userValue==computerValue) {
			result="비김";
		}
		else if(userValue==1 && computerValue==3 || userValue==2 && computerValue==1 || userValue==3 && computerValue==2 ) {
			result="사용자가 승리";
		}
		else if(userValue==1 && computerValue==2 || userValue==2 && computerValue==3 || userValue==3 && computerValue==1) {
			result="컴퓨터가 승리";
		}
		return result;
	}
	
}

