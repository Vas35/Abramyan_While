package ua.univer.abramyanWhile;

public class Program1 {

		public static void main(String[] args) {
		int b = 2;
		int a = 6;
		boolean segmentSize = MyLib.segment(a,b);
	   
		if(segmentSize) {
        System.out.println("Длинна незанетой части отрезка отсутстует и это " + MyLib.segment(a,b));
	    }else {
		System.out.println("Длинна незанетой части отрезка отсутстует и это " + MyLib.segment(a,b));	
	    }
	 }
}
