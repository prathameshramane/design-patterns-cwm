package composite;

public class Main {
    public static void main(String[] args) {
        Group group1 = new Group();
        Shape shape1 = new Shape();
        Shape shape2 = new Shape();
        group1.add(shape1);
        group1.add(shape2);
        Group group2 = new Group();
        Shape shape3 = new Shape();
        Shape shape4 = new Shape();
        group2.add(shape3);
        group2.add(shape4);

        Group group3 = new Group();
        group3.add(group1);
        group3.add(group2);

        group3.render();
    }
}
