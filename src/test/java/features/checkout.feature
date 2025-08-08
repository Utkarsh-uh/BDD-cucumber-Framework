Feature: place the order for Products
@PlaceOrder
Scenario Outline: Search experience for product search in both home and offers page

Given User is on Greencart landing page
When User searched with shortname <Name> and extracted actual name of product
And Added "3" items of the Selected product to cart
Then User Proceeds to checkout and validate the <Name> items in checkout page
And Verify user has ability to enter promocode and Place the order

Examples:
| Name |
| Tom  |



