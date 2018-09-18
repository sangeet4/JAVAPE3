package pe3;

public class ChessBoard{
    public final static int _SIZE = 8;

    String[][] chessBoard;

    public ChessBoard(){
        this.chessBoard = new String[_SIZE][_SIZE];
    }

    public String[][] getChessBoard(){
        return this.chessBoard;
    }

    public void makeChessBoard(boolean whiteStart){
        for(int i=0; i<_SIZE; i++){
            for(int j=0; j<_SIZE; j++){
                if(whiteStart == true)
                    this.chessBoard[i][j] = "WW";
                else
                    this.chessBoard[i][j] = "BB";
                whiteStart = !whiteStart;
                //System.out.print(this.chessBoard[i][j]+" ");
            }
            whiteStart = !whiteStart;
            //System.out.println();
        }
    }
}
