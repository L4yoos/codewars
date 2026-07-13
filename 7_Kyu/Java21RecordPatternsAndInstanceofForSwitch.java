// https://www.codewars.com/kata/6a3e71c30deee590ca66d415

// Java 21 added the new features
//
// Pattern Matching for switch (JEP 441) and
// Record Patterns (JEP 440).
// They help to write better readable code with data-oriented programming, avoiding long if-else chains with heavy instanceof checks and type casts like
//
// if (obj instanceof MyClass) {
//    MyClass x = (MyClass) obj;
//    ...
// } else if (obj instanceof MyRecord) {
//    MyRecord r = (MyRecord) obj;
//    int p1 = r.parameter1();
//    long p2 = r.parameter2();
//    ...
// }
// and replace it by
//
// switch(obj) {
//    case MyClass x -> ...
//    case MyRecord(int p1, long p2) -> ...
//    ...
// }
// which is far more readable, isn't it?
//
// Task
// You are given the following record definitions in preloaded
//
// record Point(int x, int y) {}
// record Rectangle(int width, int height) {}
// record Circle(int radius) {}
// record CenteredCircle(Point center, int radius) {}
// and an implemented function describeShape, heavily using the above mentioned instanceof/cast/fieldaccess pattern and you should rewrite it using the mentioned new Java features.
//
// Output and Tests
// The outputs of the functions should look like
//
// null --> "null"
// new Point(0, 0) --> "Point(0,0)"
// new Rectangle(10, 1) --> "Rectangle 10x1"
// new Circle(1) -->"Circle r=1"
// new CenteredCircle(new Point(1, 2), 3) --> "CenteredCircle((1,2), r=3)"
// other object type --> "unknown"
// To keep you terse, your code is only allowed to contain at most 7 semicolons (;).
//
// The tests check that you are using a switch expression or statement and record component accessors or destructuring instead of field access.

public class Kata {
    public static String describeShape(Object obj) {
        switch (obj) {
            case Point p -> {
                return "Point("+ p.x() +"," + p.y() + ")";
            }
            case Rectangle r -> {
                return "Rectangle "+r.width()+"x"+r.height();
            }
            case Circle c -> {
                return "Circle r=" + c.radius();
            }
            case CenteredCircle cc -> {
                Point center = cc.center();
                return "CenteredCircle(("+center.x()+","+center.y()+"), r="+cc.radius()+")";
            }
            case null -> {
                return "null";
            }
            default -> {
                return "unknown";
            }
        }
    }
}