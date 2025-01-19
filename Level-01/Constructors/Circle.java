package Learn;


    class Circle {
        double radius;


        public Circle() {
            this(1.0);
        }


        public Circle(double radius) {
            this.radius = radius;
        }

        public static void main(String[] args) {
            Circle circle = new Circle();
            System.out.println(circle.radius);
        }

    }
