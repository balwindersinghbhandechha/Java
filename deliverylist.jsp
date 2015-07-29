<%-- 
    Document   : deliverylist
    Created on : 18-Jun-2013, 3:40:23 PM
    Author     : Balwinder Singh Bhandechha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delivery List</title>
    </head>
    <body>
        <h1 align ="center">Delivery List(header should have )</h1>
        
        <table align ="center" border="1" cellspacing="5"
               cellpadding="5">
        
            <tr>
                <th> Description</th>
                <th> Shipping Cost</th>
                <th></th>                
            </tr>
            <c:forEach var="delivery" items="${deliveries}"><!-- should be delivery -->
                <tr>
               <td>${delivery.description}</td>
               <td>${delivery.shippingCost}</td>
               
                <td>
                    <form action="ChangeStatus" method="GET">
                        <input type="submit" value="Change Status"/>
                        <input type="hidden" name="deliveryId" value="${delivery.deliveryId}"/>
                        <input type="hidden" name="status" value="${delivery.sent}"/>
                    </form>
                </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
