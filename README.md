cloudProject1
=============
This webservice takes a name and tries to figure out the gender of that person. The application calls a webservice API 
from Mashape and returns the data in a json object form. Please note that we can do only x requests per a minute. 

URL:/getgender?name=<input name>
Note: <input name> is the place to input the name
returns: Json object with name and the predicted gender

Example usage:
$ curl http://localhost:8080/getgender?name=sandra
{"name":"Sandra","gender":"female","description":"The name Sandra is female."}

Future work:
=============
We can further work towards adding localizations to the names, like chinese or danish.
Also we can add provisions for putting multiple names in a single request.
