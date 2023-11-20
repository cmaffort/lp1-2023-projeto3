let opcoesCartao = document.querySelectorAll(".opcao-cartao");
let formasPagamento = document.querySelector("#formas-pagamento");
let telaCartoes = document.querySelector("#pagamento-cartao");
let tituloTelaCartoes = document.querySelector("#pagamento-cartao h2");
let saidaTelaCartoes = document.querySelector("#xis-tela-cartoes");

let telaRegistroCartao = document.querySelector("#registrando-cartao");
let botaoAdicionaCartao = document.querySelector("#botao-adicionar");

let cont = document.querySelector("#container");

let saidaTelaAdiciona = document.querySelector("#xis-tela-adiciona");

opcoesCartao.forEach((opcao) => opcao.addEventListener("click", () => {
    telaCartoes.style.display = "flex";
    formasPagamento.style.display = "none";
    
    let cartoesCredito = document.querySelectorAll(".credito");
    let cartoesDebito = document.querySelectorAll(".debito");

    if (opcao.getAttribute('id') === "primeiro-cartao") {
        tituloTelaCartoes.innerHTML = "Cartão de Crédito";
        cartoesCredito.forEach((cartao) => cartao.style.display = "flex");
        cartoesDebito.forEach((cartao) => cartao.style.display = "none");
    }
    else {
        tituloTelaCartoes.innerHTML = "Cartão de Débito";
        cartoesCredito.forEach((cartao) => cartao.style.display = "none");
        cartoesDebito.forEach((cartao) => cartao.style.display = "flex");
    }
}));
saidaTelaCartoes.addEventListener("click", () => {
    telaCartoes.style.display = "none";
    formasPagamento.style.display = "flex";
    telaRegistroCartao.style.display = "none";
});


// ------------------------------------------

botaoAdicionaCartao.addEventListener("click", () => {
    telaRegistroCartao.style.display = "flex";
    telaCartoes.style.display = "none";
});

saidaTelaAdiciona.addEventListener("click", () => {
    telaCartoes.style.display = "flex";
    telaRegistroCartao.style.display = "none";
});

//--------------------------------------------

let opcaoPix = document.querySelector(".opcao-pix");
let telaQrcode = document.querySelector("#qrcode");

opcaoPix.addEventListener("click", () => {
    formasPagamento.style.display = "none";
    telaQrcode.style.display = "flex";
});

let cancelaPix = document.querySelector("#qrcode div");

cancelaPix.addEventListener("click", () => {
    formasPagamento.style.display = "flex";
    telaQrcode.style.display = "none";
});

//---------------------------------------------------


let cartoes = document.querySelectorAll(".cartao-individual");
let lugarProsCartoes = document.querySelector("#lugar-cartoes");

function adicionaCartao(titular, vencimento, numero, tipo) {
    let novaEscolhaCartao = document.createElement("div");
    let parteSuperior = document.createElement("div");
    let parteInferior = document.createElement("div");
    
    let novoTipo = document.createElement("div");
    novoTipo.textContent = "(" + tipo + ")";
    let novoNumero = document.createElement("div");
    novoNumero.textContent = "**** **** **** " + String(numero).substr(-4);
    parteSuperior.appendChild(novoTipo);
    parteSuperior.appendChild(novoNumero);
    parteSuperior.classList.add("parte-superior");
    
    let novoTitular = document.createElement("div");
    novoTitular.textContent = titular;
    let novoVencimento = document.createElement("div");
    novoVencimento.textContent = "Vence em: " + vencimento;
    parteInferior.appendChild(novoTitular);
    parteInferior.appendChild(novoVencimento);
    
    novaEscolhaCartao.appendChild(parteSuperior);
    novaEscolhaCartao.appendChild(parteInferior);
    
    tipo = tipo.trim();
    if (tipo.toString() === "debito")
        novaEscolhaCartao.classList.add("debito");
    else
        novaEscolhaCartao.classList.add("credito");
    
    novaEscolhaCartao.classList.add("novoCartao");
    
    lugarProsCartoes.appendChild(novaEscolhaCartao);
}

let cartoesDoBanco = document.querySelectorAll(".cartao-individual-db");

for (let i = 0; i < cartoesDoBanco.length; i++) {
    let cartaoAtual = cartoesDoBanco[i].innerHTML;
    let cartoDividido = cartaoAtual.split('*');
    
    let titular = cartoDividido[0];
    let numero = cartoDividido[1];
    let vencimento = cartoDividido[2];
    let tipo = cartoDividido[3];

    adicionaCartao(titular, vencimento.split(" ")[0], numero, tipo);
}