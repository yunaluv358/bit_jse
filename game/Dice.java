package com.jse.game;
import java.util.Scanner;
import java.util.Random;
// 시나리오
public class Dice {
	private String expect;
	private int diceNumber;
	
	public void setExpect(String expect) { //외부에서 값이 들어온다 ()안에 의미
	this.expect =expect; //expect값을 this.expect값에 할당해라
	}
	public String getExpect() {
		return expect;
	}
	public void setDiceNumber(int diceNumber) {
		this.diceNumber = diceNumber;
	}
	public int getDiceNumber() {
		return diceNumber;
	}


	public String switchDice() {

		String result ="";
		switch(diceNumber) {
		case 1: case 3: case 5: result="홀"; break;
		case 2: case 4: case 6: result="짝"; break;
		}
		String result2 = "틀림";
		if(expect.equals(result)) {
			result2="맞음";
		}
	
		System.out.println(String.format("결과: %s", result2));
		return result2;
	}
}
	/*System.out.println("사용자 홀짝 예상값: 홀");
	Random random = new Random();
	int dice = random.nextInt(4);
	System.out.println("컴퓨터가 생성한 값: 4");
	String result = "";
	switch(dice) {}
	System.out.println("컴퓨터의 결과:짝");
	
	static void ifDice() {
		System.out.println("주사위 홀짝 맞추기 게임");
		System.out.println("기대하는 값 홀/짝 을 입력해 주세요");
		Scanner scanner = new Scanner(System.in);
		String expect = scanner.next();
		System.out.println("사용자 홀짝 예상값" + expect);
		Random random = new Random();
		int dice= random.nextInt(6)+1;
		System.out.println("컴퓨터가 생성한 값 : "+ dice);
		
		String result = "";
		if(dice == 1) {
			result = "홀";
		}else if(dice == 2) {
			result="짝";
		}else if(dice ==3) {
			result = "홀";
		}else if(dice ==4) {
			result = "짝";
		}else if(dice ==5) {
			result = "홀";
		}else {
			result = "짝";
		}
		
	
	System.out.println("컴퓨터 홀짝결과: "+result);
	if(expect.equals(result)) 
	{
		System.out.println("매칭 결과: 맞음");
	}else {
		System.out.println("매칭 결과: 틀림");
	}
	
	}}
		/*
		Scanner scanner = new Scanner(System.in);
		String expect = scanner.next();
		System.out.println("예상값:"+expect);
		
		Random random = new Random();
		int dice = random.nextInt(6)+1;
		System.out.println("결과 값:"+dice);
		
		String result = "";
		if(dice == 1) {
			result = "홀";
		}else if(dice == 2) {
			result="짝";
		}else if(dice ==3) {
			result = "홀";
		}else if(dice ==4) {
			result = "짝";
		}else if(dice ==5) {
			result = "홀";
		}else {
			result = "짝";
		}
		
	System.out.println("홀짝 결과:"+result);
	System.out.println("맞음"+result);
	System.out.println("틀림"+result);
	}

}
		*/