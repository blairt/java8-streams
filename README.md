# Java 8 Streams - Cookbook

Streams in Java 8 provide a declarative approach to Collections. The simplest analogy is that your Collection (list)
is a water collection barrel, and when you turn the valve (faucet) you create a stream which you can then process.

* The advantages of Streams are –
    * Declarative
    * Parallelizable - Able to be made parallel
    * Reduced Boilerplate – internal iteration

* The Stream operations are either –
    * Intermediate – return streams
    * Terminal – produce result

_The final point is that streams can only be traversed once_


Data for this cookbook was taken from Wikipedia: https://en.wikipedia.org/wiki/List_of_Tour_de_France_general_classification_winners

* This code have been compiled and run with:
    * Java 8.172 64k
    * OpenJDK 8 - Windows 64
    
## More Information

Java 8: Lambdas - 
http://www.oracle.com/technetwork/articles/java/architect-lambdas-part1-2080972.html

Lambda Expressions - https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html

Understanding Java 8 Streams API -
http://java.amitph.com/2014/01/understanding-java-8-streams-api.html

Processing Data with Java SE 8 Streams - 
http://www.oracle.com/technetwork/articles/java/ma14-java-se-8-streams-2177646.html