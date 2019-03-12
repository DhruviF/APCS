import java.util.*;

public class permute{
  public static TreeSet<String> list= new TreeSet<String>();
	public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Input string: ");
    String str = scan.next();
		int n = str.length();
    
		permute permutation = new permute();
		permutation.permute("", str, list);
    for (String s: list ) {
			System.out.println(s);
		}
	}

  private void permute (String s1, String s2, Set<String> set){
		if (s2.length()==0) {
			set.add(s1);
		} else {
			for (int i = 0; i<s2.length(); i++) {
				permute(s1+s2.charAt(i),
					s2.substring(0, i) + s2.substring(i+1, s2.length()), set);
			}
		}
	}

	public String swap(String a, int i, int j){
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
    if(!list.contains(String.valueOf(charArray))){
      list.add(String.valueOf(charArray)+"\n");
      return String.valueOf(charArray);
    }else{
      return "";
    }

	}

}
