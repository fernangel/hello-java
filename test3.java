
public class test3 {
	public static void main(String[] args) {
        int [] massive = {12,0,136,5,-723,13,100500,25};
        int max = massive[0];
        for(int i = 0; i<massive.length; i++){
        	if(massive[i]==100500)
        		continue;
            if(max<massive[i])
                max = massive[i];
        }
        System.out.println("Max: "+max);
    }

}
