package codility;

public class E01_BinaryGap_second {

	public static void main(String[] args) {
	       String a = Integer.toBinaryString(561892);
	       System.out.println(a +":: binary");
	        int s = a.length()-1;
	        char one = '1';
	        //remove zero
	        for( ; s>=0;s--){
	            if(a.charAt(s) == one) break;
	        }
	        int count=0;
	        int max = 0;
	        for(;s>=0; s--){
	            if(a.charAt(s) == one){
	                if(max < count) { 
	                    max = count;
	                    System.out.println(s+":: where");
	                    System.out.println(count);
	                }
	                count =0;
	            }
	            else {
	                count++;       
	            }
	        }
	        System.out.println(max);
	    }

}
