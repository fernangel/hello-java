
public class test2 {
	public static void main(String[] args) {
        int [] massive = {1210,0,300,500,-73,123,31,25};
        int sum = 0;
        boolean num = false;
        for(int i = 0; i<massive.length; i++){
        	sum+=massive[i];
        	if(massive[i]>1000)
            	num=true;	
        }
        if (num == true) {
        	System.out.println("Массив - массивный!");
        }
        	System.out.println("Cумма: "+sum);
    }

}