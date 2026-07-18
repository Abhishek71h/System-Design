# What is a Design Pattern?

A **Design Pattern** is a proven and reusable solution to a commonly
occurring software design problem. It is **not code**, but a
**template/blueprint** that guides developers.

## Interview Definition

> "A design pattern is a reusable solution to a recurring software
> design problem. It provides a template for writing maintainable,
> scalable and loosely coupled code."

## Why use Design Patterns?

-   Write clean code
-   Improve maintainability
-   Increase reusability
-   Reduce code duplication
-   Follow SOLID principles
-   Make applications scalable and extensible

## Do Design Patterns guarantee clean code?

**No.**

Patterns only provide a good structure.

Clean code also depends on: - Naming conventions - SOLID principles -
Low coupling - High cohesion - Code reviews - Testing

Interview answer: \> Design patterns improve the probability of clean
code but cannot guarantee it.

------------------------------------------------------------------------

# Design Principles vs Design Patterns

  Design Principles            Design Patterns
  ---------------------------- -----------------------------
  Guidelines                   Ready solutions
  Abstract                     Concrete implementation
  Examples: SOLID, DRY, KISS   Singleton, Builder, Factory

------------------------------------------------------------------------

# Types of Design Patterns

1.  Creational
2.  Structural
3.  Behavioral

------------------------------------------------------------------------

# Singleton Design Pattern

## Definition

Ensures that only **one object** of a class exists throughout the
application.

## Real-life Examples

-   Logger
-   Configuration Manager
-   Database Connection
-   Cache
-   Spring Bean (Singleton scope)

## Implementation Steps

1.  Private constructor
2.  Static instance
3.  Public getInstance()

## Thread Safety Problem

Multiple threads can create multiple objects.

Solutions: - synchronized - Eager Initialization - Double Checked
Locking - Bill Pugh Singleton

### Double Checked Locking

Checks twice before creating object to avoid synchronization overhead.

------------------------------------------------------------------------

# Builder Design Pattern

## Problem

Suppose we want to build a House.

House contains

-   Roof
-   Wall
-   Door
-   Window
-   Paint

Using constructors becomes difficult.

Builder constructs object step by step.

## Participants

### Product

House

### Builder

HouseBuilder interface

### Concrete Builder

IglooHouseBuilder

### Director

CivilEngineer

## Flow

Client

↓

CivilEngineer

↓

HouseBuilder

↓

House

## Advantages

-   Step-by-step construction
-   Readable
-   Optional parameters
-   Immutable objects

Interview: **Difference between Builder and Factory?**

Factory: Creates object in one step.

Builder: Creates complex object step by step.

------------------------------------------------------------------------

# Factory Method Pattern

## Definition

Defines an interface for object creation but lets subclasses decide
which object to instantiate.

Instead of writing

``` java
if(type=="Dog") new Dog();
else if(type=="Cat") new Cat();
else new Lion();
```

Factory hides this logic.

## Example

Animal

↓

Dog

Cat

Lion

AnimalFactory

↓

RandomFactory

BalanceFactory

## Advantages

-   Removes if-else
-   Open for extension
-   Loose coupling

------------------------------------------------------------------------

# Asteroid Game Example

Obstacle

↓

Asteroid

ObstacleFactory

↓

AsteroidFactory

Game only requests

``` java
factory.createObstacle();
```

Factory decides object creation.

------------------------------------------------------------------------

# Electricity Bill Example

Abstract Class

Plan

Subclasses

-   DomesticPlan
-   CommercialPlan
-   IndustrialPlan

Factory returns appropriate plan.

------------------------------------------------------------------------

# Frequently Asked Interview Questions

## What is a Design Pattern?

Reusable solution for recurring software design problems.

## Difference between Design Principle and Design Pattern?

Principle = Guideline

Pattern = Implementation template.

## Why Singleton?

To ensure only one object exists.

Examples: Logger, Configuration, Database Connection.

## Why Builder?

Complex objects having many configurations.

## Why Factory Method?

Remove object creation logic from client.

## Factory vs Builder

Factory: Creates object.

Builder: Constructs complex object.

## Builder Participants

-   Product
-   Builder
-   Concrete Builder
-   Director
-   Client
