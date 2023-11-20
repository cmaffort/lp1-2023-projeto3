const red = document.querySelector(".red");

function changeColor(){
    if(red.style.backgroundColor === "green")
       red.style.backgroundColor = "red";
   else
    red.style.backgroundColor = "green";
}

