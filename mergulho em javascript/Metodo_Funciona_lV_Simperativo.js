var me = {
    name: 'Wiilliam',
    age: 17
};

//FUNÇÕES PURAS. QUE NÃO ALTERAM O VALOR DO OBJETO
function pureFunction(person){
    return 18 - person.age;

    
};

var remainingYears = pureFunction(me);
console.log('Função pura '+remainingYears);


//FUNÇÃO IMPURA - GERA EFEITOS COLATERAIS
function impureFunction(person){
    console.log(person.age = person.age -1);
};


impureFunction(me);