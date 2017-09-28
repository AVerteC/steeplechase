
/**
 * Write a description of class Racer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import kareltherobot.*;
import java.awt.Color;



     public class SteepleChaser extends Robot    
  {

    public SteepleChaser(int st, int av, Direction d, int b)
        {
          super(st, av, d, b);
            //initialise instance variables
             
        }
        //int height = 1;
        
        public void turnRight() 
        {
            turnLeft();
            turnLeft();
            turnLeft();        
        }

        public void turnAround()
        {
            turnLeft();
            turnLeft();
        }

        public void moveMile()
        {
            move();
            move();
            move();
            move();
            move();
            move();
            move();
            move();
        }

        public void sensemove()
        {
            //3 types of hurdle height (1,2,3)
            if (frontIsClear())
            {
            move();
            turnRight();
            move();
            move();
            } 

        }

        public void hurdleLeft()
        {
            //height = 1;
        int height = 1;    
            while (! frontIsClear())   
                {
                    //int height;
                    turnLeft();
                    move();
                    turnRight();
                    height++;
                }
        
            move();   
        turnRight();
        
            
           
        for ( int count = 1 ;count <= height - 1; count++  )
                {  
                    move();
                    
                }
        turnLeft();    
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                /*
                move();   
                turnRight();
        
           
           
        for ( int count = -1;count < height; count++  )
                {  
                    move();
                    
                }
        turnLeft();
        */    
        }
        
        
       
       
        public void reset()
        {
        
         /*
        move();   
        turnRight();
        
           
           
        for ( height; move(); )
                {  
                    move();
                    
                }
        turnLeft();
         
             
            
        
           */
       }
       
     
      
        
        public void emptyMove()
        {
        while (frontIsClear())
        {
            move();
        }  
        }
        public static void main(String [] args)
        {
          SteepleChaser ko = new SteepleChaser (1, 1, East, 0);
          ko.emptyMove();
          
          ko.hurdleLeft();
          
          ko.emptyMove();
          
          ko.hurdleLeft();
          
          ko.emptyMove();
          
          ko.hurdleLeft();
          
          ko.emptyMove();
          
          ko.hurdleLeft();
          
          ko.emptyMove();
          
          ko.hurdleLeft();
          
          //ko.reset();
          
          //ko.turnLeft();
          //ko.turnLeft();
          //ko.emptyMove();
          
          
          /*
          ko.emptyMove();
          ko.hurdleLeft();
          ko.reset();
          ko.turnLeft();
          ko.emptyMove();
          
          
          
          
          
          
          
          /*
          ko.reset();
          ko.turnLeft();
          ko.emptymove();
          ko.numreset();
          */
          
          
        }

    static
    {
        
        World.reset();
        World.readWorld("hurdles.kwld");
        World.setBeeperColor(Color.red);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10); 
        World.setVisible(true);
    }   


}

/*      init/ test/ increment
 *  for ( int count = 1; count <= 3 ,count++)
 *      {
 *      turnLeft();
 *      }
 *      
 *   booleans go in for loops
 *      count = count + 2;
 *      count--
 *
 *  while (frontIsClear())
 *      {
 *          move();
 *       }
 *
 *      faceNorth()
 *      {
 *          while(!facingNorth())
 *              {
 *                  turnLeft();
 *               }
 *               
 *       }
 */

    


