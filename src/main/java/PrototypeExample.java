public class PrototypeExample {

    public static void main(String[] args) {
        Circle circle1 = new Circle(10, 20, 5);
        System.out.println("Circle 1: " + circle1);

        Circle circle2 = (Circle) circle1.clone();
        System.out.println("Circle 2: " + circle2);
    }

    // Prototype interface
    public interface Prototype {
        public Prototype clone();
    }

    // Concrete prototype class
    public static class Circle implements Prototype {
        private int x, y, radius;

        public Circle(int x, int y, int radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        @Override
        public Prototype clone() {
            return new Circle(x, y, radius);
        }

        @Override
        public String toString() {
            return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
        }
    }
}
