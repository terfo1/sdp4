
interface fruit{
    void fruit();
}
class apple implements fruit{
    public void fruit(){
        System.out.println("Apple created");
    }
}
class pear implements fruit{
    public void fruit(){
        System.out.println("Pear created");
    }
}
class fruitfactory{
    public fruit createfruit(String a){
        if(a=="apple"){
            return new apple();
        }
        else if(a=="pear"){
            return new pear();
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        fruitfactory fac=new fruitfactory();
        fruit apple=fac.createfruit("apple");
        fruit pear=fac.createfruit("pear");
        apple.fruit();
        pear.fruit();
    }
}