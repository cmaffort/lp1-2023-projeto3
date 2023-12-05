/*início restaurante*/

/* início parte passageiro*/

/* fim parte passageiro*/

/* início parte funcionário*/

let a = false;

let lugarPedidosRestaurante = document.querySelector("#visualizacao-restaurante");

function adicionaForms(idConta) {
    let novoForm = document.createElement("form");
    
    let novoSelect = document.createElement("select");
    novoSelect.setAttribute("name", "estados");
    
    let op1 = document.createElement("option");
    op1.textContent = "Estado do Pedido";
    op1.setAttribute("value", "nada");
    op1.setAttribute("name", "estado");
    let op2 = document.createElement("option");
    op2.textContent = "Pronto";
    op2.setAttribute("value", "finalizado");
    op2.setAttribute("name", "estado");
    op2.classList.add("muda-estado-pronto");
    let op3 = document.createElement("option");
    op3.textContent = "Em preparo";
    op3.setAttribute("value", "em preparo");
    op3.setAttribute("name", "estado");
    op3.classList.add("muda-estado-preparo");
    let op4 = document.createElement("option");
    op4.textContent = "Recebido";
    op4.setAttribute("value", "requisitado");
    op4.setAttribute("name", "estado");
    op4.classList.add("muda-estado-recebido");
    
    let envio = document.createElement("input");
    envio.type = "submit";
    envio.value = "✓";
    
    let inputFantasma = document.createElement("input");
    inputFantasma.setAttribute("name", "id");
    inputFantasma.setAttribute("value", idConta);
    inputFantasma.style.display = "none";
    
    novoSelect.appendChild(op1);
    novoSelect.appendChild(op2);
    novoSelect.appendChild(op3);
    novoSelect.appendChild(op4);
    
    novoForm.appendChild(novoSelect);
    novoForm.appendChild(envio);
    novoForm.appendChild(inputFantasma);
    novoForm.classList.add("form-criado");
    novoForm.action = "../../MudaEstadoPedido";
    novoForm.method = "get";
    
    return novoForm;
}

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
    
    novoPedido.appendChild(adicionaForms(numPedido));
    
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
