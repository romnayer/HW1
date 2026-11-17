import java.util.Arrays;

public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        if (move == 0){
            return array;
        }
        if (array.length == 0){
            return array;
        }
        if (direction != 'R' && direction != 'L'){
            return array;
        }
        if (move < 0){
            move = -move;
            if (direction == 'R'){
               direction = 'L'; 
            }
            else {
                direction = 'R';
            }
        }
        move = move % array.length;
        for (int j = 0; j < move; j++){
            if (direction == 'R'){
                int last = array[array.length-1];
                for (int i = array.length-1; i > 0; i--){
                    array[i] = array[i-1]; 
                }
                array [0] = last;
            } else {
                int first = array[0];
                for (int i = 0; i < array.length-1; i++){
                    array[i] = array[i+1];
                }
                array[array.length-1] = first;
                
    
            
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}