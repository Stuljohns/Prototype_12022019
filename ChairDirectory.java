package com.example;

import java.util.*;

public class ChairDirectory {

    private ArrayList<Chair> directory;

    public ChairDirectory() {
        directory = new ArrayList<Chair>();
    }

    public void addChair(Chair newChair) {
        directory.add(newChair);
    }

    public Chair getChairAtIndex(int index) {
        return directory.get(index);
    }

    public void printAllChairNames()
    {
        for (Chair chair : directory) {
            System.out.println(chair.getName());
        }
    }
    public Chair findChair(String chairName) {
        boolean found = false;
        int index = 0;
        Chair currentChair = null;

        while(index < directory.size() && !found)  // this will be true until the element is found or the collection runs out of elements
        {
            currentChair = directory.get(index);  // gets the chair which is at the current position in the collection
            if(chairName.equals(currentChair.getName()))
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
            // tell the user the chair has been found and return the chair object
            System.out.println(chairName + " has been found");
            return currentChair;
        }
        else
        {
            // tell the user the chair has not been found and return null
            System.out.println(chairName + " has not been found");
            return null;
        }
    }
}

