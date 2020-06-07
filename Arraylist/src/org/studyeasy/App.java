package org.studyeasy;

import java.util.ArrayList;

public class App {
	
	static ArrayList<String> listName = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listName.add("Rohit");
		listName.add("Amith");
		listName.add("Vadiraj");
		listName.add("Shreyas");
		listName.add("Sharavan");
		listName.add("Suraj");
        App app = new App();
        app.displayList(listName);
        System.out.println("**************");
        int position = app.search("Suraj");
        if(position!=-1) {
        	app.modifyName(position, "Shishir");
            app.displayList(listName);
        }
        else {
        	System.out.println("Invalid Entry");
        }
	}
      
	void displayList(ArrayList<String> names)
	{
		for (String name : names)
			System.out.println(name);
	}
	int search(String name) {
		return listName.indexOf(name);
	}
	void modifyName(int position, String newName) {
		listName.set(position, newName);
	}
	}

