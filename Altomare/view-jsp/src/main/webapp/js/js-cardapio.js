let photoFuncionario = document.getElementById('imgPhotoFuncionario');
let fileFuncionario = document.getElementById('fotoFuncionario');


photoFuncionario.addEventListener('click', ()=> {
    fileFuncionario.click();
});

fileFuncionario.addEventListener('change', (event) => {
       if(fileFuncionario.files.length <= 0){
           return;
       }
    
       let reader = new FileReader();
        
        reader.onload = () => {
            photoFuncionario.src = reader.result;
        };
        
        reader.readAsDataURL(fileFuncionario.files[0]);
   });

