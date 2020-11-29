# README


## Environment

* java 11



## How to test 

Use Altair plugin

    http://127.0.0.1:9001/graphql
    
    
Query operation

    query{
      findAll{
        id
        url
        description
      }
    }
    
        
Mutation operation 


    mutation{
      saveComment(id: 5, title: "FAQ ", createdAt: "2020/11/21 13:22:41")
    }


## Test Polymorphic type 

* query interface

        query{
          findVehicle{
            __typename,
           ... on Car {
            id 
            enginePower
          }
            ... on Van {
              id
              enginePower
              
            }
            
          }
        }
    
* Mutation on interface    
    
        mutation{
          saveCar(id: "Preus 2008", enginePower: HP_1500)
        }

Ref : 
    
https://graphql.org/learn/schema/

https://www.howtographql.com/graphql-java/9-filtering/
    
https://developer.okta.com/blog/2020/01/31/java-graphql

polymophic : https://medium.com/better-programming/using-graphql-with-spring-boot-interfaces-and-unions-a76f62d62867

client Library : https://ktor.io/docs/clients-index.html