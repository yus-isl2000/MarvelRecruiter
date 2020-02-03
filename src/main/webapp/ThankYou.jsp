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
        <title>Thank You!</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Bangers&display=swap" rel="stylesheet">
    </head>
    <body>
        <div class="login">
            <h2>Thank You!</h2>
            <h5>Applicant Info</h5>
            <p>Name: ${applicant.name}</p>
            <p>Email: ${applicant.email}</p>
            <p>IQ: ${applicant.iq}</p>
            <p>Favorite Beverage: ${applicant.beverage}</p>
            <p>Super Power: ${applicant.superPower}</p>
            <h5>Your Score is: ${applicant.score}</h5>
            <h5>${message}</h5>
            <h5><a href="MarvelRecruiter.html">Next Applicant</a></h5>    
        </div>
    </body>
</html>
