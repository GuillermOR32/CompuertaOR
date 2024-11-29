public class TablaMultiplicar {
    public static void main(String[] args) {
        int size = 100; 
        int[][] tabla = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                tabla[i][j] = (i + 1) * (j + 1); 
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%6d", tabla[i][j]); 
            }
            System.out.println();
        }
    }
}
