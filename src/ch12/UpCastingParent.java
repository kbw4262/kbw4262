package ch12;

public class UpCastingParent {

		protected int x;
		protected int y;
		
		public UpCastingParent() {
			x = 10;
			y = 20;
		}
	
		
		public int add() {
			System.out.println(" Parent ÀÇ Add ");
			return x + y;
			
		}
}
