let burger = document.querySelector("#burger");
let burgerTxt = document.querySelector("#burger p");
let lista = document.querySelector("#header-main ul");

lista.classList.add('menu-fechado');

burger.addEventListener('click', () => {
    if (lista.classList.contains('menu-fechado')) {
        lista.classList.remove('menu-fechado');
        lista.classList.add('menu-aberto');
        lista.style.display = "block";
        lista.style.top = "17.7vh";
        burgerTxt.innerHTML = "▲";
    }
    else {
        lista.classList.remove('menu-aberto');
        lista.classList.add('menu-fechado');
        lista.style.top = "-30vh";
        burgerTxt.innerHTML = "▼";
    }
});