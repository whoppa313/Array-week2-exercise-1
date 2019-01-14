package Lexicon_Java_victor.ArrayTesting;

import Java_Lexicon.Workshopv2.RandomNumberGen;

public class App 
{
    public static void main( String[] args )
    {

    	//first try with the number generator jar works.
    	
    	RandomNumberGen rng = RandomNumberGen.getInsance();
    	System.out.println(rng.getRandomIntBetween(13, 43));
    	
    	
    }
    
    private void stuff()
    {
    	int[] Array = new int[3];
    	Array[0]= 11;
    	Array[1]= 23;
    	Array[2]= 39;
    	System.out.println(Array[0]);
    	System.out.println(Array[1]);
    	System.out.println(Array[2]);
    }
}
