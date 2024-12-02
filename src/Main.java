import java.util.Locale;

      //задание 1
class Student {
    String name;
    String surname;
    String address;
    int id;

    public Student(String name, String surname, String address, int id) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Студент: " + name + " " + surname + ", Адрес: " + address + ", ID: " + id;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Алиса", "Смит", "Коктем-2", 24);
        Student student2 = new Student("Азамат", "Иванов", "Алмалы", 25);
        Student student3 = new Student("Кристина", "Петрова", "Самал-1", 26);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}

 //задание 2

class Triangle {
    double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateArea() {
        double s = (a + b + c) / 2; // Полупериметр
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Формула Герона
    }

    public double calculatePerimeter() {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Периметр треугольника: " + triangle.calculatePerimeter());
        System.out.println("Площадь треугольника: " + triangle.calculateArea());
    }
}

     //задание 3

class Rectangle {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double returnArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, 9);
        Rectangle rect2 = new Rectangle(10, 14);

        System.out.println("Площадь прямоугольника 1: " + rect1.returnArea());
        System.out.println("Площадь прямоугольника 2: " + rect2.returnArea());
    }
}

           //задание 4
           class Average {
               public static void calculateAndPrintAverage(int a, int b, int c) {
                   double average = (a + b + c) / 3.0;
                   System.out.println("Среднее значение: " + average);
               }
           }

public class Main {
    public static void main(String[] args) {
        Average.calculateAndPrintAverage(10, 20, 30);
    }
}


           //home work 5
           class Movie {
               String title;
               String studio;
               String rating;

               // Конструктор с тремя параметрами
               public Movie(String title, String studio, String rating) {
                   this.title = title;
                   this.studio = studio;
                   this.rating = rating;
               }

               // Конструктор с двумя параметрами
               public Movie(String title, String studio) {
                   this(title, studio, "PG");
               }
           }

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Фокус", "RatPac-Dune Entertainment", "R");
        Movie movie2 = new Movie("Главный герой", "20th Century Studios");

        System.out.println("Фильм 1: " + movie1.title + ", Студия: " + movie1.studio + ", Рейтинг: " + movie1.rating);
        System.out.println("Фильм 2: " + movie2.title + ", Студия: " + movie2.studio + ", Рейтинг: " + movie2.rating);
    }
}


























