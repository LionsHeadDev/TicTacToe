import javax.swing.JButton;

public class TicTacToe {
    public static void main(String[] args) {
        String [][] grid = {{"-", "-", "-"}, 
                            {"-", "-", "-"}, 
                            {"-", "-", "-"}};

        for (int i = 0; i < grid.length; i++) {
            System.out.println();
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
        }        
       
    }
}