

public class CarRepairShop  {
    private Loadable load;

    public CarRepairShop(int maxNrCars, double x, double y){
        this.load = new Loadable(maxNrCars, x, y);
    }

    public void load(Car a) {    
        load.load(a);
    }

    public void unLoad(){
        load.unLoad();
    }
    

}
