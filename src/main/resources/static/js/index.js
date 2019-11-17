getQuote();

function getQuote() {
     fetch('https://nameyoursillystartup.herokuapp.com/api/run%20fit')
         .then((resp) => resp.json())
         .then(function (data) {
         });
 }