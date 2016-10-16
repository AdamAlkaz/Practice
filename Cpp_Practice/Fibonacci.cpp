#include <iostream>
using namespace std;

void Fibbon()
{
    cout<< "enter how many values of the fibonacci sequence you wish to display"<<endl;
    int num=0;
    cin>>num;
    int array[num]={0};
    int num1=0;
    int num2=1;
    for (int i=1;i<=num-1;i++)
    {
        array[i]=num1+num2;
        num2=array[i];
        num1=array[i-1];
    }
    cout<<"Total Sequence is:"<<endl;
    for (int i=0;i<=num-1;i++)
    {
        cout<<array[i]<<endl;
    }
}

int main()
{
    Fibbon();
    return 0;
}
