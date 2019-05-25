package com.study.tdd.se.tictactoe;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class TicTacToeTest {

    private TicTacToe ticTacToe;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void setUp() {
        ticTacToe = new TicTacToe();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void whenXOutsideBoardThenRuntimeException() {
        exception.expect(RuntimeException.class);
        ticTacToe.play(5, 2);
    }

    @Test
    public void whenYOutsideBoardThenRuntimeException() {
        exception.expect(RuntimeException.class);
        ticTacToe.play(2, 5);
    }

    @Test
    public void whenOccupiedThenRuntimeException() {
        exception.expect(RuntimeException.class);
        ticTacToe.play(2, 1);
        ticTacToe.play(2, 1);
    }

    @Test
    public void givenFirstTurnWhenNextPlayerThenX() {
        Assert.assertEquals('X', ticTacToe.nextPlayer());
    }

    @Test
    public void givenLastTurnWasXWhenNextPlayerThen() {
        // X 先下,下了一子
        ticTacToe.play(1, 1);
        // 下一个下子的人是 O
        Assert.assertEquals('O', ticTacToe.nextPlayer());
    }

    /**
     * X 下子, O 下子,轮到 X 再次下子
     */
    @Test
    public void givenLastTurnWasOWhenNextPlayerThen() {
        ticTacToe.play(1, 1);
        ticTacToe.play(2, 2);
        Assert.assertEquals('X', ticTacToe.nextPlayer());
    }


}