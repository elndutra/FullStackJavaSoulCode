const elemp = document.getElementsByTagName("p");


document.getElementById("demo6").innerHTML = "Aqui estamos colocando todos os conteúdo em um parágrafo só:" + elemp[0].innerHTML + " <br> " + elemp[1].innerHTML + " <br>" + elemp[2].innerHTML + "<br> " + elemp[3].innerHTML + "<br>" + elemp[4].innerHTML + "</b>";

document.getElementById("img").src = "../image/dom.png"


function validateForm(){
    let x = document.forms["myForm"]["fname"].value;
    let y = document.forms["myForm"]["fpws"].value;
    if(x  == "" || y == "" ){
        alert("Campo deve ser preenchido");
        return false;
    }
}

function displayDate(){
    document.getElementById("demo7").innerHTML = Date();
    }

    function displayMenssage(){
        document.getElementById("demo8").innerHTML = "Uma mensagem aplicada pelo botão";
        }