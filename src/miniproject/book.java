package miniproject;

import java.util.ArrayList;

public class book {

	String name;
	String ph;
	String call;

	book() {
	}

	book(String name, String ph, String call) {
		this.name = name;
		this.ph = ph;
		this.call = call;
	}
	
	
	public void setName(String name ) {
		this.name = name ; 
	}
	public String getName() {
		return name;
	}
	public void setPh(String ph ) {
		this.ph = ph ; 
	}
	public String getPh() {
		return ph;
	}
	public void setCall(String call ) {
		this.call = call ; 
	}
	public String getCall() {
		return call;
	}
	
	//메뉴 출력만 해주는 애 
	public void printmenu() {
	System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
		System.out.println("----------------------------");
		System.out.print(">메뉴번호 :");
	}
	
	public void printEnd() {
		System.out.println("**************************");
		System.out.println("*          감사합니다             *");
		System.out.println("***************************");
	}
	public void top() {
		System.out.println("**************************");
		System.out.println("*     전화번호 관리 프로그램       *");
		System.out.println("***************************");
	}

	public void showInfo(int k) {
		System.out.println(k+1+name +"	"+ph+"	"+call+"	");
	}

}
