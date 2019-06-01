package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        boolean b = false;
        b = isDisagnol1('X');
        b = b || isDiagnol2('X');
        b = b || isColumn1('X');
        b = b || isRow('X');
        return b;
    }

    public Boolean isInFavorOfO() {
        boolean b = false;
        b = isDisagnol1('O');
        b = b || isDiagnol2('O');
        b = b || isColumn1('O');
        b = b || isRow('O');
        return b;
    }

    public Boolean isTie() {

        return !(isInFavorOfO() || isInFavorOfX());
    }

    public String getWinner() {
        String winner = "";
        if(isInFavorOfX()) {
            winner = "X";
        }
        else if(isInFavorOfO()) {
            winner = "O";
        }

        return winner;
    }

    public Boolean isDisagnol1(Character c) {
        for(int i = 0 ; i < matrix.length;i++){
            if(matrix[i][i] != c) {
                return false;
            }
        }
        return true;
    }
    public Boolean isDiagnol2(Character c) {
        for(int i = 0 ; i < matrix.length;i++){
            for(int j = 0; j < matrix.length; j++) {
               if(i+j == 2 && matrix[i][j] != c) {
                   return false;
               }

                }

            }

        return true;
    }
    public Boolean isColumn1(Character c) {
        for(int i = 0; i < matrix.length; i++) {
            boolean isColumnMatching = true;
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[j][i] != c) {
                    isColumnMatching = false;
                }
            }
            if (isColumnMatching) {
                return true;
            }
        }
        return false;
    }


    public Boolean isRow(Character c) {
        for(int i = 0; i < matrix.length; i++) {
            boolean isRowMatching = true;
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] != c) {
                    isRowMatching = false;
                }
            }
            if (isRowMatching) {
                return true;
            }
        }
        return false;
    }

}



