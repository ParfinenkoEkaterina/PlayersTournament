package Game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class GameTest {

    @Test

    public void testWhenFirstPlayerWin() {
        Game game = new Game();

        Player player1 = new Player(1, "Vasya", 150);
        Player player2 = new Player(2, "Valya", 130);

        game.register(player1);
        game.register(player2);

        int expected = 1;
        int actual = game.round("Vasya", "Valya");

        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void testWhenSecondPlayerWin() {
        Game game = new Game();

        Player player1 = new Player(1, "Vasya", 130);
        Player player2 = new Player(2, "Valya", 150);

        game.register(player1);
        game.register(player2);

        int expected = 2;
        int actual = game.round("Vasya", "Valya");

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testWhenDraw() {
        Game game = new Game();

        Player player1 = new Player(1, "Vasya", 130);
        Player player2 = new Player(2, "Valya", 130);

        game.register(player1);
        game.register(player2);

        int expected = 0;
        int actual = game.round("Vasya", "Valya");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenNoRegisteredFirst() {
        Game game = new Game();

        Player player1 = new Player(1, "Vasya", 130);
        Player player2 = new Player(2, "Valya", 150);

        game.register(player1);
        game.register(player2);


        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Valya", "Vadim");
        });


    }
}



