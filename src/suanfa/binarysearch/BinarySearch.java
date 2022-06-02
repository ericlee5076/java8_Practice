package suanfa.binarysearch;


/**
 * 二分法查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
        Integer target = 9;
        Integer index = binarySearch(nums, target);
        if(index == -1){
            System.out.println( "数组中不存在值为["+ target +"]的元素!");
        }else{
            System.out.println( target + "的索引为===》》》" + index);
        }

    }


    private static Integer binarySearch(int[] nums, Integer target) {
        Integer left = 0;
        Integer right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            System.out.println("mid的值===》" + mid);
            if(nums[mid] == target){
                return  mid;
            }else if(target > nums[mid]){
                left = mid + 1;
                System.out.println("left的值===》" + left);
            }else if(target < nums[mid]){
                right = mid - 1;
                System.out.println("right的值===》" + right);
            }
        }
        return -1;
    }
}
