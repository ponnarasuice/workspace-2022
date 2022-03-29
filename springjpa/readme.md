## spring boot with jpa mysql 

### can we add more more session manager jpa
https://medium.com/@joeclever/using-multiple-datasources-with-spring-boot-and-spring-data-6430b00c02e7

- create 2 datasources in app properties & set dialect to default so spring resolve in its own
- model/repo are created in 2 diff packages.

### serialization
objects converted to bytes to persist in db or files etc.
during return data from db, deserialiseid is used to deserialise data.
