package ua.univer.abramyanWhile;

public class MyLib {

	    public static boolean segment (int x, int y) {
		boolean empty = false;
		while (y <= x) {
			x = x-y;
			if (x == y) { empty = true;}
		}
		return empty;
	    }
	    
	    
	    
		public static int numbSegment (int x, int y) {
			int count = 0;
			while (y <= x) {
				x = x-y;
				count ++;
			}
			return count;
		}
		
		public static int restIntegerNumber(int x,int y) {
			int count = 0;
			while (x>y) {
				x=x-y;
				count++;
			}
			return count;
		}
		
		public static int restNumber(int x,int y) {
			int count = 0;
			while (x>y) {
				x=x-y;
				count = x;
			}
			return count;
		}
		
		public static boolean powNumber(int x) {
			boolean pow = false;
			while(x%3 == 0) {
			x /=3;
			if (x == 1) { pow = true;}
			}
			return pow;
		    }
		
		public static int powK(int x) {
			int count =0;
			while (x%2 ==0) {
				x /= 2;
				count ++;
				if (x==1) break;
			}
			return count;
		}
			
		
		
		
		
		
		
		
}
