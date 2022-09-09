public class test{
    public static void main(String args[]) {
        myArray(3);
    }
    static int[][] myArray(int size) {
        int[][] stdArray = new int[size][];
        int val = 2;
        for (int i = 0; i < stdArray.length; i++) {
            stdArray[i] = new int[i + 1];
            for (int j = 03 ;j < stdArray[i].length; j++) {
                stdArray[i][j] = val++;
                System.out.print(stdArray[i][j] +" " );
            }
        System.out.println(stdArray[i][j]);
      }

        return stdArray;
      }
}
