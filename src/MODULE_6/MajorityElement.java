package MODULE_6;
public class MajorityElement {

    public static int findMajority(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int majority = findMajority(nums);
        System.out.println("Majority Element: " + majority);
    }
}