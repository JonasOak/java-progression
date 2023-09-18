package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		Map<String, Integer> ballotBox = new HashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(",");
				
				String candidate = fields[0];
				Integer whishes = Integer.parseInt(fields[1]);
				
				if (ballotBox.containsKey(candidate)) {
					int votesSoFar = ballotBox.get(candidate);
					ballotBox.put(candidate, whishes + votesSoFar);
				}
				else {
					ballotBox.put(candidate, whishes);
				}
				
				line = br.readLine(); 
			}
			
			for (String key : ballotBox.keySet()) {
				System.out.println(key + ": " + ballotBox.get(key));
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
		
	}

}
