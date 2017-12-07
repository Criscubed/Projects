import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		String[] array = {"Alaska", "Hello", "Dad", "Peace"};
		String[] result = findWords(array);
		System.out.println(result.length);
	}

	    public static String[] findWords(String[] words) {
	        String first = "qwertyuiop";
	        String second = "asdfghjkl";
	        String third = "zxcvbnm";
	        
	        ArrayList<String> result = new ArrayList<String>();
	        
	        for(String w: words){
	            if(canBeTypedWithRow(w.toLowerCase(), first)){
	                result.add(w);
	            } else if(canBeTypedWithRow(w.toLowerCase(), second)){
	                result.add(w);
	            } else if(canBeTypedWithRow(w.toLowerCase(), third)){
	                result.add(w);
	            }
	                
	        }
	        return result.toArray(new String[result.size()]);
	    }
	    
	    public static boolean canBeTypedWithRow(String w, String row){
	    	System.out.println("testing word:" + w);
	    	System.out.println("Testing row:" + row);
	        for(int i = 0; i < w.length(); i++){
	        	System.out.println("Testing letter:" + w.charAt(i));
	            if(!row.contains(Character.toString(w.charAt(i)))){
	                return false;
	            }
	        }
	        return true;
	    }	
}
