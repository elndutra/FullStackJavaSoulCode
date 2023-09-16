//Classes
class Animal {
    constructor(breed, age, type){
        this.breed = breed;
        this.age = age;
        this.type = type;
    }
}



class Dog extends Animal {
    constructor(name, breed, age, angry ){
        super(breed,age);
        this.name = name;
        this.angry = angry;
    }

    barks (){
        return "Au au au";
    }




}

class People {
    constructor(name,age,heigth){
        this.name = name;
        this.age = age;
        this.heigth = heigth;
    }
    sleep() {
        return "zzzzzzzzzzzzzzz";
    }
}


class Car {
    constructor (name, year) {

        this.name = name;
        this.year = year;
    }

    static speed() {

        return "Rum rum rum rum rum "
    }

}


class Professional extends People {
    constructor(name, age, heigth, profession){
        super(name, age, heigth); 
        this.profession = profession;

    }

    show(){
        return this.profession;
    }


}

let class1 = Animal;
let class2 = Dog;
let class3 = People;
let class4 = Car;
let class5 = Professional;


document.getElementById("demo1").innerHTML = "Essas são as cinco classes criadas em JavaScript <br>" + class1 +" <br> "+ class2 +" <br> "+ class3+" <br> "+ class4+" <br> "+ class5 ;


let elielton = new Professional("Elielton",33, 1.76,"Analisa de Suporte");

let myCar = new Car("Ford", 2008);

//const elielton = new People("Elielon", 33, 1.4);

document.getElementById("demo2").innerHTML = "Este é o  " + elielton.name + " " + "ele é um " + elielton.profession + " " + "e sua idade é " + elielton.age + "<p> " + 
    "Essa classe foi criada Herdando o nome idade e altura da classe People, a Classe Professional tem somente uma propriedade profeeison";

let dog = new Dog("Spike", "Pinsher",2,true)

document.getElementById("demo3").innerHTML = "Este é o meu chachorro " + dog.name + " " + "ele é um " + dog.breed + " " + "e sua idade é " + dog.age + " anos <p> " + 
    "Essa classe foi criada Herdando o raça e  idade da classe Animal, a Classe Dog tem somente uma propriedade nome e se o cachorro é bravo," +
    "nesse caso se o meu cachorro for bravo então angry é = " + dog.angry;




document.getElementById("demo4").innerHTML = "Vamos utilizar o metodo criado na Classe Car e Dog <p> Meu  cachorro  nesse momento está latindo olha o barulho do latido." + dog.barks() + "<p>Barulho foi emitido utilizando um metodo de Dog";

document.getElementById("demo5").innerHTML = "Vamos utilizar o metodo criado na Classe Car e Dog <p> Meu  " + myCar.name + " nesse momento está ligado olha o barulho do motor." + Car.speed() + "<p>Barulho foi emitido utilizando um metodo estático";


