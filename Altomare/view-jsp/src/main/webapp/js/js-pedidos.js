/*início restaurante*/

/* início parte passageiro*/

/* fim parte passageiro*/

/* início parte funcionário*/

let lugarPedidosRestaurante = document.querySelector("#visualizacao-restaurante");

function adicionaPedidoRestaurante(numPedido, estado, conteudoPedido) {
    let novoPedido = document.createElement("div");
    novoPedido.classList.add("pedido-restaurante");
    
    let novoTitulo = document.createElement("h3");
    novoTitulo.textContent = "Pedido Nº " + numPedido;
    novoTitulo.classList.add("titulo-pedido-restaurante");
    
    let novoConteudo = document.createElement("div");
    
    conteudoPedido.forEach((unidade) => {
        let conteudoUnidade = unidade.innerHTML;
        conteudoUnidade = conteudoUnidade.split("*");
        
        let novaDisposicaoUnidade = document.createElement("p");
        novaDisposicaoUnidade.textContent = conteudoUnidade[1] + ": R$" + conteudoUnidade[0] + "0";
        
        novoConteudo.appendChild(novaDisposicaoUnidade);
    });
    
    novoConteudo.classList.add("conteudo-pedido-restaurante");
    
    novoPedido.appendChild(novoTitulo);
    novoPedido.appendChild(novoConteudo);
    
    if (estado.trim() === "finalizado") {
        novoPedido.classList.add("pedido-restaurante-finalizado");
        novoTitulo.style.borderBottom = ".5vh solid #ECA5A5";
    }
    else if (estado.trim() === "em preparo") {
        novoPedido.classList.add("pedido-restaurante-preparo");
        novoTitulo.style.borderBottom = ".5vh solid #FBFFDA";
    }
    else {
        novoPedido.classList.add("pedido-restaurante-recebido");
        novoTitulo.style.borderBottom = ".5vh solid #C7D1FA";
    }
    
    lugarPedidosRestaurante.appendChild(novoPedido);
}

let pedidosObtidos = document.querySelectorAll(".pedido-todo-db");

pedidosObtidos.forEach((pedido) => {
    let unidadesPedido = pedido.querySelectorAll("p");
    
    let dadosPedidoInteiro = pedido.querySelector("div").innerHTML.split("*");
    let num = dadosPedidoInteiro[0];
    let estado = dadosPedidoInteiro[1];
    
    adicionaPedidoRestaurante(num, estado, unidadesPedido);
});

/* fim parte funcionário*/

/* fim restaurante */

/*início limpeza*/

/* início parte passageiro*/

/* fim parte passageiro */

/* início parte funcionário*/

/* fim parte funcionário */

/* fim limpeza */

/*início saúde*/

/* início parte passageiro*/

/* fim parte passageiro */

/* início parte funcionário*/

/* fim parte funcionário */

/* fim saude */
