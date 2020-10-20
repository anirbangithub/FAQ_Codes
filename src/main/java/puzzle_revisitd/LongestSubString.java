package puzzle_revisitd;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	public static void main(String[] args) {

		int c = lengthOfLongestSubstring("");
		System.out.println("count::" + c);

	}

	public static int lengthOfLongestSubstring(String s) {
		int maxLength=0;
		//iterating one by one
		for(int i =0;i<s.length();i++) {
			int j=i;
			Set<Character> set=new HashSet<Character>();
			//checking for the longest substring && at the same time 
			//if there's any duplicate involved by using set
			while(j<s.length() && !set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				j++;
			}
			//checking if this substring is longer than the previous largest
			if(set.size()>maxLength)
				maxLength=set.size();
		}
		return maxLength;
	}
}
