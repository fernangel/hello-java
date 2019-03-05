
public class test3 {
	public static void main(String[] args) {
        int [] massive = {1200,500,100500,100500,100500,100500,100500,100500};
        int max = massive[0];
        for(int i = 0; i<massive.length; i++)
        	if(massive[i]!=100500) {
        		max = massive[i];
        		break;
        		}
        for(int i = 0; i<massive.length; i++){
        	if(massive[i]==100500)
        		continue;
            if(max<massive[i])
                max = massive[i];
        }
        if (max!=100500)
        System.out.println("Max: "+max);
        else 
        System.out.println("Все элементы массива - 100500");
    }

}
