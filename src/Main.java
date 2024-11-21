//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    // 苹果10元/斤，草莓15元/斤，芒果20元/斤
    private static final double APPLE_PRICE = 10.0;
    private static final double STRAWBERRY_PRICE = 15.0;
    private static final double MANGO_PRICE = 20.0;
    
    // 草莓的折扣率
    private static final double STRAWBERRY_DISCOUNT = 0.8;

    // 满减条件和金额
    private static final double FULL_AMOUNT = 100.0;
    private static final double DISCOUNT_AMOUNT = 10.0;

    public static void main(String[] args) {
        // 1、A买5斤苹果和3斤草莓
        int appleCounts = 2;
        int strawberryCounts = 3;
        double cost1 = calculateTotalPrice(appleCounts, strawberryCounts);
        System.out.println("顾客A需要支付的总金额："+cost1+"元");

        // 2、B买2斤苹果，3斤草莓，和1斤芒果
        double cost2= calculateTotalCost(2, 3, 1);
        System.out.println("顾客B需要支付的总金额：" + cost2 + "元");


        // 3、C买2斤苹果，3斤草莓（8折），和1斤芒果
        double cost3 = calculateTotalCostWithDiscount(2, 3, 1);
        System.out.println("顾客C需要支付的总金额为：" + cost3 + "元");

        // 4、D买了3斤苹果，4斤草莓，和2斤芒果
        double cost4 = calculateTotalCostWithDiscountAndDeal(2, 4, 2);
        System.out.println("顾客D需要支付的总金额为：" + cost4 + "元");
    }

    /**
     * 1、计算苹果、草莓价格
     * @param appleCounts
     * @param strawberryCounts
     * @return 总价格
     */
    public static double calculateTotalPrice(int appleCounts, int strawberryCounts) {
        double totalPrice = appleCounts * APPLE_PRICE + strawberryCounts * STRAWBERRY_PRICE;
        return totalPrice;
    }

    /**
     * 2、计算苹果、草莓、芒果价格
     * @param apple
     * @param strawberry
     * @param mango
     * @return 总价格
     */
    public static double calculateTotalCost(int apple, int strawberry, int mango) {
        // 计算每种水果的总价，然后相加得到总价格
        double totalCost = (apple * APPLE_PRICE) + (strawberry * STRAWBERRY_PRICE) + (mango * MANGO_PRICE);
        return totalCost;
    }

    /**
     * 3、计算苹果、草莓、芒果价格，考虑草莓的折扣
     * @param apple
     * @param strawberry
     * @param mango
     * @return 总价格
     */
    public static double calculateTotalCostWithDiscount(int apple, int strawberry, int mango) {
        // 计算每种水果的总价，草莓使用打折后的价格
        double totalCost = (apple * APPLE_PRICE) + (strawberry * STRAWBERRY_PRICE * STRAWBERRY_DISCOUNT) + (mango * MANGO_PRICE);
        return totalCost;
    }

    /**
     * 4、计算苹果、草莓、芒果价格，考虑折扣
     * @param apple
     * @param strawberry
     * @param mango
     * @return 总价格
     */
    public static double calculateTotalCostWithDiscountAndDeal(int apple, int strawberry, int mango) {
        // 首先计算原始总价
        double cost = (apple * APPLE_PRICE) + (strawberry * STRAWBERRY_PRICE) + (mango * MANGO_PRICE);

        // 应用满减优惠(满单次)
        if (cost >= FULL_AMOUNT){
            cost -= DISCOUNT_AMOUNT;
        }
        return cost;
    }
}