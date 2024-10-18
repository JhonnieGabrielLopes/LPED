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
typedef struct 
{
    int mes;
    double consumo, valorkw;
}energia;

int main()
{
    setlocale(LC_ALL,"portuguese");
    energia gst[4];
    double total=0;
    inicio();
    linha();
    cout<<"CONSUMO DE ENERGIA"<<endl;
    for(int i=0;i<4;i++){
        linha();
        cout<<"INFORME O NÚMERO DO MÊS: ";
        cin>>gst[i].mes;
        cout<<"INFORME A QUANTIA DE KWh USADA NESTE MÊS: ";
        cin>>gst[i].consumo;
        cout<<"INFORME O VALOR PAGO POR KWh NESTE MÊS: R$";
        cin>>gst[i].valorkw;
        total+=(gst[i].consumo);
    }
    system("cls");
    linha();
    for(int i=0;i<4;i++)
    cout<<"VALOR DA CONTA DO MÊS "<<gst[i].mes<<": R$"<<(gst[i].consumo*gst[i].valorkw)<<endl;
    cout<<"CONSUMO MÉDIO: "<<total/4<<"KWh"<<endl;
    linha();
    system("pause");
    return 0;
}