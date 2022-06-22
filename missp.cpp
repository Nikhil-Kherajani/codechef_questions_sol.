#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        vector<int> v;
        for (int i = 0; i < n; i++)
        {
            int k;
            cin >> k;
            v.push_back(k);
        }
        sort(v.begin(), v.end());
        v.push_back(0);
        
        for (int i = 0; i < n; i = i + 2)
        {
            if (v[i] != v[i + 1])
            {
                cout << v[i] << endl;
                break;
            }
        }
    }
    return 0;
}