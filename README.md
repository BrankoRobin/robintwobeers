# Robin's two beers

The aim of this project was to get two beers from Robin.

Unfortunately, it failed.

If a class annotated with @Component has a method annotated with @Bean, it will create a singleton bean and add it to the spring's context.

To test the service
1. call GET /test multiple times
2. call GET /evn
3. env returns only one bean 

//Wrong setup of application, missed the point

