// default public private protected

public class Computer {
    int ram;
    int cpu;
    int hdd;
    String brand;

    Computer(int ram , int cpu , int arg3, String brand){

        this.ram=ram;
        // ram=ram;
        this.cpu = cpu;
        hdd=arg3;
    }


    void getInfo(int brand){
        System.out.println(ram);
        System.out.println(this.cpu);
        System.out.println(this.hdd);
        System.out.println(brand);
        System.out.println(this.brand);

    }
}
