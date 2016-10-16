#include <iostream>
using namespace std;

void rainbow()
{
    cout<< "Colours of the rainbow represented by: (ROY G BIV: enter 0 for red and 6 for violet"<<endl;
    enum colours
    {
        red=0,
        orange,
        yellow,
        green,
        blue,
        indigo,
        violet
    };
    cout<<"enter a colour to see if its in the rainbow (integer: red=0)"<<endl;
    int colnum=red;
    cin>>colnum;
    switch (colnum)
    {
        case red: case orange: case yellow: case green: case blue: case indigo: case violet:
            cout<<"its in the rainbow";
            break;
        default:
            cout<<"Its no in the rainbow, try again";
            break;
    }

}

int main()
{
    rainbow();
    return 0;
}
