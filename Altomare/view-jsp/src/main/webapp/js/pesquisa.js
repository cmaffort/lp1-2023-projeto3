

document.body.onload = adcElemento;

function  adcElemento(){
var cardEl = document.createElement('div');
cardEl.style = 'background-color: rgb(217, 217, 217);box-shadow:0 0 15px 7px rgba(0,0,0,0.06);border-radius:10px;width: 300px;padding: 2%;margin: 2%;';
var img = document.createElement('img');
img.src = 'imagens/leme.png';
img.style = 'height: 200px;';
//var nome= document.creatElement('p');
 //nome.innerHTML = 'Doris';
cardEl.appendChild(img);
 var nome = cardEl.textContent = "Nome:Doris\n\r\Cpf:xx.xxx.xxx";
 nome.style = 'float:right;';

//cardEl.appendChild(nome);
cardEl.appendChild(img);

//cardEl.appendChild(nome);

var divAtual = document.getElementById("div1");
document.body.insertBefore(cardEl, divAtual);
}
