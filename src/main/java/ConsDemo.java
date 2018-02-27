public class ConsDemo {
    public static void main(String args[]) {
        printMax(23,4,33,13,22,11,234,50);
        printMax(new double[]{3.5,6.7,8.9,11,23});
        Cake c1 = new Cake(1);
        Cake c2 = new Cake(2);
        Cake c3 = new Cake(3);

        c2 = c3 = null;
        System.gc(); //调用Java垃圾收集器

        System.gc();
    }
    public static void printMax(double... numbers){
        if (numbers.length == 0){
            System.out.println("No argument");
            return;
        }
        double result = numbers[0];
        for(double ele:numbers){
            System.out.println(ele);
        }
    }
    protected void finalize(){
        System.out.println("finalize");
    }

    }
class Cake extends Object {
    private int id;
    public Cake(int id) {
        this.id = id;
        System.out.println("Cake Object " + id + "is created");
    }

    protected void finalize() throws java.lang.Throwable {
        super.finalize();
        System.out.println("Cake Object " + id + "is disposed");
    }

}
