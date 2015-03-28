package com.codykrauskopf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
	
	
	public static int getGCD(int a, int b){
		
		
		if (b == 0)
	        return a;
	    else
	        return getGCD(b, a % b);
		
		
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(scan.readLine());
		
		while(cases>0){
			
			String line = scan.readLine();
			String tokens[] = line.split("\\s+");
			int x = 1;
			for(int i=1;i<tokens.length; i++){
				if(i==1){
					
					 x = Integer.parseInt(tokens[1]);
					int y = Integer.parseInt(tokens[2]);
					System.out.println(x);
					System.out.println(y);
					if(y > x){
						int temp = y;
						y = x;
						x = temp;
					}
					x = getGCD(x,y);
					i++;
				}
				else{
					int y = Integer.parseInt(tokens[i]);
							
					if(y > x){
						int temp = y;
						y = x;
						x = temp;
					}
					x = getGCD(x,y);
				}
			}
			System.out.println(x);
			for(int i=1;i<tokens.length; i++){
				System.out.print( Integer.toString(Integer.parseInt(tokens[i])/x)+ " ");
				
			}
			System.out.println("");
			cases--;
		}
		
	}

}
