class Solution {
    public int[] replaceElements(int[] arr) {
        int value = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = value;
            value = Math.max(value, temp);
        }

        return arr;
    }
}

// class Solution {
//     public int[] replaceElements(int[] arr) {
        
//         int n = arr.length - 1;
//         int value = arr[n];
//         arr[n] = -1;
//         if (n == 0) {
//             return arr;
//         }

//         for (int i = n-1; i >= 1; i--) {
//             int temp = arr[i];
//             arr[i] = value;
//             if (temp > value) {
//                 value = temp;
//             } 
//         }
//         arr[0] = value;

//         return arr;
//     }
// }