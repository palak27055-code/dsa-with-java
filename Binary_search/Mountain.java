package Binary_search;

public class Mountain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 8, 7, 5, 3, 1};
        int ans = peakIndexMountain(arr);
        System.out.println(ans);
    }

    static int peakIndexMountain(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start< end) {
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
            // you are in dec part of array
            //this may be ans , but let's check left
            //this is ehy end != mid -1
            end = mid ;  
            }else{
                // you are in asc part of array
                start = mid +1;
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are equal
    }
}
