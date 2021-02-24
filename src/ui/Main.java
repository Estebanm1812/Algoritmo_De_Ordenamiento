package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		
		int quantity = Integer.parseInt(line);
		int amount = 0;
		
		while((line != null)&& (quantity >= amount)) {
		
		
		
			String lineValue = br.readLine();
			String [] textValue = lineValue.split(" ");	
			for(int i=0; i < textValue.length;i++) { 
				
				
			amount+=1;
			}
		}	
	}

}
