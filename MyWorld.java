import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 768, 1);
        setBackground("background.png");
    prepare();
}

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        House house19 = new House();
        addObject(house19,463,125);

        House house1 = new House();
        addObject(house1,100, 100);

        House house2 = new House();
        addObject(house2,200, 100);

        House house3 = new House();
        addObject(house3,400, 100);

        House house4 = new House();
        addObject(house4,500, 100);

        House house5 = new House();
        addObject(house5,100, 200);

        House house6 = new House();
        addObject(house6,100, 400);

        House house7 = new House();
        addObject(house7,100, 500);

        House house8 = new House();
        addObject(house8,200, 200);

        House house9 = new House();
        addObject(house9,700, 100);

        House house10 = new House();
        addObject(house10,800, 100);

        House house11 = new House();
        addObject(house11,700, 200);

        house7.setLocation(182,462);
        house8.setLocation(226,462);
    }
}
