<%-- 
    Document   : invite
    Created on : Nov 6, 2013, 11:48:33 AM
    Author     : apprentice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UR Invited</title>
    </head>
    <body>
        <h1>UR Invited</h1>
        You've been invited to a ${theParty.type}.<br/>
        Date: ${theParty.date}<br/>
        Time: ${theParty.time}<br/>
        Place:${theParty.place}<br/>
        <h3>Can you Attend?</h3>
        <form method='POST' action='ConfirmationServlet'>
            <input type='radio' name='canAttend' value='yes'>Yes<br/>
            <input type='radio' name='canAttend' value='no'>No<br/>
            <select name='comment'>
                <option value='out of town'>Sorry, I'm out of town.</option>
                <option value='sick'>Sorry, I plan to be sick that weekend</option>
                <option value='i hate you'>Sorry, I never really liked you...</option>
            </select>
            <input type='submit' value='RSVP'/>
            
        </form>
    </body>
</html>
