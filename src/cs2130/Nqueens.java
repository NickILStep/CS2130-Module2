package cs2130;

public class Nqueens {

    private int n;
    int[] queens;

    public Nqueens(int n){
        this.n = n;
        queens = new int[n];
        for (int i = 0; i < n; i++) {
            queens[i] = -1;
        }
    }

    public int[] getQueens() {
        return queens;
    }

    public void setQueens(int[] queens) {
        this.queens = queens;
    }

    public void printSolution(){
        //TODO:
        /*Print the board using the positioning found in the
        queens array.  If queens[0] = -1 you should print "No solution"
        When printing the board use "|" to separate columns and
        new lines to separate rows.  Mark queens with a "Q" and empty
        squares with a " "
         */

        if(queens[0] == -1) {
            System.out.println("No solution");
            return;
        }

        for(int i = 0; i < queens.length; i++) {
            System.out.println(addSpace(queens[i]));
        }
    }

    public String addSpace(int spaces) {
        String line = "|";

        for(int i = 0; i < spaces; i++) {
            line += " |";
        }
        line += "Q|";

        for(int i = 0; i < queens.length - spaces - 1; i++) {
            line += " |";
        }
        
        return line;
    }

    boolean isValid(int rows){
        //TODO:
        /*Check if the positioning listed in the queens arrays is valid up to "rows"
        Ignore queens with an index >= rows.
        A valid position is one which does not share a column or diagonal with
        any other queen.
         */

        for(int i = 0; i < rows; i++) {
            int c1 = queens[i];
            int c2;
            for(int j = 0; j < i; j++) {
                c2 = queens[j];
                if(c1 == c2) {
                    return false;
                }
            }
        }

        for(int i = 0; i < rows; i++) {
            int d1 = i - queens[i];
            int d2;
            for(int j = 0; j < i; j++) {
                d2 = j - queens[j];
                if(d1 == d2) {
                    return false;
                }
            }
        }

        for(int i = 0; i < rows; i++) {
            int d1 = i + queens[i];
            int d2;
            for(int j = 0; j < i; j++) {
                d2 = j + queens[j];
                if(d1 == d2) {
                    return false;
                }
            }
        }

        return true;
    }


    private boolean backtrack(int row){

        if (row == n){
            return isValid(row);
        }
        for (int col = 0; col < n; col++) {
            queens[row] = col;
            if (isValid(row+1) && backtrack(row+1)){
                return true;
            }
            queens[row] = -1;
        }
        return false;
    }

    public void backtrackingFindSolution(){
        backtrack(0);
    }

    private boolean bruteforce(int row){
        if (row == n){
            return isValid(row);
        }
        for (int col = 0; col < n; col++) {
            queens[row] = col;
            if(bruteforce(row+1)){
                return true;
            }
            queens[row] = -1;
        }
        return false;
    }

    public void bruteForceFindSolution(){
        bruteforce(0);
    }


}
