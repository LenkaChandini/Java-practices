
public class Program {
    public static void main(String[] args) {
        int arr [] = {3, 7, 1, 2, 5, 2, 7, 6, 3, 3, 1, 4, 5, 6};

        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }

            int frequency = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    frequency++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " is repated fro " + frequency + " time(s)");
        }
    }
}