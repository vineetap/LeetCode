package main.java;

public class _1041 {
    public boolean isRobotBounded(String instructions) {
        int x=0;
        int y=0; // initial position

        int[][] dirs = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int currDirection = 0;  // north = 0, east = 1, south = 2, west = 3

        for(char c:instructions.toCharArray()){

            if(c=='L'){
                currDirection= (currDirection+3)%4 ; //mod 4 is because it should not be more than 4, +3 because                                                            // moving into 3rd quadrant
            }
            else if(c=='R'){
                currDirection= (currDirection+1)%4 ;
            }
            else {
                x+=dirs[currDirection][0];
                y+=dirs[currDirection][1];
            }
        }

        if(x==0 & y==0)
            return true; // returned to original position
        if(currDirection==0 & !(x==0 & y==0))
            return false;  // not returned to original position and pointing to same direction as starting point that                              //means its drifting away

        return true;

    }
}
