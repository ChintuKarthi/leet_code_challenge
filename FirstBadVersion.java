/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while(start < end) {
            int middle = start + (end - start) / 2;
            if(isBadVersion(middle)) {
                end = middle;
            }
            else {
                start = middle + 1;
            }
        }
        return start;
    }
}
