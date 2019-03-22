#include <iostream>

using namespace std;

const int MAXN = 10;

int main(void)
{
    int dp[MAXN + 1];

    dp[0] = 1;
    for (int i = 1; i <= MAXN; i++)
    {
        dp[i] = dp[i-1] * i;
    }

    cout << "Factorial = " << dp[MAXN] << endl;

    return 0;
}
