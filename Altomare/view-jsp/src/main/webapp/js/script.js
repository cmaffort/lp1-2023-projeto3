
let photoFuncionario = document.getElementById('imgPhotoFuncionario');
let fileFuncionario = document.getElementById('fotoFuncionario');
let arqFuncionario = document.getElementById('arquivoFuncionario');
let nomeFuncionario = document.getElementById('nomeFuncionario');
let botaoArquivosFuncionario = document.getElementById('botaoArquivosFuncionario');

botaoArquivosFuncionario.addEventListener('click', ()=> {
    arqFuncionario.click();
});

   
   arqFuncionario.addEventListener('change', function handleFile(files){
       if(arqFuncionario.files.length <= 0){
           return;
       }
    
       let reader = new FileReader();
        
        reader.onload = function(progressEvent){
            let lines = this.result.split('\n');
            for(var line = 0; line < lines.length; line++){
                switch(line){
                    case 0: document.querySelector('#nomeFuncionario').value = lines[line];
                    case 1: document.querySelector('#dataNascimentoFuncionario').value = lines[line];
                    case 2: document.querySelector('#sexoFuncionario').value = lines[line];
                    case 3: document.querySelector('#cpfFuncionario').value = lines[line];
                    case 4: document.querySelector('#rgFuncionario').value = lines[line];
                    case 5: document.querySelector('#estadoCivilFuncionario').value = lines[line];
                    case 6: document.querySelector('#emailFuncionario').value = lines[line];
                    case 7: document.querySelector('#telefoneFuncionario').value = lines[line];
                    case 8: document.querySelector('#setor').value = lines[line];
                    case 9: document.querySelector('#turno').value = lines[line];
                    case 10: document.querySelector('#dataAdmissao').value = lines[line];
                    case 11: document.querySelector('#passaporteFuncionario').value = lines[line];
                    case 12: document.querySelector('#cepFuncionario').value = lines[line];
                }        
            }
        }; 
        reader.readAsText(arqFuncionario.files[0]);
   });



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

