/**
 * Created by ggaddam on 8/21/2016.
 */
public class Adddigits {
        public int addDigits(int num) {
            if(num / 10 == 0) return num;

            int sum = 0;
            while(num > 0) {
                sum += num % 10;
                num /= 10;
            }

            return addDigits(sum);
        }
    }

