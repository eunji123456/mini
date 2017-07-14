package miniproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
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

		}
		while (true) {
			// 가장 바깥의 반복문으로 , 5를 선택하면 나가게 설계 되어있다
			book b = new book();
			b.printmenu();
			int choise = sc.nextInt();// 번호 선택
			switch (choise) {// 번호를 입력받아서 1~4까지의 동작을 함
			case 1:
				System.out.println("<1.리스트>");
				for (int k = 0; k < booklist.size(); k++) {
					booklist.get(k).showInfo(k);
				}
				break;// case문 나가는 break

			case 2:
				Writer w = new FileWriter("phoneDB.txt", true);
				BufferedWriter bw = new BufferedWriter(w);
				System.out.println("<2.등록>" + '\n');
				System.out.print("이름 : ");
				String p1 = sc.next();
				System.out.print("휴대전화 : ");
				String p2 = sc.next();
				System.out.print("집전화 : ");
				String p3 = sc.next();

				book setb = new book();
				setb.setName(p1);
				setb.setPh(p2);
				setb.setCall(p3);
				booklist.add(setb);

				bw.write(p1+",");
				bw.write(p2+",");
				bw.write(p3+'\n');
				bw.close();

				break;

			case 3:
				System.out.println("<3.삭제>");
				int remove = sc.nextInt();
				booklist.remove(remove-1);
				
				Writer w1 = new FileWriter("phoneDB.txt");
				BufferedWriter bw1 = new BufferedWriter(w1);
				String sum="" ;
				for(int i =0;i<booklist.size();i++) {
					sum += booklist.get(i).name+","+booklist.get(i).ph+","+booklist.get(i).call+'\n';
					System.out.println(i);
				} 
				bw1.write(sum);
				bw1.flush();
				
				break;
			case 4:
				System.out.println("<4.검색>");
				int Serch = 0;
				int countindex=0;
				String name1 = sc.next();
				
				for(int a=0;a<booklist.size();a++) {
					Serch =booklist.get(a).name.indexOf(name1);
					if(Serch>=0) {
						booklist.get(a).showInfo(a);
					}
				}System.out.println(" ");
				
				

				break;
				
			case 5:
			
				break;
			default:
				b.top();
				System.out.println("다시 입력해 주세요.");
			}
				if (choise == 5) {
					b.printEnd();// 감사합니다를 출력하고 나간다.
					break;
				}
			

		} // while
	}
}