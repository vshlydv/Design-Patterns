package questions.snakeAndLadder.model;

import questions.snakeAndLadder.model.jump.Jump;
import questions.snakeAndLadder.model.jump.Ladder;
import questions.snakeAndLadder.model.jump.Snake;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Board {
    private int size;
    private Cell[][] cells;

    //TODO: try making Board a singleton object
    public Board(int size, int noOfSnakes, int noOfLadders) {
        this.size = size;
        initializeBoard(size);
        addSnakesAndLadders(size, noOfSnakes, noOfLadders);
    }

    private void initializeBoard(int size) {
        cells = new Cell[size][size];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                cells[i][j] = new Cell();
    }

    private void addSnakesAndLadders(int size, int noOfSnakes, int noOfLadders) {
        while (noOfSnakes > 0) {
            int start = ThreadLocalRandom.current().nextInt(1, size * size + 1);
            int end = ThreadLocalRandom.current().nextInt(1, size * size+ 1);

            if (end >= start || (getRowIndex(end) == size - 1 && getColumnIndex(end) == size - 1))
                continue;

            Jump snake = new Snake(start, end);
            cells[getRowIndex(end)][getColumnIndex(end)].setJump(snake);

            noOfSnakes--;
        }

        while (noOfLadders > 0) {
            int start = ThreadLocalRandom.current().nextInt(1, size + 1);
            int end = ThreadLocalRandom.current().nextInt(1, size + 1);

            if (end <= start || (getRowIndex(start) == 1 && getColumnIndex(end) == 1))
                continue;

            Jump ladder = new Ladder(start, end);
            cells[getRowIndex(start)][getColumnIndex(start)].setJump(ladder);

            noOfLadders--;
        }
    }

    private int getRowIndex(int pos) {
        return pos / size;
    }

    private int getColumnIndex(int pos) {
        return pos % size;
    }

}
