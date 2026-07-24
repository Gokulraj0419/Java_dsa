/*

Logical operators AND, OR, NOT are used in condition checking. Like a AND b checks if both a and b are true. a OR b checks if either of a or b is true. !a complements the boolean value of a.

In this question you basically need to do
a && b
a || b
!a

*/

class Solution {
    public String booleanOperations(boolean a, boolean b) {
        // Code here
        return (a & b) +" "+ (a | b) +" " + (!a);
    }
}