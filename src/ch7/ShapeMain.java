package ch7;
import java.util.*;
public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape sp = new Shape();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x ��ǥ �Է� :");
		sp.p.x = sc.nextInt();
		System.out.print("y ��ǥ �Է� :");
		sp.p.y = sc.nextInt();
		
		sp.draw();
		
	}

}
