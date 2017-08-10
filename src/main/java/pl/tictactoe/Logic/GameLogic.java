package pl.tictactoe.Logic;

public class GameLogic {

    private char [][] screen =new char[3][3];
    private char x = 'X';
    private char o = 'O';
    private int temp=0;
    private String result;

    public String setScreen(int cordX, int cordY) {
        char character;
        String xOrY;
        if(temp%2==0)
        {
            character = x;
            xOrY = "X";
        }
        else {
            character = o;
            xOrY = "O";
        }
        screen[cordX][cordY] = character;
        temp++;

        return xOrY;
    }

    public  boolean gameOver() {
        boolean over = false;
        int ifWon1 = 0;
        int isWon2 = 0;
        int isWon3 = 0;
        int isWon4 = 0;

        for(int x=0; x<screen.length;x++) {

            for(int y=0; y<screen.length; y++) {
                ifWon1=0;
                for(int i=0;i<=3;i++) {

                    try{

                        if(screen[x][y]==screen[x+i][y] && screen[x][y]!='0') {
                            ifWon1++;
                        }
                        if(ifWon1==3) {
                            over = true;
                            this.checkWinner();
                            break;
                        }
                    }catch ( IndexOutOfBoundsException e){

                    }

                }
                isWon2=0;
                for(int i=0;i<=3;i++) {

                    try{

                        if(screen[x][y]==screen[x][y+i] && screen[x][y]!='0')
                            isWon2++;
                        if(isWon2==3) {
                            over = true;
                            this.checkWinner();
                            break;
                        }

                    }catch ( IndexOutOfBoundsException e){

                    }
                }

                isWon3= 0;

                for(int i=0;i<=3;i++) {
                    try{
                        if(screen[x][y]==screen[x+i][y+i] && screen[x][y]!='0')
                            isWon3++;
                        if(isWon3==3)  {
                            over = true;
                            this.checkWinner();
                            break;
                        }
                    }catch ( IndexOutOfBoundsException e){

                    }
                }

                isWon4=0;

                for(int i=0;i<=3;i++) {
                    try{
                        if(screen[x][y]==screen[x-i][y+i] && screen[x][y]!='0')
                            isWon4++;
                        if(isWon4==3) {
                            over = true;
                            this.checkWinner();
                            break;
                        }

                    }catch ( IndexOutOfBoundsException e){

                    }
                    if(temp==screen.length*screen.length) {
                        this.result="Remis";
                        over = true;
                        break;
                    }
                }
            }
        }
        return over;
    }

    private void checkWinner() {
        if(temp%2!=0)
            this.result = "Wygrał krzyżyk!";
        else
            this.result = "Wygrało kółko!";
    }

    public String getResult() {
        return result;
    }

    public void setScreen() {
        for(int i=0; i<screen.length; i++) {
            for(int j=0; j<screen.length; j++) {
                this.screen[i][j] = '0';
            }
        }
     }
}