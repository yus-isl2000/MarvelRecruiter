<%-- 
    Document   : AboutMe
    Created on : Jan. 27, 2020, 8:58:08 p.m.
    Author     : yusefislaih
    991515277
    Multi-Tier Programming 1
    Prof. Sun
    January 30 2020
    Assignment 1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About Me!</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Bangers&display=swap" rel="stylesheet">
    </head>
    <body>
        <div class="login">
            <h2>About Me</h2>
            <h3>Tell us a little more about yourself... CHOOSE CAREFULLY!</h3>
            <form action="DecisionMaker" method="POST">
                <h5>IQ:</h5>
                <select name="iq" class="dropdown">
                    <option>Less Than 120</option>
                    <option>121 to 150</option>
                    <option>151 to 180</option>
                    <option>Greater Than 180</option>
                </select>

                <h5>Favorite Beverage:</h5>
                <p> <input type="radio" name="beverage" value="Water" checked="" /> Water 
                    <input type="radio" name="beverage" value="Juice" /> Juice
                    <input type="radio" name="beverage" value="Cola" /> Cola
                    <input type="radio" name="beverage" value="Beer" /> Beer
                    <input type="radio" name="beverage" value="Wine" /> Wine
                </p>

                <h5>Super Power:</h5>
                <p><input type="checkbox" name="superPower" value="Super Strength" /> Super Strength</p>
                <p><input type="checkbox" name="superPower" value="Flight" /> Flight</p>
                <p><input type="checkbox" name="superPower" value="Time Travel" /> Time Travel</p>
                <p><input type="checkbox" name="superPower" value="Mind Control" /> Mind Control</p>
                <p><input type="checkbox" name="superPower" value="Coding" /> Coding</p>

                <input type="submit" value="Join Now!" class="button"/><br>

                <h5><a href="MarvelRecruiter.html">Go Back</a></h5>

                <input type="hidden" name="name" value=${name} />
                <input type="hidden" name="email" value=${email} />
            </form>
        </div>
    </body>
</html>
