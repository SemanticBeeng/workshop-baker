![](workshop.jpg)

---

# Workshop Agenda
## Why Baker? (10 min.)
## Develop an Intuition for Baker (15 min.)
## Implement a Web Shop Flow (25 min.)

---

# Why Baker?

---

## Our Challenge
### Interact with 12 Different Systems
### A Flow of 27 Steps
### From 2 minutes to 6 hours

---

## Requirements
### TIBCO is contained
### Java developers
### State in two data-centres
### Systems fail all the time

---

| Current Account | Savings Account | Customer Onboarding |
| :--- | :---: | ---: |
| Verify Identity | Verify Identity | Verify Identity |
| Register Individual | Register Individual | Register Individual |
| Open *Current* Account | Open *Savings* Account | `n/a` |
| Issue Debit Card | `n/a` | `n/a` |
| Send Message | Send Message | Send Message |
| Register Ownership | Register Ownership | `n/a` |

---

![original 270%](baker.png)

---
## Baker is a Scala Library
### Declare the Logic Like a Recipe
### Visualize the Logic
### Don't Worry About Retries and State
### Re-use What's Already There

---

![left](donuts.jpg)

# Recipes
## Interactions
## Ingredients
## Events

---
# What is an Interaction?
## It's where you put your system calls
## Capability, not a technical call

---
# What is an Ingredient?
## It's a container for data
## Can be a primitive type or a POJO

---
# What is an Event?
## It's what happens
## Sensory and System Events

---
# Hands-On
## Setup
## Web-shop Flow
## Closing Remarks and Retro

---
[.background-color: #FFFFFF]
![fit](validate-order.png)

---
[.background-color: #FFFFFF]
![fit](manufacture-goods.png)

---
[.background-color: #FFFFFF]
![fit](ship-goods.png)

---
[.background-color: #FFFFFF]
![fit](send-invoice.png)

---
## Exercises
1. Put all interactions in the recipe
2. Include sensory events in the recipe, use withSensoryEvents()
3. Add extra conditions when an interaction must be executed, use 
4. Change the customerInfo class from String to a POJO

---
# What Can Go Wrong?

---
[.background-color: #FFFFFF]
![left, fit](no-sensory-input.png)

# Recipe has no sensory input, Baker doesn't know where the data comes from

---
[.background-color: #FFFFFF]
![left, fit](incorrect-sequence.png)

# Which two interactions will be executed when the OrderPlaced event occurs? Is this the desired behavior? 

---
[.background-color: #FFFFFF]
![fit](desired-end-result.png)

---
# Food for Thought
- What to do when the order is invalid?
	- Baker helps developers think about rainy-day scenarios
- What if systems fails, what is desired?
	- See withFailureStrategy(), withDefaultFailureStrategy() methods and InteractionFailureStrategy class
- Event-driven Architecture

---
# Good to Know

---

## Short-lived vs. long-running flows

---

## State is taken care of:

- Cassandra for persistent storage
- Ingredients encrypted by default
- State recovered automatically
- Configurable Time-to-live

---

## When failure occurs:

- Baker retries technical failures with exponential backoff
- Works well with **idempotent** services
- Deal with functional failure in your recipe

---

## Baker Catalogue: Some Stats
### Internal ING library
### 80+ Re-usable Interactions
### 10+ Teams Using Baker

---

![](reachability.png)

---

![](unreachable.png)

---

![](dead-code.png)

---

## Baker vs. PEGA

| Baker | PEGA |
| :--- | :---: |
| Computer | Computer + Human |
| Focused on APIs | Focused on processes |
| No License Costs | License Costs |
| No Usage Costs | Pay per Case Costs |
| For Java Developers | For PEGA Specialists |
| From ING | From PEGA |
