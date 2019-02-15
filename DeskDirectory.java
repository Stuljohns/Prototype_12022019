package com.example;

import java.util.*;

public class DeskDirectory {

    private ArrayList<Desk> directory;

    public DeskDirectory() {
        directory = new ArrayList<Desk>();
    }

    public void addDesk(Desk newDesk) {
        directory.add(newDesk);
    }

    public Desk getDeskAtIndex(int index) {
        return directory.get(index);
    }

    public void printAllDeskNames()
    {
        for (Desk desk : directory) {
            System.out.println(desk.getName());
        }
    }
    public Desk findDesk(String deskName) {
        boolean found = false;
        int index = 0;
        Desk currentDesk = null;

        while(index < directory.size() && !found)  // this will be true until the element is found or the collection runs out of elements
        {
            currentDesk = directory.get(index);  // gets the desk which is at the current position in the collection
            if(deskName.equals(currentDesk.getName()))
            {
                found = true;

            }

            else

            {

                // otherwise, increase the index to look at the next element within the list

                index++;

            }

        }



        if(found)

        {
            // tell the user the desk has been found and return the desk object
            System.out.println(deskName + " has been found");
            return currentDesk;
        }

        else

        {
            // tell the user the desk has not been found and return null
            System.out.println(deskName + " has not been found");
            return null;
        }
    }


}



