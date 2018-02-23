package com.codelib.java.sample.test;

public class RabbitBirth {

    /**
     * 兔子繁殖问题。设有一对新生兔子，从第三个月开始他们每个月都生一对兔子。
     * 新生的兔子从第三个月开始又每个月生一对兔子。
     * 按此规律，并假定兔子没有死亡，20个月后共有多少个兔子？
     * 
     * @param initRabbitNum 一开始兔子数量
     * @param birthMonthNum 要生兔子月数
     * @param intervalMonth 间隔月数
     */
    public int rabbitBirth(int initRabbitNum, int birthMonthNum, int intervalMonth) {
        int sum = 0;
        int[] rabbits = new int[intervalMonth];
        rabbits[intervalMonth - 1] = initRabbitNum;
        for (int i = 0; i < birthMonthNum; i++) {
            giveBirth(rabbits, intervalMonth);
        }
        for (int i = 0; i < intervalMonth ; i++) {
            sum += rabbits[i];
        }
        return sum;
    }
    
    private void giveBirth(int[] rabbits, int intervalMonth) {
        for (int i = 0; i < intervalMonth - 1; i++) {
            rabbits[i] = rabbits[i] + rabbits[i + 1];
            rabbits[i + 1] = 0;
        }
        rabbits[intervalMonth - 1] = rabbits[0];
    }
    
    public static void main(String[] args) {
        RabbitBirth rabbitBirth = new RabbitBirth();
        int sum = rabbitBirth.rabbitBirth(2, 5, 3);
        System.out.print("共：" + sum + "只；");
        System.out.println("共：" + (sum / 2) + "对");
    }
}
