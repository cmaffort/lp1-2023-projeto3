/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

'use strict'

let photo = document.getElementById('imgPhoto');
let file = document.getElementById('foto');

photo.addEventListener('click', ()=> {
    file.click();
});

file.addEventListener('change', (event) => {
       if(file.files.length <= 0){
           return;
       }
    
       let reader = new FileReader();
        
        reader.onload = () => {
            photo.src = reader.result;
        };
        
        reader.readAsDataURL(file.files[0]);
   });

