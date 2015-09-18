import greenfoot.*;

public class Jedzenie extends Actor
{
    private int zjedzoneJedzenie;
       public void act(){
         
        szukajJedzenie();
       
    }
    /**
     *  Kiedy bohater dotknie jabłko to jabłko zmieni położenie
     */
    public void szukajJedzenie()
       {
         if ( isTouching(Bohater.class) ) 
         {
             setLocation(
                Greenfoot.getRandomNumber(getWorld().getWidth()-5)+2,
                Greenfoot.getRandomNumber(getWorld().getHeight()-5)+2);
                
            zjedzoneJedzenie = zjedzoneJedzenie + 1;
            
            if (zjedzoneJedzenie == 10) 
            {
                Greenfoot.stop();
                Greenfoot.playSound("fanfare.wav");
            }
                
         }
      }  
}
