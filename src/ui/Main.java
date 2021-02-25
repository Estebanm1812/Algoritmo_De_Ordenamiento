package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;


public class Main {
	
	
	private static DecimalFormat df;
	private static DecimalFormatSymbols dfs;
	
	public static void main(String[] args) throws IOException {
		
	
		dfs = new DecimalFormatSymbols(Locale.getDefault());
		dfs.setDecimalSeparator('.');
		df = new DecimalFormat("0.00",dfs);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		
		int quantity = Integer.parseInt(line);
		int amount = 0;
		System.out.println("");
		while((line != null)&& (quantity > amount)) {
		
		
		
			String lineValue = br.readLine();
			String [] textValue = lineValue.split(" ");
			double [] value = new double [textValue.length];
			for(int i=0; i < textValue.length;i++) { 
				
				value[i] = Double.parseDouble(textValue[i]);
				
			
			}
			int totalchanges = 0;
			double timesThatGoesIn = 0;
			for(int i =1; i < value.length;i++) {
						
					int changes = 0;
					timesThatGoesIn+=1;
					for(int j = 0; j < (value.length-i) ; j++ ) {
						
						
						if(value[j]>value[j+1]) {
						
							double temp = value[j];
							value[j] = value[j+1];
							value[j+1] = temp;
							changes+=1;
							
							}
					
					
					
					}
					totalchanges+= changes;
					
			}
			String valueToPrint = "";
			for(int i=0; i < textValue.length;i++) { 
				
				valueToPrint += value[i] + " ";
			
				
			
			}
			double average = (totalchanges/timesThatGoesIn);
			df.setRoundingMode(RoundingMode.DOWN);
			
			String averageTxT = df.format(average);
			System.out.println(averageTxT + "-" + valueToPrint.trim());
			totalchanges = 0;
			amount+=1;
			}

		br.close();
		
		System.exit(0);
		
	}
}
