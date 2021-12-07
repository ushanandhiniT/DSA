package DSA;

public class ReverseArray {
        static void rvereseArray(int arr[], int start, int end)
        {
            int temp;

            while (start < end)
            {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        static void printArray(int arr[], int size)
        {
            for (int i = 0; i < size; i++)
                System.out.print(arr[i] + " ");

            System.out.println();
        }

        public static void main(String args[]) {
            int arr[] = {9,8,7,6,5, 4, 3,2};
            printArray(arr, 8);
            rvereseArray(arr, 0, 7);
            System.out.print("Reversed array is \n");
            printArray(arr, 8);

        }
    }



