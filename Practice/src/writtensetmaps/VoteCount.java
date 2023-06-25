package writtensetmaps;

import java.util.HashMap;
import java.util.Map;

public class VoteCount {

	void voteCount(Map<String, String> Vmap) {

		Vmap.put("1234", "BJP");
		Vmap.put("9876", "ShivSena");
		Vmap.put("4567", "NCP");
		Vmap.put("3216", "Congress");
		Vmap.put("7891", "BJP");
		Vmap.put("6549", "Other");
		Vmap.put("9871", "BJP");

		// Create a map with party name as key and count of votes as value
		Map<String, Integer> count = new HashMap<>();

		// Count the votes for each party
		for (String pa : Vmap.values()) {
			count.put(pa, count.getOrDefault(pa, 0) + 1);
		}

		// Print the resulting vote count map
		System.out.println(count);
	}

	public static void main(String[] args) {
		// Create a map with Aadhar number as key and party voted for as value
		Map<String, String> Vmap = new HashMap<>();
		
		VoteCount obj = new VoteCount();
		obj.voteCount(Vmap);

	}
}
