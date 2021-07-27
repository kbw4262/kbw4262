package ch12;

public class UpCastingChild extends UpCastingParent {

		private int z;
		
		public UpCastingChild() {
			x = 100;
			y = 200;
			z = 300;
		}
		
		
		@Override
		public int add() {
			System.out.println(" Child ÀÇ Add()");
			return x+y+z;
		}
		
		public int sub() {
			System.out.println(" Child ÀÇ Sub()");
			return x-y-z;
		}
		
		public void setZ(int z) {
			this.z = z;
		}
		public int getZ() {
			return z;
		}
	
	
}
