import greenfoot.*;
public class Bohater extends Actor
{
    /**
     * Act -to, co ma się wykonywać nieustannie
     */
    public void act() 
    {
        move(1);
        Greenfoot.setSpeed(30);
        sprawdzWcisnietyKlawisz();
        ogrodzenie();
    }    
       /**
     * Sprawdza czy klawisz został naciśniety.
     * Jezeli tak, wykonuje przypisane mu polecenie.
     */
    public void sprawdzWcisnietyKlawisz()
    {
        if (Greenfoot.isKeyDown("left")) 
        {
            turn(-90);
        }
        if (Greenfoot.isKeyDown("right")) 
        {
            turn(90);
        }
    }
    public void ogrodzenie(){
     if ( isTouching(Ogrodzenie.class) ) 
         {
             Greenfoot.stop();
            
         }  
        }
    }
