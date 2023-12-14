public class Main {
    public static void main(String[] args) {
        Originator org = new Originator();
        CareTaker ct = new CareTaker();

        org.setContext("A");
        ct.push(org.createState());
        org.setContext("B");
        ct.push(org.createState());
        org.setContext("C");

        org.restore(ct.pop());
        System.out.println(org.getContext());
    }
}
