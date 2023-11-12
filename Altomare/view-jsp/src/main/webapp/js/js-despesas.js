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
    posicaoCirculo+= 30;
    
    contDespesas.appendChild(novoCirculo);
}

function aumentaBarra() {
    barra.style.height = tamanhoBarra + "%";
    tamanhoBarra+= 30;
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

function adicionaDespesa(valor, tipo, descricao, data) {
    let novaDespesa = document.createElement("div"); 
    novaDespesa.classList.add("despesa");
    
    let novoTitulo = document.createElement("div");
    novoTitulo.textContent = "Despesa de " + tipo;
    
    let novoConteudo = document.createElement("div");
    
    let novoValor = document.createElement("div");
    novoValor.textContent = "Valor: R$" + valor;
    
    let novaData = document.createElement("div");
    novaData.textContent = "Data ocorrência: " + data;
    
    let novaDescricao = document.createElement("div");
    novaDescricao.textContent = "Descrição: " + descricao;
    
    novoConteudo.appendChild(novoValor);
    novoConteudo.appendChild(novaData);
    novoConteudo.appendChild(novaDescricao);
    
    novaDespesa.appendChild(novoTitulo);
    novaDespesa.appendChild(novoConteudo);
    
    novoConteudo.classList.add("flex-conteudo-despesas");
    novoTitulo.classList.add("flex-titulo");
    novaDespesa.classList.add("flex-despesas");
    
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
    posicaoDespesas+= 30;
    
    adicionaCirculo();
    aumentaBarra();
    
    contDespesas.appendChild(novaDespesa);
}

let conteudosObtidos = document.querySelectorAll(".conteudo-passado");

for (let i = 0; i < conteudosObtidos.length; i++) {
    let conteudoAtual = conteudosObtidos[i].innerHTML;
    let conteudoDivido = conteudoAtual.split('*');
    
    let valor = conteudoDivido[0];
    let tipo = conteudoDivido[1];
    let descricao = conteudoDivido[2];
    let data = conteudoDivido[3];
    
    let dataDividida = data.split(' ');
    data = dataDividida[1];
    
    adicionaDespesa(valor, tipo, descricao, data);
}