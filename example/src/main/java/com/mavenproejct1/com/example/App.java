package com.mavenproejct1.com.example;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        cupSize size = cupSize.medium;
        System.out.println(size);
        
        Puppy puppy1 = new Puppy("Chintu");
        puppy1.setPuppyAge(5);
        System.out.println(puppy1.puppyName + " is " + puppy1.getPuppyAge() +" years old ");
    }
}
