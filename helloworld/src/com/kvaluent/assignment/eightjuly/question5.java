package com.kvaluent.assignment.eightjuly;

import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the movie name");
			String mName = sc.nextLine();
      
			Movie obj = new Movie();
			obj.setHero("Tinku");
			obj.setHeroin("Kat");
			obj.setMovie_Name("avengers");
			obj.setYear(2022);
			
//			Movie m2  = new Movie();
//			m2.setHero("Chris Hemsworth");
//			obj.setHero("Tinku");
//			obj.setHeroin("Kat");
//			obj.setMovie_Name("Avengers");
//			obj.setYear(2022);

			//System.out.println(obj);

			if (mName.equals(obj.getMovie_Name())) {
				System.out.println( "Movie Name : " + obj.getMovie_Name() + "Hero Name : " + obj.getHero() + "  " + " Heroin Name : " + obj.getHeroin() + "  "
						+ " Year : " + obj.getYear());
			} else {
				System.out.println("Enter valid movie name");
			}
			sc.close();
		}

	}

	
