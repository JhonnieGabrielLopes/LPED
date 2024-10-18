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
    int cod, quant;
    float vunit;
}cadastro;


int main()
{
    setlocale(LC_ALL,"portuguese");
    cadastro produto[4];
    float soma=0;
    int cont=0;
    inicio();
    linha();
    cout<<"||===CADASTRO DE PRODUTOS===||"<<endl<<"PARA CADASTRO DE UM PRODUTO, SERÁ NECESSÁRIO FORNECER, O CÓDIGO DO PRODUTO, VALOR UNITÁRIO E QUANTIA!"<<endl;
    linha();
    for(int i=0; i<4; i++){
    cout<<"CÓDIGO DO PRODUTO: ";
    cin>>produto[i].cod;
    cout<<"VALOR UNITÁRIO: R$";
    cin>>produto[i].vunit;
    cout<<"QUANTIDADE EM ESTOQUE: ";
    cin>>produto[i].quant;
    soma+=(produto[i].vunit*produto[i].quant);
    cont+=produto[i].quant;
    }
    system("cls");
    linha();
    cout<<"QUANTIDADE DE ITENS EM ESTOQUE: "<<cont<<"x"<<endl;
    cout<<"VALOR TOTAL EM ESTOQUE: R$"<<soma<<endl;
    linha();
    system("pause");
    return 0;
}