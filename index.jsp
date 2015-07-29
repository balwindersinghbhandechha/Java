<%-- 
    Document   : index
    Created on : 18-Jun-2013, 2:12:35 PM
    Author     : Balwinder Singh Bhandechha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delivery Service</title>
    </head>
    <body>
        <h1>Delivery Service</h1>
        <form action="GetDeliveries"  method="POST">
            
            <table align="center">                
                
                <tr>                    
                    <td>Select Shipment Status:</td>
                    <td><input type="text" name="shipStatus"></td>
                </tr>                
                
                <tr>
                    <td colspan="2" align ="center">                        
                        <input type ="submit" value="Get Deliveries"/>
                    </td>
                </tr>
            </table>
            
            
        </form>
    </body>
</html>
