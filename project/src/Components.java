public class Components {
    private int milk = 100;
    private int grains = 100;
    private int water = 100;

    public void setMilk(int a){
        milk = milk - a;
    }
    public void setMilk2(int a){
        milk = milk + a;
    }
    public int getMilk(){
        return milk;
    }
    public void setGrains(int a){
        grains = grains - a;
    }
    public void setGrains2(int a){
        grains = grains + a;
    }
    public int getGrains(){
        return grains;
    }
    public void setWater(int a){
        water = water - a;
    }
    public void setWater2(int a){
        water = water + a;
    }
    public int getWater(){
        return water;
    }
}
