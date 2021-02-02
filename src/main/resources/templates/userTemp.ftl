<#import "ui.ftl" as ui/>

<!DOCTYPE html>
<html lang="en"
      xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
      xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>userTemp</title>

</head>
<body>

<div>
    <fieldset>
        <legend>Добавить лицо</legend>
        <form name="person" action="save" method="POST">
            <@ui.formInput id="t1" name="firstName" label="Имя"/> <br/>
            <@ui.formInput id="t2" name="age" label="Возраст"/> <br/>
            <input type="submit" value="Save" />
        </form>
    </fieldset>
</div>

<div>
    <fieldset>
        <legend>Поиск</legend>
        <form name="searchForm" action="search" method="POST">
            <@ui.formInput id="t3" name="searchName" label="Поиск"/> <br/>
            <input type="submit" value="Search" />
        </form>
    </fieldset>
</div>
<p><#if lastSearch??>Поиск для: ${lastSearch}<#else></#if></p>

<@ui.table id="table1" rows=persons![]/>

</body>
</html>