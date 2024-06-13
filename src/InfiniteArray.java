public class InfiniteArray {
    public static void main(String[] args) {
     int[] nums= {2,4,5,6,8,9,12,13,15,17,18,20,23,26,30};
             int target = 20;
        System.out.println(ans(nums,target));
    }

    static int ans(int[] nums, int target){
       // binarySearch()
        int start = 0;
        int end= 1;
        while (target>=nums[end]){
           int newstart=end+1;
            end = end + (end - start + 1) * 2;
            start = newstart;
        }
        return binarySearch(nums,target,start,end);
    }
    static int binarySearch(int[] nums, int target,int start,int end){
        end = nums.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(target<nums[mid]){
                end = mid - 1;
            } else if (target>nums[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
