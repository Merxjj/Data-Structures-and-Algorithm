class Solution {
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        Collections.sort(robot);
        Arrays.sort(factory, (a, b) -> a[0] - b[0]);

        Long[][] dp = new Long[robot.size()][factory.length];
        return solve(0, 0, robot, factory, dp);
    }

    long solve(int i, int j, List<Integer> robot, int[][] factory, Long[][] dp) {
        if (i == robot.size()) return 0;
        if (j == factory.length) return Long.MAX_VALUE;

        if (dp[i][j] != null) return dp[i][j];

        long res = solve(i, j + 1, robot, factory, dp);

        long cost = 0;
        for (int k = 0; k < factory[j][1] && i + k < robot.size(); k++) {
            cost += Math.abs(robot.get(i + k) - factory[j][0]);
            long next = solve(i + k + 1, j + 1, robot, factory, dp);
            if (next != Long.MAX_VALUE) {
                res = Math.min(res, cost + next);
            }
        }

        return dp[i][j] = res;
    }
}