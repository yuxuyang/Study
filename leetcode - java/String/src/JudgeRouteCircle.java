/*
Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

Example 1:
Input: "UD"
Output: true
Example 2:
Input: "LL"
Output: false
 */
public class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        int result1 = 0;
        int result2 = 0;
        for (char target: moves.toCharArray() ){
            switch(target){
                case 'L' :result1++;
                    break;
                case 'R' :result1--;
                    break;
                case 'U' : result2++;
                    break;
                case 'D' : result2--;
                    break;
            }
        }
        return result1== 0 && result2==0;
    }
}
