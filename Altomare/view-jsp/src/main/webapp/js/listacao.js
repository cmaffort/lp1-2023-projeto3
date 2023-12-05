
function changeColor(event){
    var card = event.currentTarget.parentElement;
    if(card.style.backgroundColor === "red")
       card.style.backgroundColor = "green";
   else
    card.style.backgroundColor = "red";
}


