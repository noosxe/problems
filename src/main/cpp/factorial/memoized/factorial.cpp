#include <iostream>

using namespace std;

const int MAXN = 10;
int dp[MAXN + 1];

int solve(int);

int main(void)
{
    for (int i = 0; i <= MAXN; i++)
    {
        dp[i] = -1;
    }

    cout << "Factorial = " << solve(10) << endl;
}

int solve(int x)
{
    if (x == 0)
    {
        return 1;
    }

    if (dp[x] != -1)
    {
        return dp[x];
    }

    return (dp[x] = x * solve(x-1));
}
