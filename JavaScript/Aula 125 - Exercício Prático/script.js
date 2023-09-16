
function myFunction1(){
    const inpObj = document.getElementById("id1");
    if ( !inpObj.checkValidity()){
        document.getElementById("demo").innerHTML = inpObj.validationMessage;
    }else{
        document.getElementById("demo").innerHTML = "Input ok!!";
    }

}


function myFunction2(){
    let text;
    if(document.getElementById("id2").validity.rangeUnderflow){
        text = "Valor muito pequeno!";
    }else{
        text = "Input ok!";
    }
    document.getElementById("demo2").innerHTML = text;
}
//HystoryAPI

function myFunctionButton (){
    window.history.back();
}

function myFunctionButton2 (){
    window.history.go(-2);
}

//Geolocalização


const x = document.getElementById("demo3");


function getLocation() {
    if( navigator.geolocation ){
        navigator.geolocation.getCurrentPosition(showPosition);
    }else{
        x.innerHTML = "Seu navegador não possui suporte para Geolocalização";
    }
}

function showPosition(position){
    x.innerHTML = "<table class='tb' ><tr><th>Latitude</th><th>Longitude</th></tr><tr><td>" + position.coords.latitude + "</td><td>" + position.coords.longitude + "</td></tr></table>";
}
