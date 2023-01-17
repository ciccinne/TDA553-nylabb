import java.util.ArrayList;

public class Loadable {
    private ArrayList<Car> carsLoaded = new ArrayList<>();
    private int lastIndex = carsLoaded.size() - 1;
    private Car currentCar;
    private int maxCars;
    private double x;
    private double y;


    public Loadable(int maxNrCars, double x, double y){
        this.maxCars =  maxNrCars;
        this.x = x;
        this.y = y;
    }

    public ArrayList<Car> getCarsLoaded() {
        return carsLoaded;
    }

    public void setX(double X) {
        this.x = X;
    }

    public void setY(double Y) {
        this.y = Y;
    }

    public boolean maxCars(){ //ge felmeddelande eller sluta load
        if (carsLoaded.size() == maxCars){
            return true;
        }else{
            return false;
        }
    }

    public void moveLoadedCars() {
        for (int i = 0; i < carsLoaded.size(); i++) {
            Car currentCar = carsLoaded.get(i);
            currentCar.setX(x);
            currentCar.setY(y);
        }
    }

    private boolean carClose(Car a){
        if (x - a.getX() > 0 && x - a.getX() < 5 && y - a.getY() > 0 && y - a.getY() < 5){ // Loadable:s position minus bilens position är mindre än 5 men större än 0.
            return true;
        }else {
            return false;
        }
    }

                               
    public void load(Car a) {
            if (!(maxCars())) {             // carsLoaded är inte full.
                if (carClose(a)) {          // carClose() true.
                    carsLoaded.add(a);
            }
        }
    }
   
    
    public void unLoad() {
            if (!(carsLoaded.size() == 0)) {                //Kan inte unload om carsLoaded är tom
                currentCar = carsLoaded.get(lastIndex);
                currentCar.setX(currentCar.getX() - 5);
                currentCar.setY(currentCar.getY() - 5);

                carsLoaded.remove(lastIndex);
        }
    }
}





    //void load(Car a);
    //void unLoad();



    
