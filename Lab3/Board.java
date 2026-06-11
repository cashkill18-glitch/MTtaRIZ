class Board {
    private char[][] field;

    public Board() {
        field = new char[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                field[i][j] = '.';
    }

    public void print() {
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean setMove(int row, int col, char symbol) {
        if (row < 0 || row > 2 || col < 0 || col > 2 || field[row][col] != '.') {
            System.out.println("Невiрний хiд! Спробуй ще раз.");
            return false;
        }
        field[row][col] = symbol;
        return true;
    }

    public boolean checkWin(char symbol) {
        for (int i = 0; i < 3; i++) {
            if (field[i][0] == symbol && field[i][1] == symbol && field[i][2] == symbol) return true;
            if (field[0][i] == symbol && field[1][i] == symbol && field[2][i] == symbol) return true;
        }
        if (field[0][0] == symbol && field[1][1] == symbol && field[2][2] == symbol) return true;
        if (field[0][2] == symbol && field[1][1] == symbol && field[2][0] == symbol) return true;
        return false;
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (field[i][j] == '.') return false;
        return true;
    }
}