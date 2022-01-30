**The Request:**
--
*Bulding website that prints a random epigram on every reload (like the `fortune` command-line tool, but on the web).*


**The Solution:** 
--
To generate a random epigram, I implemented 3 flavours,

1.  **StaticEpigramProvider**: it reads the messages from a static hard-coded list
2.  **RestApiEpigramProvider**: it gets the messages from a free api => https://api.justyy.workers.dev/api/fortune
3.  **FileEpigramProvider**: it loads the messages from a text file one time on application start (singleton)

but I injected the **StaticEpigramProvider** in the container, so the other classes just to show more ideas  

the front end is a static html page `index.html`, it is the welcome page of the app, it can be reached through https://localhost:8080 ,
the page gets the messages from the https://localhost:8080/getEpigram endpoint using javascript call

2 simple unit tests have been added and 2 integration tests as well to test `getEpigram` endpoint and the html page
