public class enumCL {

    enum Apple{J,G,R,w,c}

    public static void main(String[] args) {
        Apple ap = Apple.valueOf("J");
        System.out.println(ap);
Apple arr[]=Apple.values();
        for (Apple a:arr) {
            System.out.println(a);
        }
        for (Apple a: Apple.values()) {
            System.out.print(a);

        }

    }
}
