var me = {
    name: 'Wiilliam',
    age: 17
};


function Checkout(person){
    console.log('Eu sou '+ person.name + ' e Tenho '+person.age+' anos.' );

    if(person.age >= 18){
        console.log('Você é maior de idade.');
    }
    else if(person.age < 18){
        console.log('Você não é maior de idade segundo a constituição do Brasil.');
    };
}

Checkout(me);