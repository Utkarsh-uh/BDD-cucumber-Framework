Feature: Search and place the order for Products
@OffersPage
Scenario Outline: Search experience for product search in both home and offers page

Given User is on Greencart landing page
When User searched with shortname <Name> and extracted actual name of product
Then User searched for <Name> shortname in offers page
And Validate product name in offers page matches with Landing page


Examples:
| Name |
| Tom  |
| Beet |


