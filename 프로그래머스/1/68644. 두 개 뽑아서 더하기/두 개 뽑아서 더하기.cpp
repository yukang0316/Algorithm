#include <string>
#include <vector>

#include<algorithm>
using namespace std;

vector<int> solution(vector<int> numbers) {
    vector<int> answer;
    int tmp;
    sort(numbers.begin(), numbers.end());

    for(int i= 0;i<numbers.size();i++)
        for (int j = i + 1; j < numbers.size(); j++)
        {
            tmp = numbers[i] + numbers[j];
            answer.push_back(tmp);
        }
    sort(answer.begin(), answer.end());
    answer.erase(unique(answer.begin(), answer.end()), answer.end());


    return answer;
}
