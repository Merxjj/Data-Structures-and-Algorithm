class Solution {
    public double myPow(double x, int n) {

        long power = n;

        if (power < 0) {
            return 1 / power(x, -power);
        }

        return power(x, power);
    }

    private double power(double x, long n) {

        if (n == 0)
            return 1;

        double halfPower = power(x, n / 2);

        double halfPowerSq = halfPower * halfPower;

        if (n % 2 != 0)
            return x * halfPowerSq;

        return halfPowerSq;
    }
}