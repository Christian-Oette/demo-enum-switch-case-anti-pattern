# Example project to demonstrate an anti-pattern on enums

If you use switch case on enums, your compiler and tests won't recognice a need for code change.
In this demo project I show two alternatives.

See blog post for a full explanation 

## Anti pattern example

- You could add new values to the StatusEnumNotRefactoringSafe.class
- This would lead to a runtime error

## Map example

- A first improvement could be a map as in MapExample.class
- If you add a value to StatusEnum you are forced to also add a color
- A unit test reminds you to implement a new strategy

## Strategy example

- If you use a framework (e.g. Spring) then it is even better to link a strategy to your enum
- E.g. if you add a value to StatusEnumWithStrategy you are forced to also add a color and a strategy
- No unit test is needed