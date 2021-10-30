# microservice-architecture-ex1
- Microservices
- Eureka Server
- H2 DB in memory
- RestTemplate

# Endpoints
- http://localhost:9091/nationality-predict/<name>
#Example: 
```
- http://localhost:9091/nationality-predict/andres
{
    "id": 2,
    "name": "andres",
    "country": [
        {
            "id": 4,
            "probability": "0.2298090373145084",
            "country_id": "CO"
        },
        {
            "id": 5,
            "probability": "0.09827830555358227",
            "country_id": "CR"
        },
        {
            "id": 6,
            "probability": "0.0941729223902563",
            "country_id": "UY"
        }
    ]
}
```
