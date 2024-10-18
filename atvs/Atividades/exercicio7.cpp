#include <iostream>
#include <locale.h>
#include <iomanip>
using namespace std;

void linha()
{
    cout<<"--------------------------------------------------"<<endl;
}
void inicio()
{
    cout<<endl;
}
typedef struct
{
    int hr,min,seg;
    int dia,mes,ano;
}data;
typedef struct
{
    data hrio;
    string comp;
    char desc[200];
}nota;
int main()
{
    setlocale(LC_ALL,"portuguese");
    nota agenda[3];
    int i;
    inicio();
    linha();
    cout<<"AGENDA"<<endl;
    linha();
    for(i=0;i<3;i++){
        cout<<"INFORME UM TITULO PARA O COMPROMISSO:  ";
        cin>>agenda[i].comp;
        cout<<"DESCRIÇÃO DO COMPROMISSO: "<<endl;
        cin.ignore();
        cin.getline(agenda[i].desc, 200);
        linha();
        cout<<"HORÁRIO:  (HH/MM/SS) "<<endl<<"HORA: ";
        cin>>agenda[i].hrio.hr;
        cout<<"MINUTOS: ";
        cin>>agenda[i].hrio.min;
        cout<<"SEGUNDOS: ";
        cin>>agenda[i].hrio.seg;
        linha();
        cout<<"DATA:  (DD/MM/AA) "<<endl<<"DIA: ";
        cin>>agenda[i].hrio.dia;
        cout<<"MÊS: ";
        cin>>agenda[i].hrio.mes;
        cout<<"ANO: ";
        cin>>agenda[i].hrio.ano;
    }
    cout<<endl;
    system("cls");
    linha();
    cout<<"AGENDA"<<endl;
    for(i=0;i<3;i++){
        cout<<endl<<"COMPROMISSOS"<<endl;
        cout<<agenda[i].comp<<endl<<endl<<"DESCRIÇAO"<<endl;
        cout<<agenda[i].desc<<endl<<endl<<"HORÁRIO"<<endl;
        cout<<agenda[i].hrio.hr<<":"<<setw(2)<<setfill('0')<<agenda[i].hrio.min<<":"<<setw(2)<<setfill('0')<<agenda[i].hrio.seg<<endl<<endl<<"DATA"<<endl;
        cout<<setw(2)<<setfill('0')<<agenda[i].hrio.dia<<"/"<<setw(2)<<setfill('0')<<agenda[i].hrio.mes<<"/"<<agenda[i].hrio.ano<<endl;
        linha();
    }
    system("pause");
    return 0;
}