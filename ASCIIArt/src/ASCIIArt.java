/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void main (String [] args) {
		giraffehead();
		neck();
		body();
		legs();
		legs();
		System.out.println("");
		System.out.println("I made an ASCIIart Giraffe");
	}
	public static void giraffehead() {
		System.out.println(" /)ii/)");
		System.out.println("(o \" )");
	}
	public static void neck() {
		neckbase();
		neckbase();
		neckbase();
		neckbase();
		System.out.println("  |o|       ||");
	}
	public static void neckbase() {
		System.out.println("  | |");
	}
	public static void body() {
		System.out.println("  | |_______||");
		System.out.println("  |     o    |");
		System.out.println("  |       o  |");
		System.out.println("  | o__o_____|");
	}
	public static void legs() {
		System.out.println("  ||       ||");
		
	}
}