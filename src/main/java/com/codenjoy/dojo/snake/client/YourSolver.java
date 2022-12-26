package com.codenjoy.dojo.snake.client;

import com.codenjoy.dojo.client.Solver;
import com.codenjoy.dojo.client.WebSocketRunner;
import com.codenjoy.dojo.services.Direction;

public class YourSolver implements Solver<Board> {

  @Override
  public String get(Board board) {
    SmartSnake ss = new SmartSnake(board);
    Direction solved = ss.solve();
    return solved.toString();
  }

  public static void main(String[] args) {
    WebSocketRunner.runClient(
            "http://159.89.27.106/codenjoy-contest/board/player/gdlawuglfrw0s8kaxamn?code=4954977160920940786",
        new YourSolver(),
        new Board()
    );
  }
}
