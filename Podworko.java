import greenfoot.*;
public class Podworko extends World
{   
    
    /**
     * Konstruktor obiektów klasy Podworko.
     */
    public Podworko()
    {    
        super(25, 20, 32); 
        prepare();
        dodajJedzenie();
        
        //tworzymy ogordzenie(pasek na górze i dole) dodając obiekty do sceny przez pętle-for
        for (int x=0; x<getWidth(); x ++ ) {
        addObject(new Ogrodzenie(), x, 0);
        addObject(new Ogrodzenie(), x, getHeight()-1);
        }
        //tworzymy granice(paski po bokach)
        for (int y=0; y<getHeight(); y ++) {
            addObject(new Ogrodzenie(), 0, y);
            addObject(new Ogrodzenie(), getWidth()-1,y);
        }
    }
    /**
     * Dodajemy jabłko do naszego podwórka
     */
    public void dodajJedzenie(){
        Jedzenie jablko = new Jedzenie();
        addObject(jablko,
             Greenfoot.getRandomNumber(getWidth()-4)+2,
             Greenfoot.getRandomNumber(getHeight()-4)+2); 

              
    }
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Bohater bohater = new Bohater();
        addObject(bohater, 3, 3);
        bohater.setImage("hedgehog.png");
    }
    
}
