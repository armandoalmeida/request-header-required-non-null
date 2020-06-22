package br.com.armandoalmeida.requestHeaderNonNull.controller.validation;


import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestHeaderNonNull {
}
