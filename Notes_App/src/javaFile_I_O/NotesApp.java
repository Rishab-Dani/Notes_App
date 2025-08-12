package javaFile_I_O;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotesApp {
	static Scanner sc = new Scanner(System.in);
	private static final String FILE_NAME = "notes.txt";
	public static void main(String[] args) throws IOException {
		
		System.out.println("************** Notes App *************");
		int Choice=0;
		do {
			System.out.println("1.Add Notes \n2.View Notes \n3.Exit");
			System.out.print(" Enter Your Choice :");
			Choice = sc.nextInt();
			
			switch(Choice) {
			
			case 1 -> addNote();
			case 2 -> viewNote();
			case 3 -> System.out.println("Successfully Exited from Note App !");
			default -> System.out.println("Invalid Option !");
			}
		}while(Choice!=3);

	}
	
	 public static void addNote() {
		 System.out.print("Enter your note: ");
	        String note = sc.nextLine();
              try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
	            writer.write(note + "\n");
	            System.out.println("Note added successfully.");
	        } catch (IOException e) {
	            System.out.println("Error writing to file: " + e.getMessage());
	        }
	}
	
	 public static void viewNote() throws IOException {
		
		 try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
	            String line;
	            System.out.println("\n--- Your Notes ---");
	            while ((line = reader.readLine()) != null) {
	                System.out.println("- " + line);
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("No notes found. Add some first!");
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	}

}
