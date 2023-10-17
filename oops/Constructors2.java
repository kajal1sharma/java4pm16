
class Tree{
    int branches;
    int leaves;
    String color;
    int fruit;
    int flowers;

    // Tree(){}=> default constructor
    Tree(){

    }
    Tree(int branchesnum){
        branches=branchesnum;
    }
    Tree(int branches, int leaves, String color, int fruit, int flowers ){

        this.branches=branches;
        this.leaves = leaves;
        this.color=color;
        this.fruit=fruit;
        this.flowers=flowers;
        
        //    branches=branches;
    //    int a=90;
    //    a=a;
    }

    void printInfo(){
        System.out.println("==============================");
        System.out.println("number of fruits "+this.fruit);
        System.out.println("number of flowers "+this.flowers);
        System.out.println("number of branches "+this.branches);
        System.out.println("color of Tree "+this.color);
        System.out.println("==============================");
    }
}

class Constructors2{
    public static void main(String[] args) {
        Tree obj1= new Tree();
        Tree obj2 = new Tree(34);
        Tree obj3 = new Tree(12,23,"green",43,23);
        Tree obj4 = new Tree(34, 10, "red", 20, 30);
        obj4.printInfo();
        obj3.printInfo();
    }
}