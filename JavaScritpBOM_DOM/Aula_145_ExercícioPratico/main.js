const title = document.getElementsByTagName("title");
const p1 = document.getElementById("p1");
const p2 = document.getElementById("p2");
const p3 = document.getElementById("p3");
const p4 = document.getElementById("p4");
const p5 = document.getElementById("p5");
const x = document.getElementById("p6");


title[0].innerHTML = "Aula 145 - Exercício Prático";

p1.innerHTML = screen.width;
p2.innerHTML = screen.height;

p3.innerHTML = screen.colorDepth;

p4.innerHTML =  window.location.pathname;
p5.innerHTML =  window.location.port;




function getLocation() {
    if( navigator.geolocation ){
        navigator.geolocation.getCurrentPosition(showPosition);
    }else{
        x.innerHTML = "Seu navegador não possui suporte para Geolocalização";
    }
}

function showPosition(position){
    x.innerHTML = "Latitude: " + position.coords.latitude + "<br>Longitude: " + position.coords.longitude;
}
