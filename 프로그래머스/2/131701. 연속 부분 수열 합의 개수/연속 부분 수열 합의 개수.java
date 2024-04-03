import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] elements) {
        
        HashSet<Integer> set = new HashSet<>();
		int len = elements.length;

		for (int size = 1; size <= len; size++) {
			for (int i = 0; i < len; i++) {
				int sum = 0;
                
				for (int j = i; j < i + size; j++) {
					sum += elements[j % len];
				}
                
				set.add(sum);
			}
		}
        
		return set.size();
        
    }
}