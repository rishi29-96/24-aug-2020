public class MultipleObject1 {
int x = 2;
    public static void main(String[] args) {
        MultipleObject1 myObj1 = new MultipleObject1();
        MultipleObject1 myObj2 = new MultipleObject1();
        myObj2.x = 23;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
    
}
