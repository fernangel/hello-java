
public class test2 {
	public static void main(String[] args) {
        int [] massive = {120,0,1300,50,-73,123,31,25};
        int sum = 0;
        int num = 0;
        for(int i = 0; i<massive.length; i++){
        	sum=sum+massive[i];
        	if(massive[i]>1000)
            	num++;	
        }
        if (num>0) {
        	System.out.println("Массив - массивный!");
        }
        	System.out.println("Cумма: "+sum);
    }

}
