<!DOCTYPE html>
<html>
<head>
    <title>Stickers</title>
</head>
<body>
<h1>Stickers</h1>
<hr>
<h4>All your stickers</h4>
<#list stickerList as sticker>
    <div>
        <p>${sticker.id} | <b>${sticker.title}</b> | ${sticker.creationDate} | ${sticker.deadline} | ${sticker.author}
            <a href="/sticker/${sticker.id}">More info</a></p>
    </div>
</#list>
<hr>
<h3>New Sticker</h3>
<form action="/sticker/create" method="post">
    Title: <input type="text" name="title"/><br><br>
    Description: <input type="text" name="description"/><br><br>
    Author: <input type="text" name="author"/><br><br>
    Date: <input id="stickerCreationDate" type="date" name="creationDate"/><br><br>
    Deadline: <input type="date" name="deadline"/><br><br>
    <input type="submit" value="Save"/>
</form>

<script title="onLoad">
    window.onload = function (){
        autoFillDate();
    }
</script>
<script title="Auto fill sticker date with today date">
    function autoFillDate() {
    let date =document.getElementById("stickerCreationDate");
    date.value = new Date().toISOString().split('T')[0];
    }
</script>

</body>

</html>