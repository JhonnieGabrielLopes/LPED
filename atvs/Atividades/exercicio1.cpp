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
    int A[6]={1,0,5,-2,-5,7}; //questão A
    int soma;
    soma=A[0]+A[1]+A[5];
    inicio();
    linha();
    cout<<"Questão 1/B: "<<soma<<endl; //questão B
linha();
    A[4]=100; //questão C
    cout<<"Questão 1/D:"<<endl;
    for (int i=0;i<6;i++)
    cout<<A[i]<<endl;
linha();
    int maior=0, menor=999;
    for (int i=0;i<6;i++){
        if (maior<A[i])
           maior=A[i];
        if (menor>A[i])
           menor=A[i];
    }
    cout<<"Questão 1/E:"<<endl;
     cout<<"MAIOR: "<<maior<<endl;
     cout<<"MENOR: "<<menor<<endl;
linha();
system("pause");
    return 0;
}