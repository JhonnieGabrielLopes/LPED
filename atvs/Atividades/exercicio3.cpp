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
    setlocale(LC_ALL,"portuguese");
    int matriz1[6][6], matriz2[6][6],matriz3[6][6];
    inicio();
    linha();
    cout<<"Insira os valores das matrizes: "<<endl;
    int i, j;
    for(i=0; i<6; i++){
            linha();
        for(j=0; j<6; j++){
            cout<<"Informe o valor da posição "<<i<<" coluna "<<j<<": ";
            cin>>matriz1[i][j];}}
            for(i=0; i<6; i++){
            linha();
        for(j=0; j<6; j++){
            cout<<"Informe o valor da posição "<<i<<" coluna "<<j<<": ";
            cin>>matriz2[i][j];
            }}
    system("cls");
    linha();
    cout<<"Soma das matrizez 1 e 2: "<<endl;
    cout<<"RESULTADO:"<<endl;
    for(i=0;i<6;i++){
            cout<<endl;
        for(j=0;j<6;j++){
            matriz3[i][j]=matriz1[i][j]+matriz2[i][j];
            cout<<matriz3[i][j]<<" ";
        }
    }
    linha();
    system("pause");
    return 0;
}