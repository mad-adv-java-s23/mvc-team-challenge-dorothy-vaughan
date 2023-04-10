<!DOCTYPE html>
<html>
  <head>
    <title>Madlibs Game</title>
    <link rel="stylesheet" type="text/css" href="css/madLibsStyle.css">
  </head>
  <body>
    <img src="images/madlib.jpeg" alt="Image of a Madlib cover">
    <h1>Mad Libs Game</h1>
    <form method="post" action="MadLibGame">
      <p>
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" placeholder="Enter a name" required>
      </p>
      <p>
        <label for="noun">Noun:</label>
        <input type="text" id="noun" name="noun" placeholder="Enter a noun" required>
      </p>
      <p>
        <label for="verb">Verb:</label>
        <input type="text" id="verb" name="verb" placeholder="Enter a verb" required>
      </p>
      <p>
        <label for="adjective">Adjective:</label>
        <input type="text" id="adjective" name="adjective" placeholder="Enter an adjective" required>
      </p>
      <p>
        <label for="adverb">Adverb:</label>
        <input type="text" id="adverb" name="adverb" placeholder="Enter an adverb" required>
      </p>
      <p>
        <button type="submit">Submit</button>
      </p>
    </form>
  </body>
</html>
