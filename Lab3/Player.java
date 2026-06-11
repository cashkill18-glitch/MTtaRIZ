import java.util.Scanner;

class Player {
    private String name;
    private char symbol;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() { return name; }
    public char getSymbol() { return symbol; }

    public void printInfo() {
        System.out.println("Гравець: " + name + " | Символ: " + symbol);
    }

    public int[] makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(name + ", введіть рядок (1-3): ");
        int row = scanner.nextInt() - 1;
        System.out.print(name + ", введіть стовпець (1-3): ");
        int col = scanner.nextInt() - 1;
        return new int[]{row, col};
    }
}