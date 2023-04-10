<!DOCTYPE html>
<html>
  <head>
    <title>Mad Libs Story</title>
    <link rel="stylesheet" type="text/css" href="css/madLibsResult.css">
  </head>
  <body>
    <div class="container">
      <h1>Mad Libs Story</h1>
      <div class="box">
        <jsp:useBean id="madLibsBean" class="java112.servlet.MadLibsBean" scope="request" />
        <p><%= madLibsBean.getStory() %></p>
        <table>
          <tr>
            <th>Name</th>
            <th>Noun</th>
            <th>Verb</th>
            <th>Adjective</th>
            <th>Adverb</th>
          </tr>
          <tr>
            <td><%= madLibsBean.getName() %></td>
            <td><%= madLibsBean.getNoun() %></td>
            <td><%= madLibsBean.getVerb() %></td>
            <td><%= madLibsBean.getAdjective() %></td>
            <td><%= madLibsBean.getAdverb() %></td>
          </tr>
        </table>
      </div>
      <p><a href="index.jsp"> Go back to Mad Libs Form</a></p>
    </div>
</html>
