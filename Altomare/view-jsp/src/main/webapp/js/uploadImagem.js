var express = require('express');
var multer  = require('multer');
var path = require('path');

var storage = multer.diskStorage({
    destination: function (req, file, cb) {
        cb(null, 'upload/');
    },
    filename: function (req, file, cb) {
        var uniqueSuffix = 'nome'; 
        cb(null, file.fieldname + '-' + uniqueSuffix + path.extname(file.originalname));
    }
});

var upload = multer({ storage: storage });

var app = express();

app.post('/upload', upload.single('pacote'), function (req, res, next) {

    res.send(req.file.path); // Isso retornará o caminho do arquivo
});






