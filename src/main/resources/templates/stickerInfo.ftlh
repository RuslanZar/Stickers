<!DOCTYPE html>
<html>
<head>
    <title>Stickers</title>
</head>
<body>
<h1>Stickers</h1>
<hr>
<h4>Info about ${sticker.title}</h4>

<hr>
    Title: <input type="text" name="title" value="${sticker.title}"/><br><br>
    Description: <input type="text" name="description" value="${sticker.description}"/><br><br>
    Author: <input type="text" name="author" value="${sticker.author}"/><br><br>
    Date: <input type="date" name="creationDate" value="${sticker.creationDate}"/><br><br>
    Deadline: <input type="date" name="deadline" value="${sticker.deadline}"/><br><br>
<form action="/sticker/delete/${sticker.id}" method="post">
    <input type="submit" value="Close Sticker">
</form>
<form action="/sticker/delete/${sticker.id}" method="post">
    <input type="submit" value="Delete Sticker">
</form>
<form action="/" method="get">
    <input type="submit" value="Go to main page">
</form>
</body>
</html>