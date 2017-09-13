<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>

<head>
    <title>Volume</title>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <script type="text/javascript" src="jquery-3.2.1.js"></script>
</head>

<body>

<h1 id="k">Калькулятор об'єму тіл</h1>

<br>
<div class="main">
    <form name="volume" action="controller" method="post">
        <div class="field">
        <label for="shape_type">Оберіль фігуру</label>
        <select name="shape"  id="shape_type">
            <option value = "cube" id = "cube" selected>Куб</option>
            <option value = "prism" id = "prism">Призма</option>
            <option value = "parallelepiped" id = "parallelepiped">Паралелепіпед</option>
            <option value = "pyramid" id = "pyramid">Піраміда</option>
            <option value = "cylinder" id = "cylinder">Циліндр</option>
            <option value = "cone" id = "cone">Конус</option>
            <option value = "ball" id = "ball">Куля</option>
        </select>
        </div>

        <br>
        <h4>Параметри фігури</h4>

        <div class="field">
            <label for="h">Висота, см</label>
            <input type="text" name="h" id="h">
        </div>

        <br>

        <div class="field">
            <label for="s" >Площа основи, см&sup2;</label>
            <input type="text" name="s"  id="s">
        </div>

        <br>

        <div class="field">
            <label for="r" >Радіус, см</label>
            <input type="text" name="r"  id="r">
        </div>


         <br>
    <h4>Точність результату</h4>

    <div class="field">
        <label for="accuracy">Кількість знаків після коми</label>
        <select name="accuracy"  id="accuracy">
            <option value = "1">1</option>
            <option value = "2">2</option>
            <option value = "3" >3</option>
            <option value = "4" selected>4</option>
            <option value = "5">5</option>
            <option value = "6">6</option>
            <option value = "7">7</option>
            <option value = "8">8</option>
            <option value = "9">9</option>
            <option value = "10">10</option>
        </select>
    </div>
        <br><br>
        <input type="submit" value="Розрахувати" id="button" >

    </form>
</div>
<script type="text/javascript" src="script/script.js"></script>
</body></html>