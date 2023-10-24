let barra = document.querySelector("#barra-timeline");
let contDespesas = document.querySelector("#article-despesas");

let tamanhoBarra = 0;
let posicaoCirculo = 1;
let posicaoDespesas = 1;
let ultimo = "D";

function adicionaCirculo() {
    let novoCirculo = document.createElement("div");
    novoCirculo.classList.add("circulo");
    
    novoCirculo.style.top = posicaoCirculo + "%";
    posicaoCirculo+= 20;
    
    contDespesas.appendChild(novoCirculo);
}

function aumentaBarra() {
    barra.style.height = tamanhoBarra + "%";
    tamanhoBarra+= 20;
}

function criaBarraHorizontal() {
    let novaBarra = document.createElement("div");
    novaBarra.classList.add("barra-horizontal");
    
    if (ultimo == "D") {
        novaBarra.style.left = "23.5%";
        novaBarra.style.top = (posicaoCirculo + 2) + "%";
    }
    else {
        novaBarra.style.right = "23.5%";
        novaBarra.style.top = (posicaoCirculo + 2) + "%";
    }
    
    contDespesas.appendChild(novaBarra);
}

function adicionaDespesa() {
    let novaDespesa = document.createElement("div"); 
    novaDespesa.classList.add("despesa");
    
    criaBarraHorizontal();
    
    if (ultimo == "D") {
        novaDespesa.classList.add("esquerda");
        ultimo = "E";
    }
    else {
        novaDespesa.classList.add("direita");
        ultimo = "D";
    }
    
    novaDespesa.style.top = posicaoDespesas + "%";
    posicaoDespesas+= 20;
    
    adicionaCirculo();
    aumentaBarra();
    
    contDespesas.appendChild(novaDespesa);
}

adicionaDespesa();
adicionaDespesa();
adicionaDespesa();
adicionaDespesa();
adicionaDespesa();
adicionaDespesa();
adicionaDespesa();
adicionaDespesa();
adicionaDespesa();
adicionaDespesa();
adicionaDespesa();