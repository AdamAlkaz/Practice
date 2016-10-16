#include <iostream>
using namespace std;

void MakeArray()
{
    cout<< "enter how many values are in the array"<<endl;
    int num=0;
    cin>>num;
    float array[num]={0};
    float rarray[num]={0};
    int fnum=0;
    int rnum=num-1;
    for (;;)
    {
        if (rnum==-1)
            break;
        cout<<"enter value "<<fnum+1<<" into the array: ";
        cin>>array[fnum];
        rarray[rnum]=array[fnum];
        cout<<endl;
        fnum++;
        rnum--;
    }
    cout<<endl<<"Array 1:       Array 2:"<<endl;
    for (int i=0;i<=num-1;i++)
    {
        cout<<array[i]<<"              "<<rarray[i]<<endl;
    }
}

int main()
{
    MakeArray();
    return 0;
}
