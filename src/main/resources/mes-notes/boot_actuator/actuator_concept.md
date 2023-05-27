
pour implementer un indicateur myCustomIndocator de Health, on doit implementer 
l'interface HealthIndicator.
=> endpoint associé : /actuator/health/myCustom

endpoint : /actuator/health/ offre des informations aggregées des metrics

pour consulter le detail des indicateurs de spring actuator, on peut appeler 
l'endpoint : .../actuator/health/{nomDIndicateur}

:: ../actuator/health/diskSpace (mappé à DiskSpaceHealthIndicator)
:: ../actuator/health/...


les differents status d'un indicateurs :
- UP
- down
- unknown
- out_of_service


autre que health, actuator expose les endpoints suivantes :

- /health: shows application health information (a simple status when 
accessed over an unauthenticated connection or full message details when authenticated); it's not sensitive by default.
- /info:  displays arbitrary application info; it's not sensitive by default.
-  /metrics: shows metrics information for the current application; it's 
sensitive by default.
-   /trace: displays trace information (by default the last few HTTP requests).

/*******************/
sensitive endpoints :

all endpoints are sensitive,
except :
- health
- info

pour changer la sensitvite d'un endpoint (::bean) :
endpoints.beans.sensitive=false
/******/
