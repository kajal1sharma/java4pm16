 class Human {

    int head;
    int leg;
    int hand;
    int organ;

    Human(int head, int leg , int hand, int organ){
        this.head = head;
        this.leg= leg;
        this.hand = hand;
        this.organ = organ;
    }
    void printInfo(){
        System.out.println(head);
        System.out.println(leg);
        System.out.println(hand);
        System.out.println(organ);

    }
}