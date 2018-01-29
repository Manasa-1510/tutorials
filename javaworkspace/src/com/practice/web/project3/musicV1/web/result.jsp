<%@ page import="java.util.*"%>

<html>
<body>
<h1>Music Recomendations JSP!</h1>
<p>

<%

ArrayList styles = (ArrayList)request.getAttribute("styles");

Iterator it = styles.iterator();

while(it.hasNext()){
	out.print("<br> try" + it.next());
}
%>
</body>
</html>