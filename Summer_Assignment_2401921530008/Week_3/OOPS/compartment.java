import java.util.Random;
public abstract class compartment{
    public abstract String notice();
}
 class firstClass extends compartment{
    @Override
     public String notice(){
        return("you are in first class");
    }
}
 class Ladies extends compartment{
    @Override
     public String notice(){
        return("only females are allowed");
    }
}
 class general extends compartment{
    @Override
     public String notice(){
        return("you are in general class");
    }
}
 class luggage extends compartment{
    @Override
     public String notice(){
        return("this is the luggage compartment");
    }
}
class TestCompartment{
    public static void main(String[] args) {
        compartment[] train = new compartment[10];
        Random rnd = new Random();
        
        for (int i = 0; i < train.length; i++) {
            int r = rnd.nextInt(4) + 1;
            
            if (r == 1) train[i] = new firstClass();
            else if (r == 2) train[i] = new Ladies();
            else if (r == 3) train[i] = new general();
            else             train[i] = new luggage();
        }
        
        for (int i = 0; i < train.length; i++) {
            System.out.println("Compartment " + (i+1) + ": " + train[i].notice());
        }

    }
}
