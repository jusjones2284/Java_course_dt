import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCar {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

        Collections.sort(nums);

        System.out.println(nums);
    }
}
