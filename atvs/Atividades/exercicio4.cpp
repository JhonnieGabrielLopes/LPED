#include <iostream>
#include <locale.h>

using namespace std;
typedef struct
{
    string nome;
    float nota[3], perc, media;
    int sit;
} info;
void linha()
{
cout<<"---------------------------------------------------------"<<endl;
}
void inicio()
{
    cout<<endl;
}
int main()
{
    setlocale(LC_ALL,"portuguese");
    info aluno[5];
    int i;
    inicio();
    linha();
    for(i=0; i<5; i++){
        linha();
        cout<<"ALUNO "<<i+1<<": ";
        cin>>aluno[i].nome;
        cout<<"INFORME AS TRÊS NOTAS DO ALUNO "<<i+1<<": *NOTA MAXIMA 20PTS*"<<endl;
        for (int j=0; j<3; j++){
            cin>>aluno[i].nota[j];
            aluno[i].media+=aluno[i].nota[j];
        }
        cout<<"INFORME A PORCENTAGEM DE FREQUÊNCIA DO ALUNO "<<i+1<<": ";
        cin>>aluno[i].perc;
        aluno[i].media=(aluno[i].media/20)*100;
        if(aluno[i].media>60&&aluno[i].perc>25){
            aluno[i].sit=1;
        }else aluno[i].sit=2;
    }
    system("cls");
    for(i=0; i<5; i++){
        linha();
        cout<<"Aluno: "<<aluno[i].nome<<endl;
        if(aluno[i].sit==1)
        cout<<"SITUAÇÃO: APROVADO!"<<endl;
        else cout<<"SITUAÇÃO: REPROVADO!"<<endl;
    }
    linha();
    system("pause");
    return 0;
}