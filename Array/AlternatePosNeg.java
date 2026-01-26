package Array;

public class AlternatePosNeg {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, -5, 6, 7};

        int wrongIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (wrongIndex != -1) {
                if ((arr[wrongIndex] >= 0 && arr[i] < 0) ||
                    (arr[wrongIndex] < 0 && arr[i] >= 0)) {

                    int temp = arr[i];
                    for (int j = i; j > wrongIndex; j--)
                        arr[j] = arr[j - 1];
                    arr[wrongIndex] = temp;

                    if (i - wrongIndex >= 2)
                        wrongIndex += 2;
                    else wrongIndex = -1;
                }
            } else {
                if ((i % 2 == 0 && arr[i] < 0) ||
                    (i % 2 == 1 && arr[i] >= 0))
                    wrongIndex = i;
            }
        }

        for (int x : arr) System.out.print(x + " ");
    }
}

