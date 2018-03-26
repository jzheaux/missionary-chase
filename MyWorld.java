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
        /*
        House house1 = new House();
        addObject(house1,100, 100);

        House house2 = new House();
        addObject(house2,225, 100);

        House house3 = new House();
        addObject(house3,225, 225);

        House house4 = new House();
        addObject(house4,100, 225);
        
        House house6 = new House();
        addObject(house6,450, 100);

        House house7 = new House();
        addObject(house7,450, 225);

        House house8 = new House();
        addObject(house8,575, 100);

        House house9 = new House();
        addObject(house9,575, 225);

        House house10 = new House();
        addObject(house10,800, 100);

        House house11 = new House();
        addObject(house11,800, 225);
        
        House house12 = new House(); 
        addObject(house12,800, 450);
        
        House house13 = new House(); 
        addObject(house13,800, 550);
        */
        int numberOfHouses = Greenfoot.getRandomNumber(4) + 2;
        for ( int i = 0; i < numberOfHouses; i++ ) {
            int x = Greenfoot.getRandomNumber(150) + 100;
            int y = Greenfoot.getRandomNumber(150) + 100;
            House h = new House();
            addObject(h, x, y);
            if ( h.isTouching(House.class) ) {
                removeObject(h);
            }
        }
    }

}
