class Customer{

    int id;
    Scanner name;
    char gender;

    Customer(int id , Scanner name, char gender){
        this.name=name;
        this.id=id;
        this.gender=gender;
    }
    public int getId() {
        return id;
    }
    public Scanner getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    public Scanner toString(){
        Scanner s = this.name+"("+id+")";
        return s;
    }
}