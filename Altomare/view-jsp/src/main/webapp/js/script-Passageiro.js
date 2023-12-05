
let photo = document.getElementById('imgPhoto');
let file = document.getElementById('foto');
let arq = document.getElementById('arq');
let nome = document.getElementById('nome');
let bot = document.getElementById('bot');
let cpf = document.getElementById('cpf');



bot.addEventListener('click', ()=> {
    arq.click();
});

arq.addEventListener('change', function handleFile(files){
       if(arq.files.length <= 0){
           return;
       }
    
       let reader = new FileReader();
        
        reader.onload = function(progressEvent){
            let lines = this.result.split('\n');
            for(var line = 0; line < lines.length; line++){
                switch(line){
                    case 0: document.querySelector('#nome').value = lines[line];
                    case 1: document.querySelector('#dataNascimento').value = lines[line];
                    case 2: document.querySelector('#sexo').value = lines[line];
                    case 3: document.querySelector('#cpf').value = lines[line];
                    case 4: document.querySelector('#rg').value = lines[line];
                    case 5: document.querySelector('#civil').value = lines[line];
                    case 6: document.querySelector('#email').value = lines[line];
                    case 7: document.querySelector('#telefone').value = lines[line];
                    case 8: document.querySelector('#dados').value = lines[line];
                    
                       

                }        
            }
        }; 
        reader.readAsText(arq.files[0]);
   });

photo.addEventListener('click', ()=> {
    file.click();
});

file.addEventListener('change', (event) => {
       if(file.files.length <= 0){
           return;
       }
    
       let reader = new FileReader();
        
        reader.onload = () => {
            photo.src = reader.result;
        };
        
        reader.readAsDataURL(file.files[0]);
   });


function addCard(){
var pai = document.body;
var cardEl = document.createElement('div');
//let coluna1 =  document.querySelector('#coluna1');
//let imagemUser = document.createElement('img');
//let pName = document.creatElement('p');
//let pCpf = document.creatElement('p');
//let botaoChamar = document.createElement('button');
cardEl.textContent = "Olá, cumprimentos!";
pai.appendChild(cardEl);
var divAtual = document.getElementById("div1");
document.body.insertBefore(cardEl, divAtual);


}


function ProcurarPassageiro() {
    let input = document.getElementById('in').value;
    input=input.toLowerCase();
    let x = document.getElementsByClassName('cards');
      
    for (i = 0; i < x.length; i++) { 
        if (!x[i].innerHTML.toLowerCase().includes(input)) {
            x[i].style.display="none";
        }
        else {
            x[i].style.display="list-item";                 
        }
    }
}

document.querySelector('input[name="pacote"]').addEventListener('change', function(){
    var file = this.files[0];
    var formData = new FormData();
    formData.append("pacote", file);
    fetch('/upload', {
        method: 'POST',
        body: formData
    }).then(response => {
        console.log('Arquivo enviado com sucesso!');
    }).catch(error => {
        console.error('Erro:', error);
    });
});


