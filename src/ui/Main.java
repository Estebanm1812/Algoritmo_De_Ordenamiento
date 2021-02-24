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
			double [] value = new double [textValue.length];
			for(int i=0; i < textValue.length;i++) { 
				
				value[i] = Double.parseDouble(textValue[i]);
				
			
			}
			int totalchanges = 0;
			for(int i =1; i < value.length;i++) {
						
					int changes = 0;
					
					for(int j = 0; j < (value.length-i) ; j++ ) {
				
						if(value[j]>value[j+1]) {
						
							double temp = value[j];
							value[j] = value[j+1];
							value[j+1] = temp;
							changes+=1;
							
							}
					System.out.println(changes);
					totalchanges+= changes;
					
					}
					System.out.println(totalchanges);
			}
		}	
	}

}
