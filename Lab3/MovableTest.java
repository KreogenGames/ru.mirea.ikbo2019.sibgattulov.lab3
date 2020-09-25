package Lab3;


public class MovableTest {
    MovablePoint movablePoint;

    public void setUp() {
        movablePoint = new MovablePoint(0, 0, 3, 2);
    }

    public void forMoveMethodsTest() {
        movablePoint.moveRight();

        movablePoint.moveLeft();

        movablePoint.moveUp();

        movablePoint.moveDown();

    }
}
