class Vehicle {
    protected String brand = "Ford"; //vehicle attribute
    public void honk() {            //vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args){
        //create a myCar object
        Car myCar = new Car();

        //call the honk method from the vehicle class on the myCar object
        myCar.honk();
        //display the value of the brand attribute(from the Vehicle class) and the value of the modelName from the Car class
        System.out.print(myCar.brand + " " + myCar.modelName);
    }
}
