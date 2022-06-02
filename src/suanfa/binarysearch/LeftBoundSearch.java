package suanfa.binarysearch;


/**
 * 左边界二分法查找
 */
public class LeftBoundSearch {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,2,3,3};
        Integer target = 3;
        Integer index = left_bound_search2(nums, target);
        if(index == -1){
            System.out.println( "数组中查询不到值为["+ target +"]的元素!");
        }else{
            System.out.println( target + "最左边的索引为===》》》" + index);
        }

    }

    /**
     * right = nums.length时
     * @param nums
     * @param target
     * @return
     */
    private static Integer left_bound_search1(int[] nums, Integer target) {
        if(nums.length == 0){
            return -1;
        }
        if(target < nums[0] || target > nums[nums.length - 1]){
            return -1;
        }

        Integer left = 0;
        Integer right = nums.length;
        while (left < right){
            //正常写法：
            //int mid = (right + left) / 2;
            //防止right + left 的和超出整数int的最大值,故可以使用下面的写法，先减，再除，最后加；
            int mid = left + (right - left) / 2;
            System.out.println("mid的值===》" + mid);
            if(target == nums[mid]){
                // 搜索区间变为[left, mid)
                // 按道理这里的搜索区区间应该包含mid,即搜索区间应该是[left, mid + 1)，
                // 但是该循环的条件是left < right，当left == right时，会跳出循环；
                right = mid;
            }else if(target > nums[mid]){
                //搜索区间变为[mid + 1, right)
                left = mid + 1;
                System.out.println("left的值===》" + left);
            }else if(target < nums[mid]){
                //注意：不能写成right = mid - 1;
                //由于初始值right = nums.length,那么搜索区间变为[left, mid)
                right = mid;
                System.out.println("right的值===》" + right);
            }
        }

        //最终再次判断一次得到的值是否等于target
        if(nums[left] != target){
            return -1;
        }
        return  left;
    }

    /**
     * right = nums.length - 1时
     * @param nums
     * @param target
     * @return
     */
    private static Integer left_bound_search2(int[] nums, Integer target) {
        // 检查数组
        if(nums.length == 0){
            return -1;
        }

        // 检查target越界问题
        // 1：当给出target = 10时，方法应该返回-1，表示查询不到；
        // 2：当给出target = 0时，方法应该返回-1，表示查询不到；
        if(target < nums[0] || target > nums[nums.length - 1]){
            return -1;
        }

        Integer left = 0;
        Integer right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            System.out.println("mid的值===》" + mid);
            if(target == nums[mid]){
                //由于查询的是左边界，所有缩小右侧边界，搜索区间变为[left, mid - 1]
                right = mid - 1;
            }else if(target > nums[mid]){
                //缩小左侧边界，搜索区间变为[mid + 1, right]
                left = mid + 1;
                System.out.println("left的值===》" + left);
            }else if(target < nums[mid]){
                //锁定左侧边界，缩小右侧边界，搜索区间变为[left, mid - 1]
                right = mid - 1;
                System.out.println("right的值===》" + right);
            }
        }

        //最终再次判断一次得到的值是否等于target
        if(nums[left] != target){
            return -1;
        }
        return left;

    }
}
