// 5 Objetos criados

const person = {
    firstName: "Elielton",
    lastName: "Dutra",
    age: 30,
};

const car = {
    marca: "Ford",
    modelo: "KA",
    ano: 2009
};

const computer = {
    marca: "Dell",
    modelo: "3420",
    tipo: "Notebook",
    get notebook () {
        return this.marca + " " + this.modelo;
   }

};

const cachorro = {
    animal: "Cachorro",
    raca: "Vira Lata",
    idade: 2
   
};

 const cardapio = {
    prato: "Fejoada",
    preco: "20",
    get fullPrato () {
        return this.prato + " que custa " + this.preco + " R$";
   }
};

 //Objeto criado com construtor 

 function Person( first, last, age, eye){
    this.firstName = first;
    this.lastName = last;
    this.age = age;
    this.eyeColor = eye;
    

 };

 console.log("Estes são os cincos objetos criados ");
 console.log(person,car,computer,cachorro,cardapio);


 console.log("Criando objetos com construtores ")

 const MyFather = new Person("Arlindo", "Paiva", 68, "Azul");
 const MyMother = new Person("Maria", "de Lourdes", 64, "Rosa");

 console.log("Os dois objetos criados com constutores.");
 console.log(MyFather, MyMother);


 console.log("Agora estou realizado a impressão dos dados do objetos percorrendo por ele.")
 for ( let x in MyFather) {
    console.log(MyFather[x]);
 }

 for ( let x in car) {
    console.log(car[x]);
 }



console.log ("Imprimindo informações de objeto por meio de acesso.")
console.log(computer.notebook)
console.log(cardapio.fullPrato)
