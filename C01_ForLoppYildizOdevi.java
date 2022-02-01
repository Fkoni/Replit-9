package _00Replit;

import java.util.Scanner;

public class C01_ForLoppYildizOdevi {

	public static void main(String[] args) {
		//kullanicidan pozitif bir rakam girmesini isteyin
		//girilen rakama gore asagidaki sekli cizdirin
		//*
		//* *
		//* * *
		//* * * *
		
	/*	for( int i = 1 ; i <= 10 ; i++ )
		{
		for (int j = 1 ; j <= i ; j++ )
		{
		label1.Text += "* ";
		}

		label1.Text += "\n";
		}
	*/	
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		@SuppressWarnings("unused")
		int satir = scan.nextInt();
		
			
		for (int i =1; i <=4; i++ ) {
			
			for (int j = 1;  j<=i; j++) {
			System.out.print("*");
			
			}
			System.out.print("\n");	
		
		}
		
	
		scan.close();
				
	}

}
