package miniproject;

import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;
import java.io.Reader;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Reader r = new FileReader("phoneDB.txt"); // 읽기 스트림
		BufferedReader br = new BufferedReader(r);// 읽기 버퍼

		String line;
		ArrayList<book> booklist = new ArrayList<book>();
	
		while (true) {
			line = br.readLine();// 라인으로 읽어와서 ,를 단위로 잘라서 보여줄 예쩡
			if (line == null) {
				break;// while탈출 조건
			}
			String div[] = line.split(",");
			
			book b = new book();
			b.setName(div[0]);
			b.setPh(div[1]);
			b.setCall(div[2]);
			booklist.add(b);
			
		}for(int i=0;i<booklist.size();i++) {
			booklist.get(i).showInfo(i);
		}
		sc.close();
		br.close();
		
	}
}