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
      saveComment(id:3, title: "Graphql Advance Cource ")
    }



Ref : 
    
https://graphql.org/learn/schema/

https://www.howtographql.com/graphql-java/9-filtering/
    
https://developer.okta.com/blog/2020/01/31/java-graphql

