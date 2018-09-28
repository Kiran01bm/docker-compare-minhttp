# Summary:
This work is foundational and intended to be used as part of other extended work.

This repo has a simple http server implemented in languages that are popular in Microservices based platforms - The server responds with a http/200 and a Hello text message of 21 bytes in response to requests on /hello.

## Run
```
docker-compose -f docker-compose.yml up -d
```

## Tes
```
./ab.sh
```

## Screen Prints
![Alt text](docker-ps.png?raw=true "docker ps")
![Alt text](docker-stats.png?raw=true "docker stats")
