let burger = document.querySelector("#burger");
let lista = document.querySelector("#header-main ul");

lista.classList.add('menu-fechado');

burger.addEventListener('click', () => {
    if (lista.classList.contains('menu-fechado')) {
        lista.classList.remove('menu-fechado');
        lista.classList.add('menu-aberto');
        lista.style.display = "block";
        lista.style.top = "17vw";
    }
    else {
        lista.classList.remove('menu-aberto');
        lista.classList.add('menu-fechado');
        lista.style.top = "-20vw";
    }
});

