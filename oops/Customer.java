class Customer{

    int id;
    String name;
    char gender;

    Customer(int id , String name, char gender){
        this.name=name;
        this.id=id;
        this.gender=gender;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    public String toString(){
        String s = this.name+"("+id+")";
        return s;
    }
}