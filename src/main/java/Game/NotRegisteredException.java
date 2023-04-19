package Game;

public class NotRegisteredException  extends RuntimeException {

    public NotRegisteredException (int id) {
        super(" Игрок с id " + id + " не найден ");
    }
}
