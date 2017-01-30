Feature: Search a place to buy at Morgantown, WV and validate on the list page and details page


@test1

  Scenario Outline: Search a place and validate the number of listings and price of a place as per index
    Given the browser as "<browserType>"
    Given the page is open "<url>"
    When I search for "<place>"
    Then validate the number of listing to be greater than "<numberOfListings>"
	When Reading the price on list page and clicking on link of item "<sequenceNumber>"
  	Then validate the price of listing on details page to be same as that of list page
    
     Examples: 
   |url                    |browserType  | place            | numberOfListings | sequenceNumber     | 
   |http://www.realtor.com |     ff      | Morgantown, WV   | 0                |      2             |
   |http://www.realtor.com | chrome      | Morgantown, WV   | 0                |      2             |
#   |http://www.realtor.com | edge        | Morgantown, WV   | 0                |      2             |
