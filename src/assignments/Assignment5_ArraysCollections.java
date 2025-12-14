package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment5_ArraysCollections {

	public static void main(String[] args) {
		
		System.out.println("**********************Q1*************************************");
		//1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.
		List<Long> areaOfCityArrayList = new ArrayList<Long>();
        areaOfCityArrayList.add(575300L);   // City 1
        areaOfCityArrayList.add(522700L);   // City 2
        areaOfCityArrayList.add(353010L);   // City 3
        areaOfCityArrayList.add(243569L);   // City 4
        areaOfCityArrayList.add(175300L);   // City 5
       
        // Calculate combined area
        Long combinedAreaArrayList = areaOfCityArrayList.get(2) + areaOfCityArrayList.get(3);
        
        System.out.println("Total area of 3rd and 4th cities (ArrayList): " + combinedAreaArrayList + " km²");
        
        System.out.println("**********************Q2*************************************");
        //2. Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
        List<String> touristAttractions = new ArrayList<String>();
        touristAttractions.add("Eiffel Tower");
        touristAttractions.add("Great Wall of China");
        touristAttractions.add("Statue of Liberty");
        touristAttractions.add("Colosseum");
        touristAttractions.add("Machu Picchu");
        touristAttractions.add("Christ the Redeemer");
        touristAttractions.add("Taj Mahal");
        touristAttractions.add("Pyramids of Giza");
        touristAttractions.add("Sydney Opera House");
        touristAttractions.add("Buckingham Palace");
		System.out.println(touristAttractions.size());
		System.out.println(touristAttractions);
		
        System.out.println("**********************Q3*************************************");
        //3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.
        int[] numbers = {10,20,30,40,50,60,70,80,90,100};
        
        int fifthValue = numbers[4];
        int sixthValue = numbers[5];
        
        int average = (fifthValue + sixthValue) / 2 ;
        
        System.out.println("Average of 5th and 6th Value:"+average);
        
        System.out.println("**********************Q4*************************************");
        //4. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
        List<String> movies = new ArrayList<String>();
        movies.add("Ne Zha 2");
        movies.add("Lilo & Stitch");
        movies.add("Zootopia 2");
        movies.add("A Minecraft Movie");
        movies.add("Jurassic World: Rebirth");
        
        System.out.println(movies.get(2));

	}

}
