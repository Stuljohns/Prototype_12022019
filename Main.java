package com.example;

public class Main {

    public static void main(String[] args)
    {
        DeskDirectory desks = new DeskDirectory();
        Desk standardDesk1 = new Desk("Standard Desk 1", "Desk","It's A Desk!", 150, 345);
        desks.addDesk(standardDesk1);

        desks.addDesk(new Desk("Standard Desk 2","Desk","A New Improved Desk",200,250));
        desks.addDesk(new Desk("Right Hand Corner Desk","Desk","Desk for a Right Handed Corner",200,350));
        desks.addDesk(new Desk("Left Hand Corner Desk","Desk","Desk for a Left Handed Corner",200,350));

        desks.printAllDeskNames();

        ChairDirectory chairs = new ChairDirectory();
        Chair ironThrone = new Chair("Iron Throne", "Chair","Made From Melted Swords By A Dragon", 99999999.99, "Throne");


        chairs.addChair(ironThrone);
        chairs.addChair(new Chair("Standard Office Chair","Chair","This is a standard Office Chair",100,"Desk Chair"));
        chairs.addChair(new Chair("Meeting Room Chair","Chair","This is a standard Meeting Room Chair",100,"Meeting Room Chair"));

        chairs.printAllChairNames();



    }
}
