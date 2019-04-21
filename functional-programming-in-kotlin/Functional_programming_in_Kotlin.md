# Functional programming in Kotlin


```
    The Kotlin language may at first glance appear to be nothing more than an upgraded Java: lots of syntax conveniences, some type inference and so on.

    But dig a little deeper and we will discover that many of the most popular and advanced features of functional languages are available.
```



### Algebraic data types

* Because the Maybe type is so familiar to functional programmers, let’s define an equivalent of it here just for illustration by using sealed class

* What about pattern matching? This is where the word “sealed” comes in handy; we can do an exhaustive pattern match without an else/otherwise branch:


### Immutability

### Recursive functions
* Functional programmers like to express solutions to problems using recursion. This often needs an optimisation called tail call optimisation to work well. Kotlin supports this in certain circumstances


### Lazyness
```
    Functional programming occasionally involves building infinite lists of things and operating on them in a lazy and possibly parallel manner.

    Since version 8 Java can do this too, and therefore so can Kotlin.
```


















