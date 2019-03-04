
public class test1 {
    public static void main(String args[]) {
    	int x = -536;
    	int y = 832;
    	double z;
    	if (x<0 || y<0) {
    		System.out.println("Есть  отрицательное число");
    		}
    	if (y>0 || y<0) {
    		
    		z = (double)x/y;
    		System.out.println("Результат деления:" +z);
    	} 
    	if (x>y) {
    		System.out.println("Первое число больше второго");
    	}
    	if (x<y) {
    		System.out.println("Второе число больше первого");
    	}
    	 if( x % 2 == 0) {
    		 System.out.print("Число " + x + " - четное");
        } 
    } 
}