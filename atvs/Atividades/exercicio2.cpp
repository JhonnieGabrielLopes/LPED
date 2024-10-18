#include <iostream>
#include <locale.h>

using namespace std;

void linha()
{
    cout<<"-----------------------------------------"<<endl;
}
void inicio()
{
    cout<<endl;
}
int main()
{
    system("cls");
    int mat[4][4];
    inicio();
    linha();
    cout<<"Informe os valores da matriz!"<<endl;
    for (int i=0; i<4; i++){
        linha();
            for(int j=0; j<4; j++){
        cout<<"Informe o valor da linha "<<j+1<<" na coluna "<<i+1<<": ";
        cin>>mat[i][j];
        }
    }
    system("cls");
    for (int i=0; i<4; i++){
        cout<<endl;
            for(int j=0; j<4; j++)
    cout<<mat[i][j]<<"; ";}
    cout<<endl;
    linha();
    system("pause");
    return 0;
}