# README


## Environment

* java 11



## How to test 

Use Altair plugin

    http://127.0.0.1:9001/graphql
    
    
Query operation

    query{
      post(id: 558888888888){
        id
        text
      }
    }
    
        
Mutation operation 


    mutation{
      createPost(text: "Simple Post"){
        id
        text
      }
    }


