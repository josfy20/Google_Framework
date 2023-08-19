Feature: searching products

Scenario Outline: searching products in google

Given i am on the google homepage 

When i enter the "<Product _name>" in the search bar
And i click on the search button


Then i can see the search result successfully


Examples:
|Product _name|
|Computer|
|Toy|