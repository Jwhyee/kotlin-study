package example.inflearn_starter.chap3.lect10;

public interface JavaFlyable {
    default void act() {
        System.out.println("파닥 파닥");
    }
}
