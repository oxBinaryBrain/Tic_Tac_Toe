import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    char[][] board = new char[3][3];
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[row].length; col++) {
        board[row][col] = ' ';
      }
    }
    char player = 'X';
    boolean gameOver = false;
    Scanner scanner = new Scanner(System.in);

    while (!gameOver) {
      printBoard(board);
      System.out.print("Player " + player + " enter: ");
      int row = scanner.nextInt();
      int col = scanner.nextInt();
      System.out.println();

      if (board[row][col] == ' ') {
        board[row][col] = player; // place the element
        gameOver = haveWon(board, player);
        if (gameOver) {
          System.out.println("Player " + player + " has won: ");
        } else {
          // if (player == 'X') {
          // player = 'O';
          // } else {
          // player = 'X';
          // }
          player = (player == 'X') ? 'O' : 'X';
        }
      } else {
        System.out.println("Invalid move. Try again!");
      }
    }
    printBoard(board);
  }

  public static boolean haveWon(char[][] board, char player) {
}

  public static void printBoard(char[][] board) {

}
}
