public class Lab2 {
    
    public static void main(String[] args) {
        Lab2 program = new Lab2();
        
        int height = 11;
        program.drawChristmasTree(height);
        
        System.out.println("\n=== Array ===");
        
        program.generateAndShowMatrix(3, 4);
    }
    
    // Малюю ялинку з зірочок
    public void drawChristmasTree(int n) {
        for (int row = 1; row <= n; row++) {
            // відступи
            for (int space = 0; space < n - row; space++) {
                System.out.print(" ");
            }
            
            // зірки
            for (int star = 0; star < 2 * row - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    // Створюю і заповнюю двовимірний масив
    public void generateAndShowMatrix(int r, int c) {
        int[][] arr = new int[r][c];
        int num = 0;
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = num;
                num = num + 3;
            }
        }
        
        // вивід
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}