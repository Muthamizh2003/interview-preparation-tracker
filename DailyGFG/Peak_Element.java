//https://www.linkedin.com/posts/muthamizh-kumaran-l-05433724a_problemsolving-java-gfg160-activity-7273970297953763330-6cEP?utm_source=share&utm_medium=member_desktop
class Solution {

    public int peakElement(int[] arr) {
        // code here
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((mid == 0 || arr[mid - 1] < arr[mid]) && (mid == arr.length - 1 || arr[mid + 1] < arr[mid])) {
                return mid;
            }
            else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return -1; 
    }
}
