package OOP;

public class This {
    public static class Car{
        int price;
        String name ;

//     CONSTRUCTOR -> Same name constructors with different parameters

        Car(){ // Default Constructor -> nahi likhte toh bhi yahi run krtaa

        }

        Car(int price, String name){
            this.price = price;
            this.name = name;
        }

        Car(String y , int x){
            price = x ;
            name = y ;
        }

        void print(){
            int price = 12;
            System.out.println(this.price + " " + name);
        }

    }


//  ORDER IS SENSITIVE IN METHODS
//    this -> JIS OBJECT NE CALL LAGAI WOH WALA THIS , USKE JO BOX HAI ....


    public static void main(String[] args) {


        Car c1 = new Car();
        c1.print();


        c1.name = "Defender";
        c1.price = 15000000;
        c1.print();

        Car c2 = new Car(400000,"Tata Nano");
        c2.print();

        Car c3 = new Car(1500000,"Thar");
        c3.print();

        Car c4 = new Car("Lord Alto",500000);
        c4.print();


    }
}
