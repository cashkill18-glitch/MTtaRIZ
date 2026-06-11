class Lab3 {
    public static void main(String[] args) {
        Board board = new Board();
        Player p1 = new Player("Гравець 1", 'X');
        Player p2 = new Player("Гравець 2", 'O');

        p1.printInfo();
        p2.printInfo();
        System.out.println();

        Player current = p1;

        while (true) {
            board.print();
            System.out.println();

            int[] move;
            boolean valid = false;
            while (!valid) {
                move = current.makeMove();
                valid = board.setMove(move[0], move[1], current.getSymbol());
            }

            if (board.checkWin(current.getSymbol())) {
                board.print();
                System.out.println("Win " + current.getName() + "!");
                break;
            }

            if (board.isFull()) {
                board.print();
                System.out.println("Нiчия!");
                break;
            }

            current = (current == p1) ? p2 : p1;
        }
    }
}