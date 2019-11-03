package ua.univer.abramyanWhile;

public class Program4 {

	public static void main(String[] args) {
		int n = 9;
		boolean pow = MyLib.powNumber(n);
		   
		if(pow) {
        System.out.println("Да " + MyLib.powNumber(n));
	    }else {
		System.out.println("Нет " + MyLib.powNumber(n));	
	    }
    }
}
