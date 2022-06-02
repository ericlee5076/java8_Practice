package suanfa.binarysearch;


/**
 * 右边界二分法查找
 */
public class RightBoundSearch {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,3};
        Integer target = 2;
        Integer index = right_bound_search2(nums, target);
        if(index == -1){
            System.out.println( "数组中查询不到值为["+ target +"]的元素!");
        }else{
            System.out.println( target + "最右边的索引为===》》》" + index);
        }

    }

    /**
     * right = nums.length时
     * @param nums
     * @param target
     * @return
     */
    private static Integer right_bound_search1(int[] nums, Integer target) {
        if(nums.length == 0){
            return -1;
        }
        if(target < nums[0] || target > nums[nums.length - 1]){
            return -1;
        }

        Integer left = 0;
        Integer right = nums.length;
        while (left < right){
            int mid = left + (right - left) / 2;
            System.out.println("mid的值===》" + mid);
            if(target == nums[mid]){
                left = mid;
            }else if(target > nums[mid]){
                left = mid + 1;
                System.out.println("left的值===》" + left);
            }else if(target < nums[mid]){
                right = mid - 1;
                System.out.println("right的值===》" + right);
            }
        }

        if(nums[right] != target){
            return -1;
        }
        return right;
    }

    /**
     * right = nums.length - 1时
     * @param nums
     * @param target
     * @return
     */
    private static Integer right_bound_search2(int[] nums, Integer target) {
        if(nums.length == 0){
            return -1;
        }
        if(target < nums[0] || target > nums[nums.length - 1]){
            return -1;
        }

        Integer left = 0;
        Integer right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            System.out.println("mid的值===》" + mid);
            if(target == nums[mid]){
                left = mid + 1;
            }else if(target > nums[mid]){
                left = mid + 1;
                System.out.println("left的值===》" + left);
            }else if(target < nums[mid]){
                right = mid - 1;
                System.out.println("right的值===》" + right);
            }
        }

        return right;
    }
}
