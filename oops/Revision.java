//classes and object

class Phone{
    private int model;
    private String color;
    private int ram;
    private int camera;
    private int cost;

    Phone(){

    }
    public Phone(int model, String color, int ram, int camera, int cost){
        this.model=model;
        this.color=color;
        this.ram=ram;
        this.camera=camera;
        this.cost=cost;
    }
    public void setCamera(int camera) {
        this.camera = camera;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setModel(int model) {
        this.model = model;
    }
    public void setRam(int ram) {
        if(ram <=0){

        }
        else{
            this.ram = ram;
        }
        
    }
    public int getCamera() {
        return camera;
    }
    public String getColor() {
        return color+" color";
    }
    public int getCost() {
        return cost;
    }
    public int getModel() {
        return model;
    }
    public int getRam() {
        return ram;
    }


}

class Phone2 extends Phone{
    Phone2(){
        
    }
    Phone2(int model, String color, int ram, int camera, int cost){
        //super();
          super(model, color, ram, camera,cost);
        // this.color=color;
    }
}

class Phone3 extends Phone2{

}

public class Revision {
    public static void main(String[] args) {

        Phone p1= new Phone(123, "white", 4, 16, 8000);    
        // p1.ram=-20;
        p1.setRam(-20);
        Phone p2= new Phone(128, "white", 4, 16, 8000); 
        Phone p3= new Phone(178, "golden", 16, 32, 18000);         
        Phone2 p4 = new Phone2(156,"white", 86, 67, 90000);

        System.out.println(p4.getCamera());
    }    
}
