/*
1232. Check If It Is a Straight Line
Easy

1047

160

Add to List

Share
You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.

 

 

Example 1:



Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true
Example 2:



Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
Output: false
 

Constraints:

2 <= coordinates.length <= 1000
coordinates[i].length == 2
-10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
coordinates contains no duplicate point.
*/



class CheckStraightLine {
    public boolean checkStraightLine(int[][] coordinates){
     if(coordinates.length == 2){
         return true;
     }
        int dx = (coordinates[1][1] - coordinates[0][1]);
        int dy = (coordinates[1][0] - coordinates[0][0]);
        for(int i=2;i<coordinates.length;i++){
            if(dx*(coordinates[i][0] - coordinates[1][0])!=dy*(coordinates[i][1] -                coordinates[1][1])){
                return false;
            }
        }
            return true;
        }
}
