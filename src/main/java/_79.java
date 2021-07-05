package main.java;

public class _79 {
        int rowLen;
        int colLen;
        public boolean exist(char[][] board, String word) {
            rowLen=board.length;
            colLen=board[0].length;
            for(int r=0;r<rowLen;r++){
                for(int c=0;c<colLen;c++){
                    if( dfs(r,c,board,word,0))
                        return true;
                }
            }
            return false;
        }

        private boolean dfs(int r, int c, char[][] board,String word,int index){
            if(index>=word.length())
                return true;
            if(r<0||c<0||r>=rowLen||c>=colLen||board[r][c]!=word.charAt(index))
                return false;
            board[r][c]='#';  // To mark visited. Also board[y][x] ^= 256; can be used
            boolean exist=dfs(r+1,c,board,word,index+1)
                    ||dfs(r-1,c,board,word,index+1)
                    ||dfs(r,c+1,board,word,index+1)
                    ||dfs(r,c-1,board,word,index+1);
            board[r][c]=word.charAt(index); // board[y][x] ^= 256; can be used
            return exist;

        }
    }
