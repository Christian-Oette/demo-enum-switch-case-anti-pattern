# Example project to demonstrate an anti-pattern on enums

If you use switch case on enums, your compiler and tests won't recognize a need for code change.
In this demo project I show some alternatives.

See blog post for a full explanation 
https://christianoette.com/en/blog/blog-post/2022-05-07-switch-on-enums

## Anti pattern example

- You could add new values to the StatusEnumNotRefactoringSafe.class
- This would lead to a runtime error

## Map example

- A first improvement could be a map as in MapExample.class
- If you add a value to StatusEnum you are forced to also add a color
- A unit test reminds you to implement a new strategy

## Visitor example

- You could add a standard interface which redirects calls to specific functions
- E.g. if you add a value to StatusEnumVisitorPattern you are forced to also add a color and implement a method 
- No unit test is needed

## Strategy example

- If you use a framework (e.g. Spring) then it is even better to link a strategy to your enum
- E.g. if you add a value to StatusEnumWithStrategy you are forced to also add a color and a strategy
- No unit test is needed

## Special case, InstanceOf example
- On Java 17 you can use a combination of sealed, abstract and final classes to have a fixed set of possible class combinations
- If you use switch case on them, then you can remove the default case. The compiler is going to warn you if you add a new subclass