# Event Planner

Helps users to plan for an event by tracking event related tasks and estimating total costs based on activities provided and number of users attending.

This is an Epicodus friday project for Java that focuses on behavior testing, encapsulated classes, getter methods, and proper usage of .gitignore.

## Getting Started

To run this application you will need to clone/download the contents of the repository and compile them through IntelliJ IDEA.

Once the application is running, follow the console prompts.

### Prerequisites

You will need the following packages and software installed:

```
Java JDK 1.8.0_151
JAVA JRE 1.8.0_151
IntelliJ IDEA
```
### Specifications
| Behavior | Input | Expected Behavior |
| :------------- | :------------- | :------------- |
| Asks for event information | "How many guests?"  | Adds number of guests to the event |
| Calculate costs based on event information | 300 Guests, Pizza, Food, Bands | Example calculations: $3200 |
| Asks for coupons to be entered and reduce total cost | Entering coupons FreeDJ and 25Off from a total cost of $3200 | Results in: $2975 |
| Asks for correct input type if user enters invalid input | Entering a "five" for number of guests | Results in "Please enter a number." |

## Built With

* [IntelliJ IDEA](https://www.jetbrains.com/idea/) - JAVA IDE

## Authors

* **Byron Chang** - [thebyronc](https://github.com/thebyronc/)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
