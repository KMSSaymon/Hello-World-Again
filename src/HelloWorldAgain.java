public class HelloWorldAgain {
    public int roll;
    public String name;
    public boolean passed;

    public HelloWorldAgain(){//constructor
        roll = 100;
        name = "CSE";
        passed = true;
    }
    public HelloWorldAgain(int roll, String name, boolean passed){//constructor
        this.roll = roll;
       this.name = name;
        this.passed = passed;
    }
    public boolean isPassed() {
        return passed;
    }
    public void setPassed(boolean passed) {
        this.passed = passed;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public int getRoll() {
        return roll;
    }
    public String getName(){
        return name;
   }
   public void setName(String name){
        this.name = name;
   }
    public static void main(String[] args)
    {
        HelloWorldAgain helloWorld = new HelloWorldAgain();
        HelloWorldAgain helloWorld2 = new HelloWorldAgain(300,"SHU",true);
        helloWorld.setName("ICE");
        helloWorld.setRoll(400);
        helloWorld.setPassed(false);
        System.out.println(helloWorld2.getName());
        System.out.println(helloWorld.getRoll());
        System.out.println(helloWorld2.isPassed());
    }
}