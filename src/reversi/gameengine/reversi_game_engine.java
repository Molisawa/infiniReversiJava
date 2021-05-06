/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package reversi.gameengine;

public class reversi_game_engine {
  public static void setCustomBoardState(Board board) {
    reversi_game_engineJNI.setCustomBoardState(Board.getCPtr(board), board);
  }

  public static void initializeGame(Board board, int size, int difficulty, boolean custom, Player player1, Player player2) {
    reversi_game_engineJNI.initializeGame(Board.getCPtr(board), board, size, difficulty, custom, Player.getCPtr(player1), player1, Player.getCPtr(player2), player2);
  }

  public static void initializeBoard(Board board) {
    reversi_game_engineJNI.initializeBoard(Board.getCPtr(board), board);
  }

  public static int getNumberOfMoves(Board board, int pieceType) {
    return reversi_game_engineJNI.getNumberOfMoves(Board.getCPtr(board), board, pieceType);
  }

  public static int getPointEvaluator(Board board, int pieceType) {
    return reversi_game_engineJNI.getPointEvaluator(Board.getCPtr(board), board, pieceType);
  }

  public static int getScorePosition(Board board, int pieceType) {
    return reversi_game_engineJNI.getScorePosition(Board.getCPtr(board), board, pieceType);
  }

  public static Movement getAllPossibleMoves(Board board, int pieceType) {
    long cPtr = reversi_game_engineJNI.getAllPossibleMoves(Board.getCPtr(board), board, pieceType);
    return (cPtr == 0) ? null : new Movement(cPtr, false);
  }

  public static void goBack(Board board) {
    reversi_game_engineJNI.goBack(Board.getCPtr(board), board);
  }

  public static void goForward(Board board) {
    reversi_game_engineJNI.goForward(Board.getCPtr(board), board);
  }

  public static boolean canGoBack(Board board) {
    return reversi_game_engineJNI.canGoBack(Board.getCPtr(board), board);
  }

  public static boolean canGoFoward(Board board) {
    return reversi_game_engineJNI.canGoFoward(Board.getCPtr(board), board);
  }

  public static Movement getJavaPossibleMovements(Board board, int pieceType, int index) {
    return new Movement(reversi_game_engineJNI.getJavaPossibleMovements(Board.getCPtr(board), board, pieceType, index), true);
  }

  public static Piece getJavaState(Board board, int x, int y) {
    return new Piece(reversi_game_engineJNI.getJavaState(Board.getCPtr(board), board, x, y), true);
  }

  public static void setEditorPieceType(Board board, int x, int y, int pieceType) {
    reversi_game_engineJNI.setEditorPieceType(Board.getCPtr(board), board, x, y, pieceType);
  }

  public static PlayerType nextTurn(Board board) {
    return PlayerType.swigToEnum(reversi_game_engineJNI.nextTurn(Board.getCPtr(board), board));
  }

  public static String saveGame(Board board) {
    return reversi_game_engineJNI.saveGame(Board.getCPtr(board), board);
  }

  public static Board loadGame(String filename) {
    return new Board(reversi_game_engineJNI.loadGame(filename), true);
  }

  public static boolean isValidMove(Board board, Movement lastMove) {
    return reversi_game_engineJNI.isValidMove(Board.getCPtr(board), board, Movement.getCPtr(lastMove), lastMove);
  }

  public static boolean isGameOver(Board board) {
    return reversi_game_engineJNI.isGameOver(Board.getCPtr(board), board);
  }

  public static int getWinner(Board board) {
    return reversi_game_engineJNI.getWinner(Board.getCPtr(board), board);
  }

  public static void SetHelpers(Board board, PlayerType player) {
    reversi_game_engineJNI.SetHelpers(Board.getCPtr(board), board, player.swigValue());
  }

  public static void cleanHelpers(Board board) {
    reversi_game_engineJNI.cleanHelpers(Board.getCPtr(board), board);
  }

  public static void makeMove(Board board, Movement lastMove) {
    reversi_game_engineJNI.makeMove(Board.getCPtr(board), board, Movement.getCPtr(lastMove), lastMove);
  }

  public static void makeRealMove(Board board, Movement lastMove) {
    reversi_game_engineJNI.makeRealMove(Board.getCPtr(board), board, Movement.getCPtr(lastMove), lastMove);
  }

  public static void removeHistoryFoward(Board board) {
    reversi_game_engineJNI.removeHistoryFoward(Board.getCPtr(board), board);
  }

  public static Movement randomMovement(Board board, PlayerType arg1) {
    return new Movement(reversi_game_engineJNI.randomMovement(Board.getCPtr(board), board, arg1.swigValue()), true);
  }

  public static Board copyBoard(Board board) {
    return new Board(reversi_game_engineJNI.copyBoard(Board.getCPtr(board), board), true);
  }

  public static void destructBoard(Board board) {
    reversi_game_engineJNI.destructBoard(Board.getCPtr(board), board);
  }

  public static int MinimaxSolver(int depth, int alpha, int beta, Board board, int arg4, PlayerType arg5) {
    return reversi_game_engineJNI.MinimaxSolver(depth, alpha, beta, Board.getCPtr(board), board, arg4, arg5.swigValue());
  }

  public static Movement bestMinimaxMove(Board board, PlayerType arg1) {
    return new Movement(reversi_game_engineJNI.bestMinimaxMove(Board.getCPtr(board), board, arg1.swigValue()), true);
  }

  public static void computerMove(Board board, PlayerType player) {
    reversi_game_engineJNI.computerMove(Board.getCPtr(board), board, player.swigValue());
  }

  public static boolean canMove(Board board, int pieceType) {
    return reversi_game_engineJNI.canMove(Board.getCPtr(board), board, pieceType);
  }

  public static Movement bestMove(Board board, PlayerType player) {
    return new Movement(reversi_game_engineJNI.bestMove(Board.getCPtr(board), board, player.swigValue()), true);
  }

  public static int canSkipBlackPiece(Board board) {
    return reversi_game_engineJNI.canSkipBlackPiece(Board.getCPtr(board), board);
  }

  public static int getScore(Board board, int pieceType) {
    return reversi_game_engineJNI.getScore(Board.getCPtr(board), board, pieceType);
  }

}
