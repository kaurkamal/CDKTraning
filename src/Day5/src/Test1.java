import org.junit.Assert;
import org.junit.Test;

/**
 * Created by soporis on 7/17/2017.
 */
public class Test1 {
    @Test
    public void Xwins() {
        Character expectedOutput = 'X';
        char[][] input = {{'X',' ','O'}, {'O','X','O'}, {'X',' ','X'},};
        Assert.assertEquals("X Wins", expectedOutput, TIcTacToe.output(input));
    }

    @Test
    public void inProgress() {
        Character expectedOutput = null;
        char[][] input = {{' ',' ',' '}, {'O',' ','O'}, {'X',' ',' '},};
        Assert.assertEquals("in progress", expectedOutput, TIcTacToe.output(input));
    }
    @Test
    public void OWins() {
        Character expectedOutput = 'O';
        char[][] input = {{'O','x',' '},
                {'O','x',' '},
                {'O',' ',' '},};
        Assert.assertEquals("O wins", expectedOutput, TIcTacToe.output(input));
    }
}