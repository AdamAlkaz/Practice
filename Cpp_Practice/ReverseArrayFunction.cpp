// Example program
#include <iostream>
using namespace std;

void MakeArray()
{
    cout<< "enter how many values are in the array"<<endl;
    int num=0;
    cin>>num;
    float array[num]={0};
    for (int i=0; i<=num-1;i++)
    {
        cout<<"enter value "<<i+1<<" into the array: ";
        cin>>array[i];
        cout<<endl;
    }
    cout<<endl<<"the reverse order of the array is:"<<endl;
    for (int i=num-1;i>=0;i--)
    {
        if (i>0)
            cout<<array[i]<<", ";
        else if (i==0)
            cout<<"and "<<array[i];
    }
}

int main()
{
    MakeArray();
    return 0;
}
