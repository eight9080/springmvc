<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Attendee page</title>
<style type="text/css">
    .error{
        color:#ff0000;
    }
    .errorblock{
            color:#000;
            background-color: #ffEEEE;
            border: 3 px solid #ff0000;
            padding: 8px;
            margin: 16px;
    }
</style>
</head>
<body>
<h1> Hello - events</h1>
<form:form commandName="attendee">
        <form:errors path="*" cssClass="errorblock" element="div"/>
        <label for="textinput1">Enter name:</label>
        <form:input path="name" cssErrorClass="error"/>
        <form:errors path="name" cssClass="error"/>
        <br/>
        <label for="textinput2">Enter email Address:</label>
        <form:input path="emailAddress" cssErrorClass="error"/>
        <form:errors path="emailAddress" cssClass="error"/>
        <br/>
        <input type="submit" class="btn" value="Enter Attendee"/>
</form:form>


</body>
</html>