package Big_O_notation;

public class Main {
    public static void main(String[] args) {
        // O(1)
        System.out.printf("Hello and welcome!");
    }

    public void log(Integer[] numbers, String[] names) {
        // O(n) - constant time
        System.out.println(numbers[0]);

        // O(n)
        System.out.println(numbers[0]);
        System.out.println(numbers[0]);

        // O(n) - n represent the size of the input, it increases linear
        // 0(1 + n + 1) -> 0(n)
        System.out.println(); // 0(1)
        for (int i = 0; i < numbers.length; i++) { // 0(n)
            System.out.println(numbers[i]);
        }
        System.out.println(); // 0(1)

        // 0(n+m) -> 0(n)
       for (Integer number : numbers)  // 0(n)
           System.out.println(number);

        for (String name : names)  // 0(m)
            System.out.println(name);

        // ----------

        // 0(n^2) - algorithm runs in quadratic time, when input grows,this becomes much slower
        for (int first : numbers) // 0(n)
            for (int second : numbers) // 0(n)
                System.out.println(first + second);

        // logarithmic grow (faster than linear)
        // binary search - 1m items / 19 comparison to find a number in a sorted array

        //  2^n exponential time - very slow, opposite of algorithmic grow

        //  constant O(1)
        //  logarithmic O(log n)
        //  linear  O(n)
        //  quadratic O(n^2)
        //  exponential O(2^n)
    }
}
