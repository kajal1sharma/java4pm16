class Area{
    int length;
    int breadth;

    void setDim(int len, int bred){
        length=len;
        breadth=bred;
    }

    int getArea(){
        int arr= length*breadth;
        return arr;
    }

    public static void main(String[] args) {
        Area a1= new Area();
        a1.setDim(10, 20);
        int result1=a1.getArea();
        System.out.println(result1);
         Area a2= new Area();
        a2.setDim(30, 40);
        int result2=a2.getArea();
        System.out.println(result2);
    }
}