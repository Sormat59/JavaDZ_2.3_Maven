public class BonusService {
    public int calculate(int price, boolean registered) {
        int percent = registered ? 3 : 1;
        int miles = price * percent / 100 / 100;
        int limit = 500;
        if (miles > limit) {
            miles = limit;
        }
        return miles;
    }
}

