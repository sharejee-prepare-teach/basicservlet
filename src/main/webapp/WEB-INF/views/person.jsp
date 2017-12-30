<%@ page import="com.basicservlet.model.Person" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: HTPP
  Date: 12/17/2017
  Time: 6:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>person</title>
</head>
<body>
<%
    ArrayList<Person> personArrayList = new ArrayList<>();
    for(int i=0;i<5;i++){
        Person person = new Person();
        person.setId(i);
        person.setName("Name"+i);
        personArrayList.add(person);
    }

%>
<%= personArrayList.get(1).getId()  %>
<%= personArrayList.get(1).getName()  %>

</body>
</html>
