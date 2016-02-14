cloudProject1
=============
This webservice takes a name and tries to figure out the gender of that person. The application calls a webservice API 
from Mashape and returns the data in a json object form. Please note that we can do only x requests per a minute. 

* URL:/getgender?name=<input name>
* returns: Json object with name and the predicted gender
Note: <input name> is the place to input the name

Example usage:
```
$ curl http://localhost:80/getgender?name=sandra
{"name":"Sandra","gender":"female","description":"The name Sandra is female."}
```


## Docker Notes
Download this continer and then
```
gzip -d proj1.tar.gz
docker import proj1.tar
```

Run `/startme.sh` in the docker container to start the web server.

Example starting this container:
```
docker run -it cloudcomp /startme.sh
```
Then: test it using
```
curl http://localhost:80/getgender?name=sandra
```
This will start the container and the webserver.

Future work:
=============
* We can further work towards adding localizations to the names, like chinese or danish.
* Also we can add provisions for putting multiple names in a single request
