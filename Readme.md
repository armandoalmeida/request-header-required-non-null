# Workaround for `@RequestHeader` required with "null" value

The objective of this project is to create an alternative to this issue: 
https://github.com/spring-projects/spring-framework/issues/23939

## Requirements
See the `pom.xml` to more, but basically:
* Spring Boot Web
* Spring AOP

## The idea

When there is a request header parameter required, the Spring framework validates only if this parameter is into the request, but not if its value is null.

So, to workaround this problem, use the annotation `@RequestHeaderNonNull` beside your `@RequestHeader` annotation, like this:

```java
@RestController
public class ExampleController {

    @GetMapping("/")
    public String getSomething(@RequestHeader("X-Required-Header") @RequestHeaderNonNull String xRequiredHeader) {
        return "X-Required-Header: " + xRequiredHeader;
    }

}
```

> Check the class `RequestHeaderNonNullAspect` to understand how it works...
