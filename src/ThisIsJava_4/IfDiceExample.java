package ThisIsJava_4;

public class IfDiceExample {

	static void print(int num) {
		System.out.println("주사위 눈금은 "+num+" 입니다.");
	}
	
	void print2(int num) {
		System.out.println(num + " 일껄요..?");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num = (int)(Math.random()*6)+1;
		int i =0;
		
		IfDiceExample a = new IfDiceExample();
		a.print2(99);
		printTest pt = new printTest();
		pt.print(5);
		
		do {
		int num = (int)(Math.random()*6)+1;
		if (num == 1) {
			print(num);
		}
		else if(num == 2) {
			print(num);
		}else if(num == 3) {
			print(num);
		}else if(num == 4) {
			print(num);
		}else if(num == 5) {
			print(num);
		}else if(num == 6) {
			print(num);
		}
		i++;
		}while(i<5);
	}

}
