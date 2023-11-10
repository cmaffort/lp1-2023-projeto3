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

    if (opcao.getAttribute('id') === "primeiro-cartao")
        tituloTelaCartoes.innerHTML = "Cartão de Crédito";
    else
        tituloTelaCartoes.innerHTML = "Cartão de Débito";
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


