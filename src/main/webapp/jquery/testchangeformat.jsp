<!DOCTYPE html>
<html lang="en">
<head>
    <title>Educacion It:: Aprendiendo Java</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

    <script>
$(document).ready(function(){
    $(".fn1").click(function(){
        $(this).css("width", ($("#tam").val()*10)+"%");
    });
});
</script>

</head>
<body>

<div class="jumbotron text-center">
    <h1>Programación Web con Java</h1>
    <p>Instruducción a JQuery</p>
</div>

<div class="container">
    <div class="row">

<p>elige el tamaÃ±o que quieres tenga el boton. entre 1 y 10</p>
<p> tamaÃ±o: <input type="number" value="1" id="tam"></p><p id="msn"></p>

<button class="fn1">Click me</button>

    </div>
    <br><br>
    <div class="row"><button type="button" onclick="window.location='../';" class="btn btn-primary">Pagina Principal</button></div>

</div>

</body>
</html>