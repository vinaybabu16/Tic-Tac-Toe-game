package UH.softwareDesign;

import com.UH.SoftwareDesign.NewGame;
import com.UH.SoftwareDesign.declareWin;
import com.UH.SoftwareDesign.selectBoard;
import org.junit.Assert;
/**
 * Created by vinay on 5/22/2017.
 */
public class TicTacToeTester {
    public void testArrayLength(){

        NewGame obj = new NewGame();
        char[][] locBoard = new char[3][3];
        Assert.assertEquals(3,obj.newGame(locBoard));
    }

    public void testcheckInCorrectWin () {
        declareWin objd = new declareWin();
        char[][] b1 = new char[][]{{'X', 'O', 'X'}, {'X', 'O', 'O'},
                {'O', 'X', 'X'}};
        int turnCount = 9;
        Assert.assertNotEquals(0,objd.declareWIn(b1,turnCount));
    }
    public void testArrayLengthNotEqual(){
        NewGame obj = new NewGame();
        char[][] locBoard = new char[6][6];
        Assert.assertNotEquals(12,obj.newGame(locBoard));
    }


    public void testIfRowCol(){
        selectBoard obj = new selectBoard();
        char[][] locBoard = new char[3][3];
        Assert.assertEquals(0,obj.selectBoard(locBoard)%2);
    }
    public void testIfRowColNotEqual(){
        selectBoard obj = new selectBoard();
        char[][] locBoard = new char[3][3];
        Assert.assertNotEquals(1,obj.selectBoard(locBoard)%2);
    }
    /*public void testIsDraw() {
        char[][] b = new char[][]{{'O', 'X', 'O'},
                {'O', 'X', 'X'}, {'X', 'O', 'O'}};

        char[][] b1 = new char[][]{{'O', 'X', 'O'},
                {'O', 'X', 'O'}, {'X', 'O', 'O'}};

        char[][] b2 = new char[][]{{' ', 'X', 'O'},
                {'O', 'X', 'X'}, {'X', ' ', 'O'}};

declareWin decobj= new declareWin();
        // Test case: board full, no winner.
        assertEquals(true ,decobj.declareWin();

        // Test case: board full, is winner
        assertEquals(false, t1.isDraw());

        // Test case: board is not full
        assertEquals(false, t2.isDraw());
    }
}*/
}
