//  Essa é a funça callback

function myDisplayer (some){
    document.getElementById("demo1").innerHTML = "Aqui foi criado uma funça simples de soma que retorna o resulta da soma de 5 + 4, que é " + some + "<p>" +
    "Neste caso usamos duas funções sequencias uma que calcula e a outra que exibe em HTML";

}

function myCalculator( num1, num2 ) {

    let sum = num1 + num2;
    return sum;
}

let result = myCalculator(5,5);
myDisplayer(result);


//----------------------------------------------------------------------------------

function myDisplayer2(somenthing) {
    document.getElementById("demo2").innerHTML = "Agora criamos uma função callback, neste exemplo ele faz o mesmo que a anterior uma soma, usamos o mesmo valor 5 + 5 com o resultado "+ somenthing + "<p>" +
        "Mas agora utilizanzamos uma função como parametro para executar, então uma tarefa será executada somente se outra for executada.";
}

function myCalculator2(num1, num2, myCallback) {
    let sum2 = num1 + num2;

    myCallback(sum2);
}

myCalculator2( 5, 5, myDisplayer2);

//Promises -------------------------------------------------------------------------------------

function myDisplayer(some){
    document.getElementById("demo3").innerHTML = some;
}

let myPromise = new Promise(function(myResolve, myReject){
    let x = 0;
    if (x == 0) {
        myResolve("OK");
    }else{
        myReject("Error");
}
});

myPromise.then(
    function(value) {myDisplayer(value);},
    function(error) {myDisplayer(error);}

);

//async e outra com await ------------------------------------------------
// function myFunction(){

//     return Promise.resolve("Hello!");
// }


// async function myFunction(){
//     return "Hello!";
// }

async function myDisplayer(){
    let myPromise= new Promise(function(resolve,reject){
        resolve("Recebido a promises!!!");
    });

    document.getElementById("demo4").innerHTML = "Aqui esperamos a promises logo após e exibida a mensagem " + await myPromise ;
}


myDisplayer()