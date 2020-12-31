# Portal-backend

Backend dla systemów klienckich WEB oraz Aplikacji Mobilnej.
Zastosowany jest inteferjs/standard API REST + JSON 

Komponenty:
Kotlin
SpringBoot
MongoDB
Reactive (non-blocking) Flux/Mono Interface 

# Instalacja i start API

Baza danych MongoDB
Należy zainstalowąć Docker oraz Docker Compose.
Aby Wystartować lokalny proces MongoDB należy użyć pliku docker-compose oraz skryptu start.sh.
z katalogu src/docker

Aby uruchomic API należy zinstalować jsdk(Java 0 moze byc open sdk) w wersji co najmniej 11.
Po instalacji jsdk nalezy pobrac ostatnia wersje release np: portal-backend-0.0.1-SNAPSHOT.jar
i uruchomic ją poleceniem java -jar portal-backend-0.0.1-SNAPSHOT.jar

Test aplikacji poprzez GET na url:
http://localhost:8080/api/rest/customers

Efekt []

lub wywolać POST z 
http://localhost:8080/api/rest/customers obiektem JSON:
{
    
        "firstName": "Test",
        "lastName":"Test",
        "nick": "Klient 1",
        "countryCode": "PL",
        "city": "Gdynia",
        "postalCode": "09-12",
        "street": "Wesola",
        "buildingNr": "10",
        "contactPhone": "555-098-098",
        "email": "test@test.pl"
    }



English:
Backend for WEB client systems and Mobile Application.
The REST + JSON API interface/standard is used. 

Components:
Kotlin
SpringBoot
MongoDB
Reactive (non-blocking) Flux/Mono Interface 
