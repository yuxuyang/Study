/*
You are given a string representing an attendance record for a student. The record only contains the following three characters:
'A' : Absent.
'L' : Late.
'P' : Present.
A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

You need to return whether the student could be rewarded according to his attendance record.

Example 1:
Input: "PPALLP"
Output: True
Example 2:
Input: "PPALLL"
Output: False
 */
public class StudentAttendanceRecordI {
    public boolean checkRecord(String s) {
        char[] arr = s.toCharArray();
        int a = 0, l = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 'A'){
                a++;
                if(a > 1){
                    return false;
                }
                l = 0;
            } else if (arr[i] == 'L'){
                l++;
                if (l > 2){
                    return false;
                }
            } else {l = 0;}
        }
        return true;
    }
}
